package com.hibernate;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Hello World!" );
        Configuration config=new Configuration();
        config.configure();
        SessionFactory session=config.buildSessionFactory();
        System.out.println(session);
        System.out.println(session.isClosed());
        //creating emp obj
        Employee emp=new Employee();
        emp.setId(102);
        emp.setName("Yash");
        emp.setCity("Sangli");
        
        //creating empaddress ka obj
        Address add=new Address();
        add.setStreet("Street 1");
        add.setCity("Pune");
        add.setOpen(true);
        add.setAddedDate(new Date());
        add.setX(0.0);
        
        //Reading image;
        FileInputStream in=new FileInputStream("src/main/java/com/hibernate/unsplash.jpg");
        byte []data=new byte[in.available()];
        in.read(data);
        add.setImage(data);
        
        Session s1=  session.openSession();
       Transaction trans= s1.beginTransaction();
        s1.persist(emp);
        s1.persist(add);
        trans.commit();
        s1.close();
        System.out.println("done");
    }
}
