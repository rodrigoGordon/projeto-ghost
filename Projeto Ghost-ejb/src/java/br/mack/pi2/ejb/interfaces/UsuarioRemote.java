/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.mack.pi2.ejb.interfaces;

import br.mack.pi2.jpa.Usuario;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author michel.oh
 */
@Remote
public interface UsuarioRemote {
    public boolean insereUsuario(Usuario user);
    public boolean modificaUsuario(Usuario user);
    public boolean deletaUsuario(Usuario user);
    public Usuario getUsuario(int id);
    public List<Usuario> getAllUsuario();
    public List<Usuario> loginUsuario(String login, String senha);
}
