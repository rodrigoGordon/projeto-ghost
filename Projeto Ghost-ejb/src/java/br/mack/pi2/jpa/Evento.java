/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.mack.pi2.jpa;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author MichelOh
 */
@Entity 
@Table (name = "evento")
public class Evento implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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
    
    @OneToMany(mappedBy="Evento", cascade=CascadeType.ALL)
    private List<Itens_de_infra> ItensDeInfra = new ArrayList<Itens_de_infra>();
    
    public List<Itens_de_infra>getItensDeInfra(){
        return ItensDeInfra;
    }
    
    public void setItensDeInfra(List<Itens_de_infra> ItensDeInfra){
        this.ItensDeInfra = ItensDeInfra;
    }
    
    @OneToMany(mappedBy="Evento", cascade=CascadeType.ALL)
    private List<Notificacao> Notificacoes = new ArrayList<Notificacao>();
    
    public List<Notificacao>getNotificacoes(){
        return Notificacoes;
    }
    
    public void setNotificacoes(List<Notificacao> notificacoes){
        this.Notificacoes = notificacoes;
    }
    
    @OneToMany(mappedBy="Evento", cascade=CascadeType.ALL)
    private List<Participantes> Participantes = new ArrayList<Participantes>();
    
    public List<Participantes>getParticipantes(){
        return Participantes;
    }
    
    public void setParticipantes(List<Participantes> participantes){
        this.Participantes = participantes;
    }
    
    @OneToMany(mappedBy="Evento", cascade=CascadeType.ALL)
    private List<Restricao_evento> RestricaoEventos = new ArrayList<Restricao_evento>();
    
    public List<Restricao_evento>getRestricaoEventos(){
        return RestricaoEventos;
    }
    
    public void setRestricaoEventos(List<Restricao_evento> restricaoEventos){
        this.RestricaoEventos = restricaoEventos;
    }
    
    @ManyToOne
    @JoinColumn(name="Locais_idLocal", nullable=false)
    private Locais idLocal;
    
    @ManyToOne
    @JoinColumn(name="idLogin", nullable=false)
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
