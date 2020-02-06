package llm.java.sample.hibernate.crud;

import llm.java.sample.hibernate.crud.entity.UserEntity;
import org.apache.log4j.Logger;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class UserDAO {

    static Session sessionObj;
    static SessionFactory sessionFactoryObj;

    public final static Logger logger = Logger.getLogger(UserDAO.class);

    // This Method Is Used To Create The Hibernate's SessionFactory Object
    private static  SessionFactory buildSessionFactory(){

        // For Hibernate 4.x
        // Creating Configuration Instance & Passing Hibernate Configuration File //
//        Configuration configObj = new Configuration();
//        configObj.configure("hibernate.cfg.xml");
        // Since Hibernate Version 4.x, ServiceRegistry Is Being Used // Ok for Hibernate 4.x
//        ServiceRegistry serviceRegistryObj = new StandardServiceRegistryBuilder().applySettings(configObj.getProperties()).build();
        // Creating Hibernate SessionFactory Instance //Ok for Hibernate 4.X
//        sessionFactoryObj = configObj.buildSessionFactory(serviceRegistryObj);

        // For Hibernate 5.x
        ServiceRegistry serviceRegistryObj = new StandardServiceRegistryBuilder().configure().loadProperties("hibernate.cfg.xml").build();
        // Creating Hibernate SessionFactory Instance //
        sessionFactoryObj = new Configuration().configure().buildSessionFactory(serviceRegistryObj);

        return sessionFactoryObj;
    }

    public static void createUser(String name, String firstName){
        UserEntity userEntity = new UserEntity();
        try{
            // Getting Session Object From SessionFactory
            sessionObj = buildSessionFactory().openSession();
            // Getting Transaction Object From Session Object
            sessionObj.beginTransaction();

            //creating transaction llm.java.sample.hibernate.crud.entity
            logger.info("Creating transaction llm.java.sample.hibernate.crud.entity");
            userEntity.setFirstName(firstName);
            userEntity.setName(name);
            sessionObj.save(userEntity);

            //committing the transaction to the database
            sessionObj.getTransaction().commit();
            logger.info("\nSuccessfully create new user with firstName = "+firstName+ " and name = "+name);
        }catch (Exception sqlException){
            if(null != sessionObj.getTransaction()){
                logger.info(("\n .... Transaction is being Rolled Back .... \n"));
                sessionObj.getTransaction().rollback();
            }
            sqlException.printStackTrace();
        }finally {
            if(sessionObj != null){
                sessionObj.close();
            }
        }
    }

}
