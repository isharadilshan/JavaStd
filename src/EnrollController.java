
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Enroll;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bunty
 */
public class EnrollController {
    public static int enrollSubject(Enroll enroll) throws ClassNotFoundException, SQLException{
        String sql="Insert into Enroll(SubjectId,StudentId,RegDate) Values(?,?,?)";
        Connection con = MyConnection.getConnection();
        PreparedStatement stm = con.prepareStatement(sql);
        stm.setObject(1, enroll.getId());
        stm.setObject(2, enroll.getStudentId());
        stm.setObject(3, enroll.getRegDate());
        return stm.executeUpdate();
    }
    public static int deleteSubject(String subjectid,String studentid) throws ClassNotFoundException, SQLException{
        String sql="Delete from subject where SubjectId=? AND StudentId=?";
        Connection con = MyConnection.getConnection();
        PreparedStatement stm = con.prepareStatement(sql);
        stm.setObject(1, subjectid);
        stm.setObject(1, studentid);
        return stm.executeUpdate();
    }
}
