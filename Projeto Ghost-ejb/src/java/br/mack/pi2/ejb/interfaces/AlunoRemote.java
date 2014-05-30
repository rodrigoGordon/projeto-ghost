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
    public boolean insereAluno(Aluno aluno);
    public boolean modificaAluno(Aluno aluno);
    public boolean deletaAluno(Aluno aluno);
    public Aluno getAluno(int tia);
    public List<Aluno> getAllAluno();
}
