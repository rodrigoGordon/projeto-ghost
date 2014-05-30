/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.mack.pi2.ejb.interfaces;

import br.mack.pi2.jpa.Professor;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author michel.oh
 */
@Remote
public interface ProfessorRemote {
    public boolean insereProfessor(Professor prof);
    public boolean modificaProfessor(Professor prof);
    public boolean deletaProfessor(Professor prof);
    public Professor getProfessor(int drt);
    public List<Professor> getAllProfessor();
}
