
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.Instructor;
import model.Lecturer;


public class InstructorController {
    public static int addInstructor(Instructor lec) throws ClassNotFoundException, SQLException{
        String sql="Insert into Instructor(Instructor_Id,Instructor_Name,DoB,Address,Email,Contact) Values(?,?,?,?,?,?)";
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
    public static int updateInstructor(Instructor ins) throws ClassNotFoundException, SQLException{
        String sql="Update Instructor set Instructor_Name=?,DoB=?,Address=?,Email=?,Contact=? where Instructor_Id=?";
        Connection con = MyConnection.getConnection();
        PreparedStatement stm = con.prepareStatement(sql);
        stm.setObject(6,ins.getId());
        stm.setObject(1,ins.getName());
        stm.setObject(2,ins.getDoB());
        stm.setObject(3,ins.getAddress());
        stm.setObject(4,ins.getEmail());
        stm.setObject(5,ins.getContact());
        return stm.executeUpdate();
        
    }
    public static int deleteInstructor(String id) throws ClassNotFoundException, SQLException{
        String sql="Delete from Instructor where Instructor_Id=?";
        Connection con = MyConnection.getConnection();
        PreparedStatement stm = con.prepareStatement(sql);
        stm.setObject(1, id);
        return stm.executeUpdate();
    }
    public static Instructor searchInstructor(String id) throws ClassNotFoundException, SQLException{
        String sql = "Select * From Instructor where Instructor_Id=?";
        Connection con = MyConnection.getConnection();
        PreparedStatement stm = con.prepareStatement(sql);
        stm.setObject(1, id);
        ResultSet rst = stm.executeQuery();
        if(rst.next()){
            Instructor ins  = new Instructor(rst.getString("Instructor_Id"),rst.getString("Instructor_Name"),rst.getString("DoB"),rst.getString("Address"),rst.getString("Email"),rst.getString("Contact"));
            return ins;
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
