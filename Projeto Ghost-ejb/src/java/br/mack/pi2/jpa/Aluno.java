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
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "tia")
    private int TIA;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Unidade_Academica_id_UA", nullable = true)
    private Unidade_Academica id_UA;
    @Column (name = "nomeAluno", length = 100)
    private String nomeAluno;
    @Column (name = "curso", length = 50)
    private String curso;
    @Column (name = "periodo", length = 10)
    private String periodo;

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

    public Unidade_Academica getId_UA() {
        return id_UA;
    }

    public void setId_UA(Unidade_Academica id_UA) {
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

}
