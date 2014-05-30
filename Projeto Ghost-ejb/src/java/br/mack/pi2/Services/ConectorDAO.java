/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.mack.pi2.Services;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 *
 * @author michel.oh
 */
public class ConectorDAO {
    
    private EntityManager em;
    private static ConectorDAO instance;
    
    private ConectorDAO() {
        em = Persistence.createEntityManagerFactory("Projeto_Ghost-ejbPU").createEntityManager();
    }
    
    public static ConectorDAO getInstance() {
        if (instance==null) {
            instance = new ConectorDAO();
        }
        return instance;
    }
    
    public EntityManager getConnection() {
        return em;
    }
}
