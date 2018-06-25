
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class MyConnection {
    public static Connection getConnection() throws ClassNotFoundException, SQLException{
        
        Connection con = null;
        
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/stureg","root","");
//            System.out.println("Success!");
        
        return con;
    }
    
//    public static void main(String[] args){
//        Connection connection=getConnection();
//        if (connection!=null) {
//            System.out.println("connected");
//        }else{
//            System.out.println("fail");
//        }
//    }
}  
    
    
    
    
 


