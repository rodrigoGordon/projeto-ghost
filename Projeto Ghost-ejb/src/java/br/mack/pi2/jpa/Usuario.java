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
@Entity (name = "usuario")
public class Usuario implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name = "idLogin")
    private int id;
    
    @Column (name = "nomeUser", length = 10)
    private String nomeUser;
    @Column (name = "email", length = 100)
    private String email;
    @Column (name = "rg")
    private int rg;
    @Column (name = "pass", length = 16)
    private int pass; //valor binario: colocar 0b no numero

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
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.mack.pi2.jpa.Usuario[ id=" + id + " ]";
    }
    
}
