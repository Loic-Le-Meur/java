import llm.java.sample.hibernate.crud.UserDAO;
import org.apache.log4j.Logger;

public class AppMain {

    public final static Logger logger = Logger.getLogger(AppMain.class);

    public static void main(String[] args){
        logger.info(".......Hibernate Crud Operations Example.......\n");
        logger.info("\n=======CREATE USER=======\n");

        String name = "Le Meur";
        String firstName = "Loic";

        UserDAO.createUser(firstName, name);
        System.exit(0);
    }

}
