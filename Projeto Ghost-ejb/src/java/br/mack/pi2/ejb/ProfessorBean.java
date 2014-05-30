/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.mack.pi2.ejb;

import br.mack.pi2.Services.ConectorDAO;
import br.mack.pi2.ejb.interfaces.ProfessorRemote;
import br.mack.pi2.jpa.Professor;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;

/**
 *
 * @author alvarowf
 */
@Stateless (mappedName = "professorDAO", name = "professorDAO")
public class ProfessorBean implements ProfessorRemote {

    private EntityManager em;
    
    public ProfessorBean() {
        em = ConectorDAO.getInstance().getConnection();
    }

    @Override
    public boolean insereProfessor(Professor prof) {
        if(em.find(Professor.class, prof.getDrt()) == null) {
            em.getTransaction().begin();
            em.persist(prof);
            em.getTransaction().commit();
            return true;
        }
        return false;
    }

    @Override
    public boolean modificaProfessor(Professor prof) {
        em.getTransaction().begin();
        em.merge(prof);
        em.getTransaction().commit();
        return true;
    }

    @Override
    public boolean deletaProfessor(Professor prof) {
        em.getTransaction().begin();
        em.remove(prof);
        em.getTransaction().commit();
        return true;
    }

    @Override
    public Professor getProfessor(int drt) {
        return em.find(Professor.class, drt);
    }

    @Override
    public List<Professor> getAllProfessor() {
        return em.createNamedQuery("Professor.getAll", Professor.class).getResultList();
    }
}
