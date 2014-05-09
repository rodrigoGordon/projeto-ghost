/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.mack.pi2.ejb.interfaces;

import br.mack.pi2.jpa.Aluno;
import javax.ejb.Remote;

/**
 *
 * @author michel.oh
 */
@Remote
public interface AlunoRemote {
    public void setUp();
    public void insereAluno(Aluno aluno) throws Exception;
}
