package com.academy.model;

import org.hibernate.Session;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class  DataSourceManager {

    private static DataSourceManager instance = new DataSourceManager();
    private final EntityManagerFactory entityManagerFactory;

    public static DataSourceManager getInstance() {
        return instance == null ? new DataSourceManager() : instance;
    }

    public DataSourceManager() {
        entityManagerFactory = Persistence.createEntityManagerFactory("by.it_academy");
    }

    public EntityManager getEntityManager (){
        return entityManagerFactory.createEntityManager();
    }

   public Session getSession(){
        return getEntityManager().unwrap(Session.class);
   }
}
