/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.mack.pi2.ejb.interfaces;

import br.mack.pi2.jpa.Aluno;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author michel.oh
 */
@Remote
public interface AlunoRemote {
    public boolean insereAluno(Aluno aluno) throws Exception;
    public boolean modificaAluno(Aluno aluno) throws Exception;
    public boolean deletaAluno(Aluno aluno) throws Exception;
    public Aluno getAluno(int tia) throws Exception;
    public List<Aluno> getAllAluno() throws Exception;
}
