/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.mack.pi2.ejb.interfaces;

import br.mack.pi2.jpa.Permissao;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author michel.oh
 */
@Remote
public interface PermissaoRemote {
    public boolean inserePermissao(Permissao auth);
    public boolean modificaPermissao(Permissao auth);
    public boolean deletaPermissao(Permissao auth);
    public Permissao getPermissao(int id);
    public List<Permissao> getAllPermissao();
}
