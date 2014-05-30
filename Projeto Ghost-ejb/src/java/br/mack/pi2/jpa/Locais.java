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
@Table (name = "Locais")
public class Locais implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name = "idLocal")
    private int idLocal;
    
    @Column (name = "nomeLocal", length = 50)
    private String nomeLocal;
    @Column (name = "descLocal", length = 100)
    private String descLocal;
    @Column (name = "capacidade")
    private int capacidade;
    @Column (name = "predio")
    private int predio;
    @Column (name = "valor")
    private float valor;
    
    public int getIdLocal() {
        return idLocal;
    }

    public void setIdLocal(int idLocal) {
        this.idLocal = idLocal;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idLocal;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the idLocal fields are not set
        if (!(object instanceof Locais)) {
            return false;
        }
        Locais other = (Locais) object;
        if (this.idLocal != other.idLocal) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.mack.pi2.jpa.Locais[ id=" + idLocal + " ]";
    }

    /**
     * @return the nomeLocal
     */
    public String getNomeLocal() {
        return nomeLocal;
    }

    /**
     * @param nomeLocal the nomeLocal to set
     */
    public void setNomeLocal(String nomeLocal) {
        this.nomeLocal = nomeLocal;
    }

    /**
     * @return the descLocal
     */
    public String getDescLocal() {
        return descLocal;
    }

    /**
     * @param descLocal the descLocal to set
     */
    public void setDescLocal(String descLocal) {
        this.descLocal = descLocal;
    }

    /**
     * @return the capacidLocalade
     */
    public int getCapacidade() {
        return capacidade;
    }

    /**
     * @param capacidade the capacidLocalade to set
     */
    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    /**
     * @return the predio
     */
    public int getPredio() {
        return predio;
    }

    /**
     * @param predio the predio to set
     */
    public void setPredio(int predio) {
        this.predio = predio;
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
