/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.mack.pi2.Beans;

import br.mack.pi2.Sessions.AlunoCRUD;
import br.mack.pi2.jpa.Aluno;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

/**
 *
 * @author michel.oh
 */
@Stateless
@LocalBean
public class AlunoBean implements AlunoCRUD{
    
    private Aluno aluno;

    EntityManagerFactory  factory;
    
    @PersistenceContext EntityManager em;
    
    public void setUp() {
        factory = Persistence.createEntityManagerFactory("Projeto_Ghost-ejbPU");
        em = factory.createEntityManager();
    }
    public void insereAluno(Aluno aluno){
        
        aluno.getTIA();
        aluno.getNomeAluno();
        aluno.getCurso();
        aluno.getPeriodo();
        aluno.getId_UA();
        
        em.persist(aluno);
                
    }
    
    
    
    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    

}
