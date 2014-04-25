/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.mack.pi2.jpa;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 *
 * @author MichelOh
 */
@Entity (name = "evento")
public class Evento implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name = "idEvento")
    private int id;
    
    @Column (name = "nomeEvento", length = 100)
    private String nomeEvento;
    @Column (name = "descEvento", length = 255)
    private String descEvento;
    @Column (name = "dt_inicio")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dtInicio;
    @Column (name = "dt_fim")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dtFim;
    @Column (name = "isItemAdd")
    private boolean itemAdd;
    @Column (name = "isInscricao")
    private boolean inscricao;
    @Column (name = "isPrivado")
    private boolean privado;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) id;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Evento)) {
            return false;
        }
        Evento other = (Evento) object;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.mack.pi2.jpa.Evento[ id=" + id + " ]";
    }
    
}
