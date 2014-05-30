/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.mack.pi2.ejb;


import br.mack.pi2.Services.ConectorDAO;
import br.mack.pi2.ejb.interfaces.AlunoRemote;
import br.mack.pi2.jpa.Aluno;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


/**
 *
 * @author michel.oh
 */
@Stateless (mappedName = "alunoDAO", name = "alunoDAO")
public class AlunoBean implements AlunoRemote{

    /*nao usar o @PersistenceContext senao vai dar pau no deploy
    fazer da forma que esta no construtor*/
    EntityManager em;
    
    public AlunoBean() {
        em = ConectorDAO.getInstance().getConnection();
    }
    
    @Override
    public boolean insereAluno(Aluno aluno) throws Exception {
        
        if (em.find(Aluno.class, aluno.getTIA()) == null) {        
            em.getTransaction().begin();
            em.persist(aluno);
            em.getTransaction().commit();
            return true;
        }
        return false;
    }

    @Override
    public boolean modificaAluno(Aluno aluno) throws Exception {
        em.getTransaction().begin();
        em.merge(aluno);
        em.getTransaction().commit();
        return true;
    }

    @Override
    public boolean deletaAluno(Aluno aluno) throws Exception {
        em.getTransaction().begin();
        em.remove(aluno);
        em.getTransaction().commit();
        return true;
    }

    @Override
    public Aluno getAluno(int tia) throws Exception {
        return em.find(Aluno.class, tia);
    }

    @Override
    public List<Aluno> getAllAluno() throws Exception {
        return em.createNamedQuery("Aluno.getAll", Aluno.class).getResultList();
    }
    
}
