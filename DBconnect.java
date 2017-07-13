


import java.sql.Connection;
import java.sql.DriverManager;


public class DBconnect {
    public static Connection ConnectDB(){
        Connection con = null;
        
         try {
            Class.forName("com.mysql.jdbc.Driver"); //register jdbc driver
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/apartment", "root", "swasthya");
            return conn;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
}
}
        
    
    
    

