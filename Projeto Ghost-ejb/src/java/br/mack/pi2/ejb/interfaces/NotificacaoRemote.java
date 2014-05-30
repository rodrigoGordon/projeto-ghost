/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.mack.pi2.ejb.interfaces;

import br.mack.pi2.jpa.Notificacao;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author michel.oh
 */
@Remote
public interface NotificacaoRemote {
    public boolean insereNotificacao(Notificacao msg);
    public boolean modificaNotificacao(Notificacao msg);
    public boolean deletaNotificacao(Notificacao msg);
    public Notificacao getNotificacao(int id);
    public List<Notificacao> getAllNotificacao();
}
