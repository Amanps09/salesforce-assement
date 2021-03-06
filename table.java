import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class table {
    public static void main(String args[]) throws SQLException {
        //Registering the Driver
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        //Getting the connection
        String mysqlUrl = "jdbc:mysql://localhost/salesforce";
        Connection con = DriverManager.getConnection(mysqlUrl, "root", "aman");
        System.out.println("Connection established......");
        //Creating the Statement
        Statement stmt = con.createStatement();
        //Query to create a table
        String query = "CREATE TABLE MOVIES("
                + "ID INT NOT NULL, "
                + "MOVIENAME VARCHAR (40) NOT NULL, "
                + "ACTORNAME VARCHAR(40) NOT NULL, "
                + "ACTRESSNAME VARCHAR(40) NOT NULL, "
                + "DIRECTORNAME VARCHAR(40) NOT NULL, "
                + "YEAR DATE NOT NULL, "
                + "PRIMARY KEY (ID))";
        stmt.execute(query);
        System.out.println("Table Created......");
    }
}
