/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.mack.pi2.ejb.interfaces;

import br.mack.pi2.jpa.Unidade_Academica;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author michel.oh
 */
@Remote
public interface UnidadeAcademicaRemote {
    public boolean insereUA(Unidade_Academica ua);
    public boolean modificaUA(Unidade_Academica ua);
    public boolean deletaUA(Unidade_Academica ua);
    public Unidade_Academica getUA(String id);
    public List<Unidade_Academica> getAllUA();
}
