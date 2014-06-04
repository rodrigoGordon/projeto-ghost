/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.mack.pi2.ejb;

import br.mack.pi2.Services.ConectorDAO;
import br.mack.pi2.ejb.interfaces.UsuarioRemote;
import br.mack.pi2.jpa.Usuario;
import java.util.ArrayList;
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
    public ArrayList<Usuario> loginUsuario(String login, String senha) {
       String query = "select * from tblUsuario u where u.nomeUser='"+login+"' and u.pass='"+senha+"'";
        Query q = em.createQuery(query);
        ArrayList<Usuario> listUsuario = (ArrayList<Usuario>)q.getResultList();
        return listUsuario;  
    }
}
