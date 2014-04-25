/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.mack.pi2.jpa;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;

/**
 *
 * @author MichelOh
 */
@Entity
public class Unidade_Academica implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id_UA", length = 10, unique = true)
    private String id_UA;
    
    @Column (name = "nome_UA", length = 50)
    private String nome_UA;
    
    @OneToMany (fetch = FetchType.LAZY, mappedBy = "unidade_academica")
    private Set<Aluno> aluno = new HashSet<Aluno>(0);

    public String getId_UA() {
        return id_UA;
    }

    public void setId_UA(String id_UA) {
        this.id_UA = id_UA;
    }
    
    public Set<Aluno> getAluno() {
        return aluno;
    }

    public void setAluno(Set<Aluno> aluno) {
        this.aluno = aluno;
    }

    public String getNome_UA() {
        return nome_UA;
    }

    public void setNome_UA(String nome_UA) {
        this.nome_UA = nome_UA;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id_UA != null ? id_UA.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id_UA fields are not set
        if (!(object instanceof Unidade_Academica)) {
            return false;
        }
        Unidade_Academica other = (Unidade_Academica) object;
        if ((this.id_UA == null && other.id_UA != null) || (this.id_UA != null && !this.id_UA.equals(other.id_UA))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.mack.pi2.jpa.Unidade_Academica[ id=" + id_UA + " ]";
    }

}
