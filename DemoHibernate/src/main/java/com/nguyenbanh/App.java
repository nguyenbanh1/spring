package com.nguyenbanh;


import com.nguyenbanh.model_relationship_mapping.many_to_many.solution1.Employee;
import com.nguyenbanh.model_relationship_mapping.many_to_many.solution1.Laptop;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistryBuilder;

public class App {


    public static void main(String[] args) {


        Laptop laptop = new Laptop();
        laptop.setId(1);
        laptop.setName("HP");


        Laptop laptop1 = new Laptop();
        laptop1.setId(2);
        laptop1.setName("Dell");


        Employee e = new Employee();
        e.setId(1);
        e.setName("nguyen");
        e.setMarks(10);

        Employee e1 = new Employee();
        e1.setId(2);
        e1.setName("nguyen banh");
        e1.setMarks(12);


        Configuration configuration = new Configuration().configure().
                addAnnotatedClass(Employee.class).
                addAnnotatedClass(Laptop.class);

        SessionFactory sessionFactory = configuration.buildSessionFactory(
                new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry()

        );

        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();


        session.save(laptop);
        session.save(laptop1);
        session.save(e);
        session.save(e1);


        laptop.getEmployees().add(e);
        e.getLaptops().add(laptop);
        session.update(laptop);


        transaction.commit();


    }

}
