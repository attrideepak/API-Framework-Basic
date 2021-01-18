package test;

import DBConstants.DBConstants;
import core.api.ConfigInitializer;
import core.utils.database.ExecuteDBQuery;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DBTest extends ConfigInitializer {

    ExecuteDBQuery executeDBQuery = new ExecuteDBQuery();
    private static Logger logger = Logger.getLogger(DBTest.class);
    ResultSet resultSet = null;

    @Test
    public void testDatabaseConnection() throws SQLException {
        resultSet = executeDBQuery.executeQuery(DBConstants.getAirportTermonalDetails(1));
        while(resultSet.next()) {
            String description = resultSet.getString("DESCRIPTION");
            logger.info(description);
//            if(description.equals("Hyderabad Airport")){
//                break;
//            }
            Assert.assertTrue(description!=null,"description is not null");
        }

    }

//    @AfterTest
//    public void closeConnection(){
//        try {
//            resultSet.close();
//            ExecuteDBQuery.stmt.close();
//            ExecuteDBQuery.con.close();
//            logger.info("********** Connection closed *************");
//        } catch (SQLException e) {
//            logger.info("********** Error closing connection  *************");
//            e.printStackTrace();
//        }
//    }
}
//   INSERT INTO `AIRPORT_TERMINALS`
//   (
//   `ID`,
//   `NAME`,
//   `CITY_ID`,
//   `TERMINAL_CODE`,
//   `LANDMARK`,
//   `LAT`,
//   `LNG`,
//   `MAP_LINK`,
//   `TRANSPORT_FEE`,
//   `FLEET_WAIT_TIME`,
//   `DESCRIPTION`,
//   `STATUS`,
//   `CREATED_AT`,
//   `MODIFIED_AT`,
//   `CREATED_BY`,
//   `MODIFIED_BY`
//   )
