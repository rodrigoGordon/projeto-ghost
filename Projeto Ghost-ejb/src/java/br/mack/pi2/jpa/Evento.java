/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.mack.pi2.jpa;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.*;

/**
 *
 * @author MichelOh
 */
@Entity 
@Table (name = "evento")
@NamedQueries({
    @NamedQuery(name = "Evento.getAll", query = "SELECT a FROM Evento a")})
public class Evento implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "idEvento")
    private int idEvento;
    
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

    @ManyToOne (fetch = FetchType.LAZY,targetEntity = Locais.class)
    @JoinColumn(name="Locais_idLocal")
    private Locais idLocal;
    
    @ManyToOne (fetch = FetchType.LAZY,targetEntity = Usuario.class)
    @JoinColumn(name="Usuario_idUser")
    private Usuario responsavel;
    
    public int getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(int idEvento) {
        this.idEvento = idEvento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idEvento;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the idEvento fields are not set
        if (!(object instanceof Evento)) {
            return false;
        }
        Evento other = (Evento) object;
        if (this.idEvento != other.idEvento) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.mack.pi2.jpa.Evento[ id=" + idEvento + " ]";
    }

    /**
     * @return the nomeEvento
     */
    public String getNomeEvento() {
        return nomeEvento;
    }

    /**
     * @param nomeEvento the nomeEvento to set
     */
    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    /**
     * @return the descEvento
     */
    public String getDescEvento() {
        return descEvento;
    }

    /**
     * @param descEvento the descEvento to set
     */
    public void setDescEvento(String descEvento) {
        this.descEvento = descEvento;
    }

    /**
     * @return the dtInicio
     */
    public Date getDtInicio() {
          
          DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
          try{
          dtInicio = df.parse(dtInicio.toString());
          }catch(ParseException e)
          {
              System.out.println("ERRO DE CONVERSAO DATA INICIO - EVENTO" + e);
          }
        return dtInicio;
    }

    /**
     * @param dtInicio the dtInicio to set
     */
    public void setDtInicio(Date dtInicio) {
        this.dtInicio = dtInicio;
    }

    /**
     * @return the dtFim
     */
    public Date getDtFim() {
        return dtFim;
    }

    /**
     * @param dtFim the dtFim to set
     */
    public void setDtFim(Date dtFim) {
        this.dtFim = dtFim;
    }

    /**
     * @return the itemAdd
     */
    public boolean isItemAdd() {
        return itemAdd;
    }

    /**
     * @param itemAdd the itemAdd to set
     */
    public void setItemAdd(boolean itemAdd) {
        this.itemAdd = itemAdd;
    }

    /**
     * @return the inscricao
     */
    public boolean isInscricao() {
        return inscricao;
    }

    /**
     * @param inscricao the inscricao to set
     */
    public void setInscricao(boolean inscricao) {
        this.inscricao = inscricao;
    }

    /**
     * @return the privado
     */
    public boolean isPrivado() {
        return privado;
    }

    /**
     * @param privado the privado to set
     */
    public void setPrivado(boolean privado) {
        this.privado = privado;
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

    /**
     * @return the responsavel
     */
    public Usuario getResponsavel() {
        return responsavel;
    }

    /**
     * @param responsavel the responsavel to set
     */
    public void setResponsavel(Usuario responsavel) {
        this.responsavel = responsavel;
    }
    
}
