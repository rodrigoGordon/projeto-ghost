/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.mack.pi2.ejb.interfaces;

import java.util.List;
import java.io.Serializable;

/**
 *
 * @author alvarowf
 */
public interface GenericDAO <T, ID extends Serializable>{
    public Class<T> getObjectsClass();
    public void detach(T entity);
    public T create(T object);
    public T save(T object);
    public T findById(ID id);
    public void delete (T object);
    public List<T>getAll();
}
