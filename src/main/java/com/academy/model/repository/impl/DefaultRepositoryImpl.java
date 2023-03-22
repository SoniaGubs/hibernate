package com.academy.model.repository.impl;

import com.academy.model.DataSourceManager;
import com.academy.model.repository.DefaultRepository;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.EntityManager;
import java.util.List;

public class DefaultRepositoryImpl <T,I> implements DefaultRepository<T,I> {
    @Override
    public void save(T entity) {
        Session session = DataSourceManager.getInstance().getSession();

        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(entity);
        transaction.commit();
    }

    @Override
    public void delete(T entity) {
        EntityManager entityManager = DataSourceManager.getInstance().getEntityManager();
        entityManager.getTransaction().begin();
        entityManager.remove(entityManager.contains(entity) ? entity : entityManager.merge(entity));
        entityManager.getTransaction().commit();
    }

    @Override
    public List<T> findAll() {
        return null;
    }

    @Override
    public T findById(I id) {
        return null;
    }
}
