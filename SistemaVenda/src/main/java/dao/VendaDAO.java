/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.io.Serializable;
import model.Venda;

/**
 *
 * @author Patricia Pieroni
 */
public class VendaDAO extends HibernateGenericDAO<Venda, Serializable>{

    public String retornarCod() {

        return getEntityManager().createQuery("Select count(p)"
                + " from Venda p").getResultList().toString()+1;

    }
 
    
    
}
