/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.mack.pi2.bean;

import br.mack.pi2.jpa.Aluno;

/**
 *
 * @author michel.oh
 */
public interface AlunoCRUDInt {
    public void setUp();
    public void insereAluno(Aluno aluno) throws Exception;
}
