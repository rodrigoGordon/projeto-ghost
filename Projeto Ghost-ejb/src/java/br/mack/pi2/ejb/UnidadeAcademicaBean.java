/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.mack.pi2.ejb;

import br.mack.pi2.Services.ConectorDAO;
import br.mack.pi2.ejb.interfaces.UnidadeAcademicaRemote;
import br.mack.pi2.jpa.Unidade_Academica;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;

/**
 *
 * @author alvarowf
 */
@Stateless (mappedName = "UADAO", name = "UADAO")
public class UnidadeAcademicaBean implements UnidadeAcademicaRemote {

    private EntityManager em;
    
    public UnidadeAcademicaBean() {
        em = ConectorDAO.getInstance().getConnection();
    }

    @Override
    public boolean insereUA(Unidade_Academica ua) {
        if(em.find(Unidade_Academica.class, ua.getId_UA()) == null) {
            em.getTransaction().begin();
            em.persist(ua);
            em.getTransaction().commit();
            return true;
        }
        return false;
    }

    @Override
    public boolean modificaUA(Unidade_Academica ua) {
        em.getTransaction().begin();
        em.merge(ua);
        em.getTransaction().commit();
        return true;
    }

    @Override
    public boolean deletaUA(Unidade_Academica ua) {
        em.getTransaction().begin();
        em.remove(ua);
        em.getTransaction().commit();
        return true;
    }

    @Override
    public Unidade_Academica getUA(String id) {
        return em.find(Unidade_Academica.class, id);
    }

    @Override
    public List<Unidade_Academica> getAllUA() {
        return em.createNamedQuery("UA.getAll", Unidade_Academica.class).getResultList();
    }
}
