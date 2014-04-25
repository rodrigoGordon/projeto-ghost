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
@Entity (name = "notificacao")
public class Notificacao implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name = "idNotificacao")
    private int id;
    
    @Column (name = "email", length = 100)
    private String email;
    @Column (name = "dt_notificacao")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dtNotificacao;

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
        if (!(object instanceof Notificacao)) {
            return false;
        }
        Notificacao other = (Notificacao) object;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.mack.pi2.jpa.Notificacao[ id=" + id + " ]";
    }
    
}
