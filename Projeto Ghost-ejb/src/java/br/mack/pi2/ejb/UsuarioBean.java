/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.mack.pi2.ejb;

import br.mack.pi2.Services.ConectorDAO;
import br.mack.pi2.ejb.interfaces.UsuarioRemote;
import br.mack.pi2.jpa.Usuario;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author michel.oh
 */
@Stateless (mappedName = "UsuarioDAO", name = "UsuarioDAO")
public class UsuarioBean implements UsuarioRemote {
    
    private EntityManager em;
    
    public UsuarioBean() {
        em = ConectorDAO.getInstance().getConnection();
    }

    @Override
    public boolean insereUsuario(Usuario user) {
        if(em.find(Usuario.class, user.getIdUser()) == null) {
            em.getTransaction().begin();
            em.persist(user);
            em.getTransaction().commit();
            return true;
        }
        return false;
    }

    @Override
    public boolean modificaUsuario(Usuario user) {
        em.getTransaction().begin();
        em.merge(user);
        em.getTransaction().commit();
        return true;
    }

    @Override
    public boolean deletaUsuario(Usuario user) {
        em.getTransaction().begin();
        em.remove(user);
        em.getTransaction().commit();
        return true;
    }

    @Override
    public Usuario getUsuario(int id) {
        return em.find(Usuario.class, id);
    }

    @Override
    public List<Usuario> getAllUsuario() {
        return em.createNamedQuery("Usuario.getAll", Usuario.class).getResultList();
    }

    @Override
    public List<Usuario> loginUsuario(String login, String senha) {
        //SELECT e FROM Evento e JOIN e.idLocal a
        //String query = "select u from Usuario u JOIN u.tipo_user JOIN u.aluno JOIN u.professor where u.nomeUser like '"+login+"' and u.pass like '"+senha+"'";
         String query = "select u from Usuario u  where u.nomeUser like '"+login+"' and u.pass like '"+senha+"'";
        Query q = em.createQuery(query);
        List<Usuario> listUsuario = (List<Usuario>)q.getResultList();
        //listUsuario.get(0).setPass(" ");
        return listUsuario;  
    }
}
