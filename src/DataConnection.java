
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class DataConnection {

    public DataConnection() {
    }
    
    
    public static User getUser(String username){
        User user = new User();
        try {
            String sql = "SELECT * FROM User where Username=?";
            Connection con = MyConnection.getConnection();
            PreparedStatement stm = con.prepareStatement(sql); 
            stm.setObject(1,username);
            ResultSet rs = stm.executeQuery();
            
            while (rs.next()) {
                user.setUsername(username);
                user.setPassword(rs.getString("Password"));
                user.setName(rs.getString("Name"));
                user.setEmail(rs.getString("Email"));
                user.setUserLevel(rs.getInt("UserLevel"));
            }
            
        } catch (ClassNotFoundException | SQLException ex) {
           // ExceptionHandle.showError(ex);
        }
        return user;
    }
}
