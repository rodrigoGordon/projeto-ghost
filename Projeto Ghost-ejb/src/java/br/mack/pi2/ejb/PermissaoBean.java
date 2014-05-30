/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.mack.pi2.ejb;

import br.mack.pi2.Services.ConectorDAO;
import br.mack.pi2.ejb.interfaces.PermissaoRemote;
import br.mack.pi2.jpa.Permissao;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;

/**
 *
 * @author alvarowf
 */
@Stateless (mappedName = "permissaoDAO", name = "permissaoDAO")
public class PermissaoBean implements PermissaoRemote {

    private EntityManager em;
    
    public PermissaoBean() {
        em = ConectorDAO.getInstance().getConnection();
    }

    @Override
    public boolean inserePermissao(Permissao auth) {
        if(em.find(Permissao.class, auth.getId()) == null) {
            em.getTransaction().begin();
            em.persist(auth);
            em.getTransaction().commit();
            return true;
        }
        return false;
    }

    @Override
    public boolean modificaPermissao(Permissao auth) {
        em.getTransaction().begin();
        em.merge(auth);
        em.getTransaction().commit();
        return true;
    }

    @Override
    public boolean deletaPermissao(Permissao auth) {
        em.getTransaction().begin();
        em.remove(auth);
        em.getTransaction().commit();
        return true;
    }

    @Override
    public Permissao getPermissao(int id) {
        return em.find(Permissao.class, id);
    }

    @Override
    public List<Permissao> getAllPermissao() {
        return em.createNamedQuery("Permissao.getAll", Permissao.class).getResultList();
    }
    
}
