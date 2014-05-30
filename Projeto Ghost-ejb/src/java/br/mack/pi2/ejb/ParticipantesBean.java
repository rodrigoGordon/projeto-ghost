/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.mack.pi2.ejb;

import br.mack.pi2.Services.ConectorDAO;
import br.mack.pi2.ejb.interfaces.ParticipantesRemote;
import br.mack.pi2.jpa.Participantes;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;

/**
 *
 * @author alvarowf
 */
@Stateless (mappedName = "particDAO", name = "particDAO")
public class ParticipantesBean implements ParticipantesRemote {

    private EntityManager em;
    
    public ParticipantesBean() {
        em = ConectorDAO.getInstance().getConnection();
    }

    @Override
    public boolean insereParticipante(Participantes part) {
        if(em.find(Participantes.class, part.getId()) == null) {
            em.getTransaction().begin();
            em.persist(part);
            em.getTransaction().commit();
            return true;
        }
        return false;
    }

    @Override
    public boolean modificaParticipante(Participantes part) {
        em.getTransaction().begin();
        em.merge(part);
        em.getTransaction().commit();
        return true;
    }

    @Override
    public boolean deletaParticipante(Participantes part) {
        em.getTransaction().begin();
        em.remove(part);
        em.getTransaction().commit();
        return true;
    }

    @Override
    public Participantes getParticipante(int id) {
        return em.find(Participantes.class, id);
    }

    @Override
    public List<Participantes> getAllParticipantes() {
        return em.createNamedQuery("Participantes.getAll", Participantes.class).getResultList();
    }
}
