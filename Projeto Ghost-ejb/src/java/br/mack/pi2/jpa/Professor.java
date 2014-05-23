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
@Table (name = "professor")
public class Professor implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private int drt;
    
    @ManyToOne (fetch = FetchType.LAZY,targetEntity = Unidade_Academica.class)
    @JoinColumn(name = "Unidade_Academica_id_UA")
    private Unidade_Academica id_UA;
    
    @Column (name = "nomeProf", length = 100)
    private String nomeProf;
    @Column (name = "tipo_prof", length = 3)
    private String tipoProf;

    public int getDrt() {
        return drt;
    }

    public void setDrt(int drt) {
        this.drt = drt;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) drt;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the drt fields are not set
        if (!(object instanceof Professor)) {
            return false;
        }
        Professor other = (Professor) object;
        if (this.drt != other.drt) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.mack.pi2.jpa.Professor[ id=" + drt + " ]";
    }

    /**
     * @return the nomeProf
     */
    public String getNomeProf() {
        return nomeProf;
    }

    /**
     * @param nomeProf the nomeProf to set
     */
    public void setNomeProf(String nomeProf) {
        this.nomeProf = nomeProf;
    }

    /**
     * @return the tipoProf
     */
    public String getTipoProf() {
        return tipoProf;
    }

    /**
     * @param tipoProf the tipoProf to set
     */
    public void setTipoProf(String tipoProf) {
        this.tipoProf = tipoProf;
    }

    /**
     * @return the id_UA
     */
    public Unidade_Academica getId_UA() {
        return id_UA;
    }

    /**
     * @param id_UA the id_UA to set
     */
    public void setId_UA(Unidade_Academica id_UA) {
        this.id_UA = id_UA;
    }
    
}
