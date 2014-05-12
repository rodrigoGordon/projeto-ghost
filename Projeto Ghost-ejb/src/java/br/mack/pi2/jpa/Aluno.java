/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.mack.pi2.jpa;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author MichelOh
 */
@Entity
@Table (name = "aluno")
public class Aluno implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "TIA")
    private int TIA;
    
    @Column (name = "Unidade_Academica_id_UA", length = 10)
    private String id_UA;
    @Column (name = "nomeAluno", length = 100)
    private String nomeAluno;
    @Column (name = "curso", length = 50)
    private String curso;
    @Column (name = "periodo", length = 10)
    private String periodo;

    @ManyToOne(fetch = FetchType.LAZY,targetEntity = Unidade_Academica.class)
    private Unidade_Academica unidadeAcademica;
    
    public int getTIA() {
        return TIA;
    }

    public void setTIA(int TIA) {
        this.TIA = TIA;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }
    
    public String getNomeAluno() {
        return nomeAluno;
    }

    public String getId_UA() {
        return id_UA;
    }

    public void setId_UA(String id_UA) {
        this.id_UA = id_UA;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) TIA;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Aluno)) {
            return false;
        }
        Aluno other = (Aluno) object;
        if (this.TIA != other.TIA) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.mack.pi2.jpa.Aluno[ id=" + TIA + ", nomeAluno =" + nomeAluno + ", curso=" + curso + ", periodo=" + periodo + " ]";
    }

    /**
     * @return the unidadeAcademica
     */
    public Unidade_Academica getUnidadeAcademica() {
        return unidadeAcademica;
    }

    /**
     * @param unidadeAcademica the unidadeAcademica to set
     */
    public void setUnidadeAcademica(Unidade_Academica unidadeAcademica) {
        this.unidadeAcademica = unidadeAcademica;
    }

}
