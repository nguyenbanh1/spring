package com.nguyenbanh.model_relationship_mapping.many_to_many.solution2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistryBuilder;

public class AppRun {

    public static void main(String[] args) {


        User u = new User();
        u.setId(1);
        u.setEmail("tangkhanhnguyen@gmail.com");
        u.setName("Nguyen");


        Group g = new Group();
        g.setId(1);
        g.setName("Ali");


        User_Group ug = new User_Group();
        ug.setId(1);
        ug.setGroup(g);
        ug.setUser(u);


        Configuration configuration = new Configuration().configure().
                addAnnotatedClass(User.class).
                addAnnotatedClass(Group.class).
                addAnnotatedClass(User_Group.class);

        SessionFactory sessionFactory = configuration.buildSessionFactory(
                new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry()

        );

        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();


        session.save(u);
        session.save(g);
        session.save(ug);


        transaction.commit();


    }

}
