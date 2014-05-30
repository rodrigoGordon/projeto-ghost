/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.mack.pi2.ejb.interfaces;

import br.mack.pi2.jpa.Itens_de_infra;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author michel.oh
 */
@Remote
public interface ItensDeInfraRemote {
    public boolean insereItemInfra(Itens_de_infra item);
    public boolean modificaItemInfra(Itens_de_infra item);
    public boolean deletaItemInfra(Itens_de_infra item);
    public Itens_de_infra getItemInfra(int id);
    public List<Itens_de_infra> getAllItensInfra();
}
