package DBConstants;

public class DBConstants {

    public static String getAirportTermonalDetails(int id) {
        return "select * from AIRPORT_TERMINALS where id=" + id;
    }

}
