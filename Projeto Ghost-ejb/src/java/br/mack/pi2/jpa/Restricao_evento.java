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
@Table (name = "restricao_evento")
public class Restricao_evento implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name = "idRestricao_Evento")
    private int idRestricaoEvento;

    @ManyToOne
    @JoinColumn(name="Evento_idEvento", nullable=false)
    private Evento idEvento;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Unidade_Academica_id_UA", nullable = false)
    private Unidade_Academica id_UA;
    
    public int getIdRestricaoEvento() {
        return idRestricaoEvento;
    }

    public void setIdRestricaoEvento(int idRestricaoEvento) {
        this.idRestricaoEvento = idRestricaoEvento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idRestricaoEvento;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the idRestricaoEvento fields are not set
        if (!(object instanceof Restricao_evento)) {
            return false;
        }
        Restricao_evento other = (Restricao_evento) object;
        if (this.idRestricaoEvento != other.idRestricaoEvento) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.mack.pi2.jpa.Restricao_evento[ id=" + idRestricaoEvento + " ]";
    }

    /**
     * @return the idEvento
     */
    public Evento getIdEvento() {
        return idEvento;
    }

    /**
     * @param idEvento the idEvento to set
     */
    public void setIdEvento(Evento idEvento) {
        this.idEvento = idEvento;
    }
    
}
