
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.Subject;
import model.Undergraduate;


public class SubjectController {
    public static int addSubject(Subject subject) throws ClassNotFoundException, SQLException{
        String sql="Insert into sbct(SubjectId,Name,Fees,TimeSlot,Venue,RegDate,StudentId,LectureId,FacultyId) Values(?,?,?,?,?,?,?,?,?)";
        Connection con = MyConnection.getConnection();
        PreparedStatement stm = con.prepareStatement(sql);
        stm.setObject(1, subject.getId());
        stm.setObject(2, subject.getName());
        stm.setObject(3, subject.getFees());
        stm.setObject(4, subject.getTimeSlot());
        stm.setObject(5, subject.getVenue());
        stm.setObject(6, subject.getRegDate());
        stm.setObject(7, subject.getStudentId());
        stm.setObject(8, subject.getLectureId());
        stm.setObject(9, subject.getFacultyId());
        return stm.executeUpdate();
    }
    public static int updateSubject(Subject subject) throws ClassNotFoundException, SQLException{
        String sql="Update Subject set Name=?,Fees=?,TimeSlot=?,Venue=?,RegDate=?,StudentId=?,LectureId=?,FacultyId=? where SubjectId=?";
        Connection con = MyConnection.getConnection();
        PreparedStatement stm = con.prepareStatement(sql);
        stm.setObject(9, subject.getId());
        stm.setObject(1, subject.getName());
        stm.setObject(2, subject.getFees());
        stm.setObject(3, subject.getTimeSlot());
        stm.setObject(4, subject.getVenue());
        stm.setObject(5, subject.getRegDate());
        stm.setObject(6, subject.getLectureId());
        stm.setObject(7, subject.getStudentId());
        stm.setObject(8, subject.getFacultyId());
        return stm.executeUpdate();
    }
    public static int deleteSubject(String id) throws ClassNotFoundException, SQLException{
        String sql="Delete from Subject where SubjectId=?";
        Connection con = MyConnection.getConnection();
        PreparedStatement stm = con.prepareStatement(sql);
        stm.setObject(1, id);
        return stm.executeUpdate();
    }
    public static Subject searchSubject(String id) throws ClassNotFoundException, SQLException{
        String sql = "Select * From Subject where StudentId=?";
        Connection con = MyConnection.getConnection();
        PreparedStatement stm = con.prepareStatement(sql);
        stm.setObject(1, id);
        ResultSet rst = stm.executeQuery();
        if(rst.next()){
            Subject subject  = new Subject(rst.getString("SubjectId"),rst.getString("Name"),rst.getString("Fees"),rst.getString("TimeSlot"),rst.getString("Venue"),rst.getString("RegDate"),rst.getString("StudentId"),rst.getString("LectureId"),rst.getString("FacultyId"));
            return subject;
        }else{
            return null;
        }
    }
    public static ArrayList<Subject> getAllSubjects(String id) throws ClassNotFoundException, SQLException{
        String sql="Select * From Subject where StudentId=?";
        Connection con = MyConnection.getConnection();
        PreparedStatement stm = con.prepareStatement(sql);
        stm.setObject(1, id);
        ResultSet rst = stm.executeQuery();
        ArrayList<Subject>subjectlist=new ArrayList<>();
        while(rst.next()){
            Subject subject  = new Subject(rst.getString("SubjectId"),rst.getString("Name"),rst.getString("Fees"),rst.getString("TimeSlot"),rst.getString("Venue"),rst.getString("RegDate"),rst.getString("StudentId"),rst.getString("LectureId"),rst.getString("FacultyId"));
            subjectlist.add(subject);
        }
        return subjectlist;
    }
}
