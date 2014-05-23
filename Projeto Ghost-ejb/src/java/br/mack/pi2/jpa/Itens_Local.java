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
@Table (name = "itens_local")
public class Itens_Local implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name = "idItens_Local")
    private int idItensLocal;
    
    @Column (name = "nome_item", length = 50)
    private String nomeItem;
    @Column (name = "desc_item", length = 100)
    private String descItem;
    @Column (name = "quantidade")
    private int qtd;

    @ManyToOne (fetch = FetchType.LAZY,targetEntity = Locais.class)
    @JoinColumn(name="Locais_idLocal")
    private Locais idLocal;
    
    public int getIdItensLocal() {
        return idItensLocal;
    }

    public void setIdItensLocal(int idItensLocal) {
        this.idItensLocal = idItensLocal;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idItensLocal;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the idItensLocal fields are not set
        if (!(object instanceof Itens_Local)) {
            return false;
        }
        Itens_Local other = (Itens_Local) object;
        if (this.idItensLocal != other.idItensLocal) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.mack.pi2.jpa.Itens_Local[ id=" + idItensLocal + " ]";
    }

    /**
     * @return the nomeItem
     */
    public String getNomeItem() {
        return nomeItem;
    }

    /**
     * @param nomeItem the nomeItem to set
     */
    public void setNomeItem(String nomeItem) {
        this.nomeItem = nomeItem;
    }

    /**
     * @return the descItem
     */
    public String getDescItem() {
        return descItem;
    }

    /**
     * @param descItem the descItem to set
     */
    public void setDescItem(String descItem) {
        this.descItem = descItem;
    }

    /**
     * @return the qtd
     */
    public int getQtd() {
        return qtd;
    }

    /**
     * @param qtd the qtd to set
     */
    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    /**
     * @return the idLocal
     */
    public Locais getIdLocal() {
        return idLocal;
    }

    /**
     * @param idLocal the idLocal to set
     */
    public void setIdLocal(Locais idLocal) {
        this.idLocal = idLocal;
    }
    
}
