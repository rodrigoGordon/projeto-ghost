/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.mack.pi2.ejb.interfaces;

import br.mack.pi2.jpa.Itens_Local;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author michel.oh
 */
@Remote
public interface ItensLocalRemote {
    public boolean insereItemLocal(Itens_Local item);
    public boolean modificaItemLocal(Itens_Local item);
    public boolean deletaItemLocal(Itens_Local item);
    public Itens_Local getItemLocal(int id);
    public List<Itens_Local> getAllItensLocal();
}
