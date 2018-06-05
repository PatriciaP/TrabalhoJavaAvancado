/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import model.Cliente;
import model.Pessoa;
import util.FabricaEntity;

/**
 *
 * @author Patricia Pieroni
 */
public class ClienteDAO extends HibernateGenericDAO<Cliente, Serializable> {

    public Boolean buscarCPF(String cpf) {

        CriteriaBuilder builder = getEntityManager().getCriteriaBuilder();
        CriteriaQuery<Cliente> criteriaQuery = builder.createQuery(Cliente.class
        );
        Root<Cliente> c = criteriaQuery.from(Cliente.class
        );
        criteriaQuery.select(c);
        criteriaQuery.where(builder.like(c.<String>get("cpf"), cpf));

        System.out.println(getEntityManager().createQuery(criteriaQuery).getResultList());

        return getEntityManager().createQuery(criteriaQuery).getResultList().isEmpty();

    }
    
    public List<Cliente> returnCPF() {

          String sql = "Select c.cpf from Cliente c";
       
       EntityManager em = getEntityManager();
       return em.createQuery(sql, Cliente.class).getResultList();
    }

    public String retornarCod() {

        return getEntityManager().createQuery("Select count(p)"
                + " from Pessoa p").getResultList().toString();

    }
    
   

    public Pessoa dados(Integer id) {

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
