/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.mack.pi2.ejb;


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
    
    private Aluno aluno;
    private List<Aluno>alunoList;

    
    
    EntityManagerFactory  factory;
    
    /*nao usar o @PersistenceContext senao vai dar pau no deploy
    fazer da forma que esta no metodo setUp()*/
    EntityManager em;
    
    @Override
    public void setUp() {
        factory = Persistence.createEntityManagerFactory("Projeto_Ghost-ejbPU");
        em = factory.createEntityManager();
    }
    @Override
    public void insereAluno(Aluno aluno){
        
        aluno.getTIA();
        aluno.getNomeAluno();
        aluno.getCurso();
        aluno.getPeriodo();
        aluno.getId_UA();
        
        em.persist(aluno);
                
    }
    
    public String execute() throws Exception {
        /*
        try {
           // this.alunoList = alunoManager.findAllAlunos();
        } catch (Exception e){
            e.printStackTrace();
        }
        */
        return "*";
    }
    
    public String add(){
        /*
        try{
            alunoManager.createContact(getAluno());
        } catch (Exception e){
            e.printStackTrace();
        }
        
        try{
            this.alunoList = alunoManager.findAllAlunos();
        } catch (Exception e){
            e.printStackTrace();
        }
        */
        return "*";
    }
    
    public String delete(){
        /*
        try{
            alunoManager.deleteAluno((long)aluno.getTIA());
        } catch(Exception e){
            e.printStackTrace();
        }
        */
        return "*";
    }
    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    /**
     * @return the alunoList
     */
    public List<Aluno> getAlunoList() {
        return alunoList;
    }

    /**
     * @param alunoList the alunoList to set
     */
    public void setAlunoList(List<Aluno> alunoList) {
        this.alunoList = alunoList;
    }

  
    /**
     * @return the aluno
     */
    public Aluno getAluno() {
        return aluno;
    }

    /**
     * @param aluno the aluno to set
     */
    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
    
    

}
