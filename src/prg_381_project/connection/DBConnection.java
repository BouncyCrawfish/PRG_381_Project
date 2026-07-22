package prg_381_project.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
   //LIAM's CONNECTION
    
   // private static final String URL = "jdbc:postgresql://localhost:5432/CleaningInventoryDB";
   // private static final String USER = "postgres";
   // private static final String PASSWORD = "Liamdevilliers12*";
    
   //REGARDT's CONNECTION
    private static final String URL = "jdbc:postgresql://localhost:5432/StudentsRegistry";
    private static final String USER = "postgres";
    private static final String PASSWORD = "1234";

    //private static final String URL = "jdbc:postgresql://localhost:5433/CleaningInventoryDB";
    //private static final String USER = "postgres";
    //private static final String PASSWORD = "Rochelle03!";

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            System.out.println("Database connection failed!");
            e.printStackTrace();
            return null;
        }
    }
}
