/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.mack.pi2.controller;

import br.mack.pi2.ejb.interfaces.GenericDAO;
import br.mack.pi2.jpa.Aluno;
import java.util.List;

/**
 *
 * @author alvarowf
 */
public class AlunoManager {
    
    private GenericDAO<Aluno, Long>alunoDAO;
    
    public List<Aluno>getAllContacts(){
        return this.alunoDAO.getAll();
    }
    
    public Aluno createContact(Aluno aluno){
        return this.alunoDAO.create(aluno);
    }
    
    public Aluno updateAluno(Aluno aluno){
        return this.alunoDAO.save(aluno);
    }
    
    public Aluno findAluno(Long id){
        return this.alunoDAO.findById(id);
    }
    
    public void deleteAluno(Long id){
         this.alunoDAO.delete(findAluno(id));
    }
    
    public List<Aluno> findAllAlunos(){
        return this.alunoDAO.getAll();
    }
    
    public void setAlunoDAO(GenericDAO<Aluno, Long> alunoDAO){
        this.alunoDAO = alunoDAO;
    }
    
}
