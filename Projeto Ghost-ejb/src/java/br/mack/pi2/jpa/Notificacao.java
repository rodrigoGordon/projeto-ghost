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
@Entity 
@Table (name = "notificacao")
public class Notificacao implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name = "idNotificacao")
    private int idNotificacao;
    
    @Column (name = "email", length = 100)
    private String email;
    @Column (name = "dt_notificacao")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dtNotificacao;

    @ManyToOne
    @JoinColumn(name="Evento_idEvento", nullable=false)
    private Evento idEvento;
    
    public int getIdNotificacao() {
        return idNotificacao;
    }

    public void setIdNotificacao(int idNotificacao) {
        this.idNotificacao = idNotificacao;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idNotificacao;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the idNotificacao fields are not set
        if (!(object instanceof Notificacao)) {
            return false;
        }
        Notificacao other = (Notificacao) object;
        if (this.idNotificacao != other.idNotificacao) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.mack.pi2.jpa.Notificacao[ id=" + idNotificacao + " ]";
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the dtNotificacao
     */
    public Date getDtNotificacao() {
        return dtNotificacao;
    }

    /**
     * @param dtNotificacao the dtNotificacao to set
     */
    public void setDtNotificacao(Date dtNotificacao) {
        this.dtNotificacao = dtNotificacao;
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
