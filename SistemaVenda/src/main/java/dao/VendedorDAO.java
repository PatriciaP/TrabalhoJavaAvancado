/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.io.Serializable;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import model.Pessoa;
import model.Vendedor;

/**
 *
 * @author Patricia Pieroni
 */
public class VendedorDAO extends HibernateGenericDAO<Vendedor, Serializable>{
    
    
     public  Boolean buscarCPF(String cpf) {

        CriteriaBuilder builder = getEntityManager().getCriteriaBuilder();
        CriteriaQuery<Vendedor> criteriaQuery = builder.createQuery(Vendedor.class
        );
        Root<Vendedor> c = criteriaQuery.from(Vendedor.class
        );
        criteriaQuery.select(c);
        criteriaQuery.where(builder.like(c.<String>get("cpf"), cpf));

        System.out.println(getEntityManager().createQuery(criteriaQuery).getResultList());

        return getEntityManager().createQuery(criteriaQuery).getResultList().isEmpty();

    }

    public  Boolean validarLogin(String login, String senha) {

        CriteriaBuilder builder = getEntityManager().getCriteriaBuilder();
        CriteriaQuery<Vendedor> criteriaQuery = builder.createQuery(Vendedor.class
        );
        Root<Vendedor> c = criteriaQuery.from(Vendedor.class
        );
        criteriaQuery.select(c);
        criteriaQuery.where(
                builder.and(
                        builder.like(c.<String>get("login"), login),
                        builder.like(c.<String>get("senha"), senha))
        );

        System.out.println(getEntityManager().createQuery(criteriaQuery).getResultList());

        return getEntityManager().createQuery(criteriaQuery).getResultList().isEmpty();

    }

    public  Boolean verificarLogin(String login) {

        CriteriaBuilder builder = getEntityManager().getCriteriaBuilder();
        CriteriaQuery<Vendedor> criteriaQuery = builder.createQuery(Vendedor.class
        );
        Root<Vendedor> c = criteriaQuery.from(Vendedor.class
        );
        criteriaQuery.select(c);
        criteriaQuery.where(builder.like(c.<String>get("login"), login));

        System.out.println(getEntityManager().createQuery(criteriaQuery).getResultList());

        return getEntityManager().createQuery(criteriaQuery).getResultList().isEmpty();

    }
    
    
     public String retornarCod() {
        
           
        return getEntityManager().createQuery("Select count(p)"
                   + " from Pessoa p").getResultList().toString();

    }
     
     public Pessoa dados(Integer id){
        
           CriteriaBuilder builder = getEntityManager().getCriteriaBuilder();
          CriteriaQuery<Pessoa> criteriaQuery = builder.createQuery(Pessoa.class
        );
          Root<Pessoa> c = criteriaQuery.from(Pessoa.class
        );
        criteriaQuery.select(c);
        criteriaQuery.where(builder.like(c.<String>get("idPessoa"), String.valueOf(id)));

        System.out.println(getEntityManager().createQuery(criteriaQuery).getResultList());

        return getEntityManager().createQuery(criteriaQuery).getSingleResult();
        
    }
    
 
    
}
