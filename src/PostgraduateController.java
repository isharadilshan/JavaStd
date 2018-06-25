
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.Postgraduate;


public class PostgraduateController {
    public static int addPostgraduate(Postgraduate postg) throws ClassNotFoundException, SQLException{
        String sql="Insert into Postgraduate(Student_Id,Name,DoB,Address,Email,Contact,RegDate,Intake,Qualification_Type,Completion_Year,Faculty_Faculty_Id) Values(?,?,?,?,?,?,?,?,?,?,?)";
        Connection con = MyConnection.getConnection();
        PreparedStatement stm = con.prepareStatement(sql);
        stm.setObject(1, postg.getId());
        stm.setObject(2, postg.getName());
        stm.setObject(3, postg.getDoB());
        stm.setObject(4, postg.getAddress());
        stm.setObject(5, postg.getEmail());
        stm.setObject(6, postg.getContact());
        stm.setObject(7, postg.getRegDate());
        stm.setObject(8, postg.getIntake());
        stm.setObject(9, postg.getQualificationType());
        stm.setObject(10, postg.getCompletionYear());
        stm.setObject(11, postg.getFacultyId());
        return stm.executeUpdate();
    }
    public static int updatePostgraduate(Postgraduate postg) throws ClassNotFoundException, SQLException{
        String sql="Update Postgraduate set Name=?,DoB=?,Address=?,Email=?,Contact=?,RegDate=?,Intake=?,Qualification_Type=?,Completion_Year=?,Faculty_Faculty_Id=? where Student_Id=?";
        Connection con = MyConnection.getConnection();
        PreparedStatement stm = con.prepareStatement(sql);
        stm.setObject(11, postg.getId());
        stm.setObject(1, postg.getName());
        stm.setObject(2, postg.getDoB());
        stm.setObject(3, postg.getAddress());
        stm.setObject(4, postg.getEmail());
        stm.setObject(5, postg.getContact());
        stm.setObject(6, postg.getRegDate());
        stm.setObject(7, postg.getIntake());
        stm.setObject(8, postg.getQualificationType());
        stm.setObject(9, postg.getCompletionYear());
        stm.setObject(10, postg.getFacultyId());
        return stm.executeUpdate();
    }
     public static int deletePostgraduate(String id) throws ClassNotFoundException, SQLException{
        String sql="Delete from Postgraduate where Student_Id=?";
        Connection con = MyConnection.getConnection();
        PreparedStatement stm = con.prepareStatement(sql);
        stm.setObject(1, id);
        return stm.executeUpdate();
    }
     public static Postgraduate searchPostgraduate(String id) throws ClassNotFoundException, SQLException{
        String sql = "Select * From Postgraduate where Student_Id=?";
        Connection con = MyConnection.getConnection();
        PreparedStatement stm = con.prepareStatement(sql);
        stm.setObject(1, id);
        ResultSet rst = stm.executeQuery();
        if(rst.next()){
            Postgraduate postg  = new Postgraduate(rst.getString("Student_Id"),rst.getString("Name"),rst.getString("DoB"),rst.getString("Address"),rst.getString("Email"),rst.getString("Contact"),rst.getString("RegDate"),rst.getString("Intake"),rst.getString("Completion_Year"),rst.getString("Qualification_Type"),rst.getString("Faculty_Faculty_Id"));
            return postg;
        }else{
            return null;
        }
    }
     public static ArrayList<Postgraduate> getAllPostgraduates() throws ClassNotFoundException, SQLException{
        Connection con = MyConnection.getConnection();
        Statement stm = con.createStatement();
        ResultSet rst = stm.executeQuery("Select * From Postgraduate");
        ArrayList<Postgraduate>postglist=new ArrayList<>();
        while(rst.next()){
            Postgraduate postg = new Postgraduate(rst.getString("Student_Id"),rst.getString("Name"),rst.getString("DoB"),rst.getString("Address"),rst.getString("Email"),rst.getString("Contact"),rst.getString("RegDate"),rst.getString("Intake"),rst.getString("Qualificatioin_Type"),rst.getString("Completion_Year"),rst.getString("Faculty_Faculty_Id"));
            postglist.add(postg);
        }
        return postglist;
    }
}
