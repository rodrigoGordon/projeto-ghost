/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.mack.pi2.ejb.interfaces;

import br.mack.pi2.jpa.Infraestrutura;
import java.util.List;
import javax.ejb.Remote;



/**
 *
 * @author 41180283
 */
@Remote
public interface InfraestruturaRemote {
    public boolean insereInfra(Infraestrutura infra);
    public boolean modificaInfra(Infraestrutura infra);
    public boolean deletaInfra(Infraestrutura infra);
    public Infraestrutura getInfra(int idInfra);
    public List<Infraestrutura> getAllInfra();
}
