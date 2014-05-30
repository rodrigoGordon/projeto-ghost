/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.mack.pi2.jpa;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author MichelOh
 */
@Entity 
@Table (name = "usuario")
@NamedQueries({
    @NamedQuery(name = "Usuario.getAll", query = "SELECT a FROM Usuario a")})
public class Usuario implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private int idLogin;
    
    @Column (name = "nomeUser", length = 10)
    private String nomeUser;
    @Column (name = "email", length = 100)
    private String email;
    @Column (name = "rg")
    private int rg;
    @Column (name = "pass", length = 16)
    private int pass; //valor binario: colocar 0b no numero
    
    @ManyToOne (fetch = FetchType.LAZY,targetEntity = Permissao.class)
    @JoinColumn (name="Permissao_tipo_user")
    private Permissao tipo_user;
    
    @ManyToOne (fetch = FetchType.LAZY,targetEntity = Aluno.class)
    @JoinColumn (name = "TIA", nullable = true)
    private Aluno aluno;
    
    @ManyToOne (fetch = FetchType.LAZY,targetEntity = Professor.class)
    @JoinColumn (name = "DRT", nullable = true)
    private Professor professor;
    
    public int getIdLogin() {
        return idLogin;
    }

    public void setIdLogin(int idLogin) {
        this.idLogin = idLogin;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idLogin;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the idLogin fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if (this.idLogin != other.idLogin) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.mack.pi2.jpa.Usuario[ id=" + idLogin + " ]";
    }

    /**
     * @return the nomeUser
     */
    public String getNomeUser() {
        return nomeUser;
    }

    /**
     * @param nomeUser the nomeUser to set
     */
    public void setNomeUser(String nomeUser) {
        this.nomeUser = nomeUser;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the rg
     */
    public int getRg() {
        return rg;
    }

    /**
     * @param rg the rg to set
     */
    public void setRg(int rg) {
        this.rg = rg;
    }

    /**
     * @return the pass
     */
    public int getPass() {
        return pass;
    }

    /**
     * @param pass the pass to set
     */
    public void setPass(int pass) {
        this.pass = pass;
    }

    /**
     * @return the tipo_user
     */
    public Permissao getTipo_user() {
        return tipo_user;
    }

    /**
     * @param tipo_user the tipo_user to set
     */
    public void setTipo_user(Permissao tipo_user) {
        this.tipo_user = tipo_user;
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

    /**
     * @return the professor
     */
    public Professor getProfessor() {
        return professor;
    }

    /**
     * @param professor the professor to set
     */
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    
}
