package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.setsName("Dhoni");
        s1.setRollNo(10);
        s1.setsAge(40);

        Configuration configuration = new Configuration();
        configuration.addAnnotatedClass(org.example.Student.class);
        configuration.configure();

        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
//        Transaction transaction = session.beginTransaction();
//
//        session.persist(s1);
//
//        transaction.commit();

        Student s2 = session.getReference(Student.class,7);
        System.out.println(s2);

        System.out.println(s1);


    }
}