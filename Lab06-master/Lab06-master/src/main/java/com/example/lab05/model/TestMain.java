package com.example.lab05.model;

import javax.persistence.*;
import java.util.List;

public class TestMain {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Lab05_Hibernate");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        TypedQuery<ProductEntity> query = entityManager.createQuery("select s from ProductEntity s", ProductEntity.class);
        List<ProductEntity> lst = query.getResultList();
        lst.forEach(productEntity -> System.out.println(productEntity.getTenSp()));
    }
}
