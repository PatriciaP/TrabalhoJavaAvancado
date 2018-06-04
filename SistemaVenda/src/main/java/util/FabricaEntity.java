/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author devai
 */
public class FabricaEntity {
    
    private static final EntityManagerFactory emf = 
            Persistence.createEntityManagerFactory("com.patricia_SistemaVenda_jar_1.0-SNAPSHOTPU");
    
    public static EntityManager getEntityManager(){
           return emf.createEntityManager();
    }
    
}
