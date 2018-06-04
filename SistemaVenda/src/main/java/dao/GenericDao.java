/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.io.Serializable;


/**
 *
 * @author Patricia Pieroni
 * @param <T>
 * @param <ID>
 */
public interface GenericDao<T, ID extends Serializable> {

    public void salvar(T entity);

    public boolean remover(ID id);
    

    public T findID(ID id);
   
            
   

}
