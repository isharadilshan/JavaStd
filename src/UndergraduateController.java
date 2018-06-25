
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.Undergraduate;


public class UndergraduateController {
    public static int addUndergraduate(Undergraduate underg) throws ClassNotFoundException, SQLException{
        String sql="Insert into Undergraduate(Student_Id,Name,DoB,Address,Email,Contact,RegDate,Intake,Stream,Faculty_Id) Values(?,?,?,?,?,?,?,?,?,?)";
        Connection con = MyConnection.getConnection();
        PreparedStatement stm = con.prepareStatement(sql);
        stm.setObject(1, underg.getId());
        stm.setObject(2, underg.getName());
        stm.setObject(3, underg.getDoB());
        stm.setObject(4, underg.getAddress());
        stm.setObject(5, underg.getEmail());
        stm.setObject(6, underg.getContact());
        stm.setObject(7, underg.getRegDate());
        stm.setObject(8, underg.getIntake());
        stm.setObject(9, underg.getStream());
        stm.setObject(10, underg.getFaculty()); 
        return stm.executeUpdate();
    }
    public static int updateUndergraduate(Undergraduate underg) throws ClassNotFoundException, SQLException{
        String sql="Update Undergraduate set Name=?,DoB=?,Address=?,Email=?,Contact=?,RegDate=?,Intake=?,Stream=?,Faculty_Id=? where Student_Id=?";
        Connection con = MyConnection.getConnection();
        PreparedStatement stm = con.prepareStatement(sql);
        stm.setObject(10, underg.getId());
        stm.setObject(1, underg.getName());
        stm.setObject(2, underg.getDoB());
        stm.setObject(3, underg.getAddress());
        stm.setObject(4, underg.getEmail());
        stm.setObject(5, underg.getContact());
        stm.setObject(6, underg.getRegDate());
        stm.setObject(7, underg.getIntake());
        stm.setObject(8, underg.getStream());
        stm.setObject(9, underg.getFaculty());
        return stm.executeUpdate();
    }
    public static int deleteUndergraduate(String id) throws ClassNotFoundException, SQLException{
        String sql="Delete from Undergraduate where Student_Id=?";
        Connection con = MyConnection.getConnection();
        PreparedStatement stm = con.prepareStatement(sql);
        stm.setObject(1, id);
        return stm.executeUpdate();
    }
    public static Undergraduate searchUndergraduate(String id) throws ClassNotFoundException, SQLException{
        String sql = "Select * From Undergraduate where Student_Id=?";
        Connection con = MyConnection.getConnection();
        PreparedStatement stm = con.prepareStatement(sql);
        stm.setObject(1, id);
        ResultSet rst = stm.executeQuery();
        if(rst.next()){
            Undergraduate underg  = new Undergraduate(rst.getString("Student_Id"),rst.getString("Name"),rst.getString("DoB"),rst.getString("Address"),rst.getString("Email"),rst.getString("Contact"),rst.getString("RegDate"),rst.getString("Intake"),rst.getString("Stream"),rst.getString("Faculty_Id"));
            return underg;
        }else{
            return null;
        }
    }
    public static ArrayList<Undergraduate> getAllUndergradutes() throws ClassNotFoundException, SQLException{
        Connection con = MyConnection.getConnection();
        Statement stm = con.createStatement();
        ResultSet rst = stm.executeQuery("Select * From Undergraduate");
        ArrayList<Undergraduate>underglist=new ArrayList<>();
        while(rst.next()){
            Undergraduate underg = new Undergraduate(rst.getString("Student_Id"),rst.getString("Name"),rst.getString("DoB"),rst.getString("Address"),rst.getString("Email"),rst.getString("Contact"),rst.getString("RegDate"),rst.getString("Intake"),rst.getString("Stream"),rst.getString("Faculty_Id"));
            underglist.add(underg);
        }
        return underglist;
    }
     
}
