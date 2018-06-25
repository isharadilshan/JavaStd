
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.Lecturer;


public class LecturerController {
    public static int addLecturer(Lecturer lec) throws ClassNotFoundException, SQLException{
        String sql="Insert into Lecturer(Lecturer_Id,Lecturer_Name,DoB,Address,Email,Contact) Values(?,?,?,?,?,?)";
        Connection con =MyConnection.getConnection();
        PreparedStatement stm = con.prepareStatement(sql);
        stm.setObject(1,lec.getId());
        stm.setObject(2,lec.getName());
        stm.setObject(3,lec.getDoB());
        stm.setObject(4,lec.getAddress());
        stm.setObject(5,lec.getEmail());
        stm.setObject(6,lec.getContact());
        return stm.executeUpdate();        
    }
    public static int updateLecturer(Lecturer lec) throws ClassNotFoundException, SQLException{
        String sql="Update Lecturer set Lecturer_Name=?,DoB=?,Address=?,Email=?,Contact=? where Lecturer_Id=?";
        Connection con = MyConnection.getConnection();
        PreparedStatement stm = con.prepareStatement(sql);
        stm.setObject(6,lec.getId());
        stm.setObject(1,lec.getName());
        stm.setObject(2,lec.getDoB());
        stm.setObject(3,lec.getAddress());
        stm.setObject(4,lec.getEmail());
        stm.setObject(5,lec.getContact());
        return stm.executeUpdate();
        
    }
    public static int deleteLecturer(String id) throws ClassNotFoundException, SQLException{
        String sql="Delete from Lecturer where Lecturer_Id=?";
        Connection con = MyConnection.getConnection();
        PreparedStatement stm = con.prepareStatement(sql);
        stm.setObject(1, id);
        return stm.executeUpdate();
    }
    public static Lecturer searchLecturer(String id) throws ClassNotFoundException, SQLException{
        String sql = "Select * From Lecturer where Lecturer_Id=?";
        Connection con = MyConnection.getConnection();
        PreparedStatement stm = con.prepareStatement(sql);
        stm.setObject(1, id);
        ResultSet rst = stm.executeQuery();
        if(rst.next()){
            Lecturer lec  = new Lecturer(rst.getString("Lecturer_Id"),rst.getString("Lecturer_Name"),rst.getString("DoB"),rst.getString("Address"),rst.getString("Email"),rst.getString("Contact"));
            return lec;
        }else{
            return null;
        }
    }
    public static ArrayList<Lecturer> getAllLecturers() throws ClassNotFoundException, SQLException{
        Connection con = MyConnection.getConnection();
        Statement stm = con.createStatement();
        ResultSet rst = stm.executeQuery("Select * From Lecturer");
        ArrayList<Lecturer>leclist=new ArrayList<>();
        while(rst.next()){
            Lecturer lec = new Lecturer(rst.getString("id"),rst.getString("Lecturer_Name"),rst.getString("DoB"),rst.getString("Address"),rst.getString("Email"),rst.getString("Contact"));
            leclist.add(lec);
        }
        return leclist;
    }
}

