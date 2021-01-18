package core.utils.database;

import core.api.ConfigInitializer;
import org.apache.log4j.Logger;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnection {
    private static Logger logger = Logger.getLogger(DBConnection.class);
    public static Connection con = null;


    public static Connection getConnection() {
        Properties props = new Properties();
        props = ConfigInitializer.initializePropertiesFiles(new File(System.getProperty("user.dir")).getAbsolutePath() + "/configurations/database/" + ConfigInitializer.activeEnv + ".properties");

        try {
            /** The main motive is to load the class into memory, so that the driver class can register itself to the
             * DriverManager. If you will look into the Driver classes implementation, you will find that they have
             * static block where they are registering themselves to DriverManager.**/
            Class.forName(props.getProperty("DB_DRIVER_CLASS"));
            con = DriverManager.getConnection(props.getProperty("DB_URL"), props.getProperty("DB_USERNAME"), props.getProperty("DB_PASSWORD"));
            logger.info("******** Connection with database successful ********");
        } catch (ClassNotFoundException | SQLException e) {
            logger.info("******** Connection with database failed ***********");
            e.printStackTrace();
        }

        return con;
    }

    public static void closeConnection(){
        try {
            con.close();
            logger.info("********** Connection closed ***************");
        } catch (SQLException e) {
            logger.info("********** Error closing connection ***************");
            e.printStackTrace();
        }
    }
}
/**
 There are 5 steps to connect any java application with the database using JDBC. These steps are as follows:
 Register the Driver class
 Create connection
 Create statement
 Execute queries
 Close connection
**/