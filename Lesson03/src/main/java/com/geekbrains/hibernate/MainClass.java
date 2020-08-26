package com.geekbrains.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class MainClass {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Product.class)
                .addAnnotatedClass(Buyer.class)
                .buildSessionFactory();
        // CRUD
        Session session = null;
        session = factory.getCurrentSession();

//Д.З Первая часть

        //Какие товары покупал клиент
        session.beginTransaction();
        Buyer buyer = session.get(Buyer.class, 1);
        session.getTransaction().commit();
        System.out.println(buyer);

        //Какие клиенты купили определенный товар
        session.beginTransaction();
        Product product = session.get(Product.class, 3);
        session.getTransaction().commit();
        System.out.println(product);

        //Delete product
        session.beginTransaction();
        Product product = session.get(Product.class, 2);
        session.delete(product);
        session.getTransaction().commit();
        System.out.println("Продукт: " + product.getTitle() + " удален из БД!");

        //Delete buyer
        session.beginTransaction();
        Buyer buyer = session.get(Buyer.class, 4);
        session.delete(buyer);
        session.getTransaction().commit();
        System.out.println("Покупатель: " + buyer.getName() + " удален из БД!");


//Д.З Вторая часть

        //Написать запрос, который бы показывал кол-во студентов на каждом из факультетов, пример вывода
        /* SELECT fac.name, count(st.name)
            FROM faculties as fac
            LEFT JOIN students as st ON (st.fac_id = fac.id)
            GROUP BY fac.name" */

    }
}
