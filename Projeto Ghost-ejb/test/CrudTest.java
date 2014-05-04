/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import br.mack.pi2.Beans.AlunoBean;
import br.mack.pi2.jpa.Aluno;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author alvarowf
 */
public class CrudTest {
    
    public static void main (String[]args){
        Aluno aluno = new Aluno();
        AlunoBean alunoCrud = new AlunoBean();
                
        aluno.setCurso("Sistemas");
        aluno.setId_UA(null);
        aluno.setPeriodo("Tarde");
        aluno.setTIA(01);
        aluno.setNomeAluno("Alvaro");
        
        alunoCrud.insereAluno(aluno);
    }
    
    public CrudTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
