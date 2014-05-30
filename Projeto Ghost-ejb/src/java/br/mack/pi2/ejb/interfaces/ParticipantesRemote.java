/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.mack.pi2.ejb.interfaces;

import br.mack.pi2.jpa.Participantes;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author michel.oh
 */
@Remote
public interface ParticipantesRemote {
    public boolean insereParticipante(Participantes part);
    public boolean modificaParticipante(Participantes part);
    public boolean deletaParticipante(Participantes part);
    public Participantes getParticipante(int id);
    public List<Participantes> getAllParticipantes();
}
