/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import java.lang.reflect.ParameterizedType;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import util.FabricaEntity;

/**
 *
 * @author Patricia Pieroni
 * @param <T>
 */
public class HibernateGenericDAO<T, ID extends Serializable> implements GenericDao<T, ID> {

    private EntityManager em;
    private Class<T> classEntity;

    public HibernateGenericDAO() {
        em = FabricaEntity.getEntityManager();

        this.classEntity = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }

    @Override
    public void salvar(T entity) {
        em.getTransaction().begin();
        em.merge(entity);
        em.getTransaction().commit();
    }

    @Override
    public boolean remover(ID id) {
        T aux = em.find(classEntity, id);
        
        if (aux != null){
            em.getTransaction().begin();
            em.remove(aux);
            em.getTransaction().commit();
            return true;            
        }
        else
            return false;
    }

    @Override
    public T findID(ID id) {
        return em.find(classEntity, id);
    }

    public List<T> findAll() {
        CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<T> query = builder.createQuery(classEntity);
        query.from(classEntity);
        return em.createQuery(query).getResultList();
    }

    public EntityManager getEntityManager() {
        return em;
    }
}
