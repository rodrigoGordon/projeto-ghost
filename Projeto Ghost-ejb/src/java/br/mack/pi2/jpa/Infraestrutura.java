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
@Entity (name = "infraestrutura")
public class Infraestrutura implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name = "idEstrutura")
    private int idEstrutura;
    
    @Column (name = "nomeEstrutura", length = 50)
    private String nomeEstrutura;
    @Column (name = "descEstrutura", length = 100)
    private String descEstrutura;
    @Column (name = "tipoEstrutura")
    private int tipoEstrutura;
    @Column (name = "valor")
    private float valor;

    public int getIdEstrutura() {
        return idEstrutura;
    }

    public void setIdEstrutura(int idEstrutura) {
        this.idEstrutura = idEstrutura;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idEstrutura;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the idEstrutura fields are not set
        if (!(object instanceof Infraestrutura)) {
            return false;
        }
        Infraestrutura other = (Infraestrutura) object;
        if (this.idEstrutura != other.idEstrutura) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.mack.pi2.jpa.Infraestrutura[ id=" + idEstrutura + " ]";
    }

    /**
     * @return the nomeEstrutura
     */
    public String getNomeEstrutura() {
        return nomeEstrutura;
    }

    /**
     * @param nomeEstrutura the nomeEstrutura to set
     */
    public void setNomeEstrutura(String nomeEstrutura) {
        this.nomeEstrutura = nomeEstrutura;
    }

    /**
     * @return the descEstrutura
     */
    public String getDescEstrutura() {
        return descEstrutura;
    }

    /**
     * @param descEstrutura the descEstrutura to set
     */
    public void setDescEstrutura(String descEstrutura) {
        this.descEstrutura = descEstrutura;
    }

    /**
     * @return the tipoEstrutura
     */
    public int getTipoEstrutura() {
        return tipoEstrutura;
    }

    /**
     * @param tipoEstrutura the tipoEstrutura to set
     */
    public void setTipoEstrutura(int tipoEstrutura) {
        this.tipoEstrutura = tipoEstrutura;
    }

    /**
     * @return the valor
     */
    public float getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(float valor) {
        this.valor = valor;
    }
    
}
