package core.utils.database;

import DBConstants.DBConstants;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class ExecuteDBQuery {
    private static Logger logger = Logger.getLogger(ExecuteDBQuery.class);
    public static  Connection con = null;
    public static Statement stmt = null;

    public ResultSet executeQuery(String query){
        ResultSet rs = null;
         con = DBConnection.getConnection();
        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);
        } catch (SQLException e) {
            logger.info("********** Error excuting query "+e.getMessage());
        }
        logger.info("********** Query executed ************** ");
        return rs;
    }

}
