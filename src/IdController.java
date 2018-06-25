
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class IdController {
    public static String getLastId(String tableName,String columnName) throws ClassNotFoundException, SQLException{
        String query = "select "+columnName+" from "+tableName+" order by 1 desc limit 1 ";
        Connection con = MyConnection.getConnection();
        Statement stm = con.createStatement();
        ResultSet rst = stm.executeQuery(query);
        if(rst.next()){
            return rst.getString(1);
        }
        return null;
    }
}
