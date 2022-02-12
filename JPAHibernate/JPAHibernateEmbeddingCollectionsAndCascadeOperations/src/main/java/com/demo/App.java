package com.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("CollectionsDBUnit");

        EntityManager entityManager = factory.createEntityManager();

        try {
            entityManager.getTransaction().begin();

            Set<String> courses = new HashSet<>();
            Set<String> courses2 = new HashSet<>();

            courses.add("React");
            courses.add("React");
            courses.add("Spring boot Microservices");

            courses2.add("Spring MVC");

            Student student = new Student("Aamir", courses);
            Student student2 = new Student("John", courses2);

            entityManager.persist(student);
            entityManager.persist(student2);
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            entityManager.getTransaction().commit();

            entityManager.close();
            factory.close();
        }
    }
}
