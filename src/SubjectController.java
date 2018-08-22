
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Subject;


public class SubjectController {
    public static int addSubject(Subject subject) throws ClassNotFoundException, SQLException{
        String sql="Insert into subject(SubjectId,Name,Fees,TimeSlot,Venue,Semester,LectureId,FacultyId) Values(?,?,?,?,?,?,?,?)";
        Connection con = MyConnection.getConnection();
        PreparedStatement stm = con.prepareStatement(sql);
        stm.setObject(1, subject.getId());
        stm.setObject(2, subject.getName());
        stm.setObject(3, subject.getFees());
        stm.setObject(4, subject.getTimeSlot());
        stm.setObject(5, subject.getVenue());
        stm.setObject(6, subject.getSemester());
        stm.setObject(7, subject.getLectureId());
        stm.setObject(8, subject.getFacultyId());
        return stm.executeUpdate();
    }
    public static int updateSubject(Subject subject) throws ClassNotFoundException, SQLException{
        String sql="Update subject set Name=?,Fees=?,TimeSlot=?,Venue=?,Semester=?,LectureId=?,FacultyId=? where SubjectId=?";
        Connection con = MyConnection.getConnection();
        PreparedStatement stm = con.prepareStatement(sql);
        stm.setObject(8, subject.getId());
        stm.setObject(1, subject.getName());
        stm.setObject(2, subject.getFees());
        stm.setObject(3, subject.getTimeSlot());
        stm.setObject(4, subject.getVenue());
        stm.setObject(5, subject.getSemester());
        stm.setObject(6, subject.getLectureId());
        stm.setObject(7, subject.getFacultyId());
        return stm.executeUpdate();
    }
    public static int deleteSubject(String id) throws ClassNotFoundException, SQLException{
        String sql="Delete from subject where SubjectId=?";
        Connection con = MyConnection.getConnection();
        PreparedStatement stm = con.prepareStatement(sql);
        stm.setObject(1, id);
        return stm.executeUpdate();
    }
    public static Subject searchSubject(String id) throws ClassNotFoundException, SQLException{
        String sql = "Select * From subject where StudentId=?";
        Connection con = MyConnection.getConnection();
        PreparedStatement stm = con.prepareStatement(sql);
        stm.setObject(1, id);
        ResultSet rst = stm.executeQuery();
        if(rst.next()){
            Subject subject  = new Subject(rst.getString("SubjectId"),rst.getString("Name"),rst.getString("Fees"),rst.getString("TimeSlot"),rst.getString("Venue"),rst.getString("Semester"),rst.getString("LectureId"),rst.getString("FacultyId"));
            return subject;
        }else{
            return null;
        }
    }
    public static ArrayList<Subject> getAllSubjects(String id) throws ClassNotFoundException, SQLException{
        String sql="Select * From subject";
        Connection con = MyConnection.getConnection();
        PreparedStatement stm = con.prepareStatement(sql);
        stm.setObject(1, id);
        ResultSet rst = stm.executeQuery();
        ArrayList<Subject>subjectlist=new ArrayList<>();
        while(rst.next()){
            Subject subject  = new Subject(rst.getString("SubjectId"),rst.getString("Name"),rst.getString("Fees"),rst.getString("TimeSlot"),rst.getString("Venue"),rst.getString("Semester"),rst.getString("LectureId"),rst.getString("FacultyId"));
            subjectlist.add(subject);
        }
        return subjectlist;
    }
}
