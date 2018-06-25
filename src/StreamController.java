
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.Stream;


public class StreamController {
    public static int addStream(Stream stream) throws ClassNotFoundException, SQLException{
        String sql="Insert into Stream(Stream_Id,Stream_Name,Subject1,Subject2,Subject3,English,Rank,ZScore,Student_Id) Values(?,?,?,?,?,?,?,?,?)";
        Connection con = MyConnection.getConnection();
        PreparedStatement stm = con.prepareStatement(sql);
        stm.setObject(9, stream.getStudentId());
        stm.setObject(1, stream.getId());
        stm.setObject(2, stream.getName());
        stm.setObject(3, stream.getSubject1());
        stm.setObject(4, stream.getSubject2());
        stm.setObject(5, stream.getSubject3());
        stm.setObject(6, stream.getEnglish());
        stm.setObject(7, stream.getRank());
        stm.setObject(8, stream.getZScore());
        return stm.executeUpdate();
    }
    public static int updateStream(Stream stream) throws ClassNotFoundException, SQLException{
        String sql="Update Stream set Stream_Name=?,Subject1=?,Subject2=?,Subject3=?,English=?,Rank=?,ZScore=?,Stream_Id=? where Student_Id=?";
        Connection con = MyConnection.getConnection();
        PreparedStatement stm = con.prepareStatement(sql);
        stm.setObject(9, stream.getStudentId());
        stm.setObject(1, stream.getName());
        stm.setObject(2, stream.getSubject1());
        stm.setObject(3, stream.getSubject2());
        stm.setObject(4, stream.getSubject3());
        stm.setObject(5, stream.getEnglish());
        stm.setObject(6, stream.getRank());
        stm.setObject(7, stream.getZScore());
        stm.setObject(8, stream.getId());
        return stm.executeUpdate();
    }
     public static int deleteStream(String id) throws ClassNotFoundException, SQLException{
        String sql="Delete from Stream where Student_Id=?";
        Connection con = MyConnection.getConnection();
        PreparedStatement stm = con.prepareStatement(sql);
        stm.setObject(1, id);
        return stm.executeUpdate();
    }
     public static Stream searchStream(String id) throws ClassNotFoundException, SQLException{
        String sql = "Select * From Stream where Student_Id=?";
        Connection con = MyConnection.getConnection();
        PreparedStatement stm = con.prepareStatement(sql);
        stm.setObject(1, id);
        ResultSet rst = stm.executeQuery();
        if(rst.next()){
            Stream stream  = new Stream(rst.getString("Stream_Id"),rst.getString("Stream_Name"),rst.getString("Subject1"),rst.getString("Subject2"),rst.getString("Subject3"),rst.getString("English"),rst.getString("Rank"),rst.getString("ZScore"),rst.getString("Student_Id"));
            return stream;
        }else{
            return null;
        }
    }
     public static ArrayList<Stream> getAllStreams() throws ClassNotFoundException, SQLException{
        Connection con = MyConnection.getConnection();
        Statement stm = con.createStatement();
        ResultSet rst = stm.executeQuery("Select * From Stream");
        ArrayList<Stream>streamlist=new ArrayList<>();
        while(rst.next()){
            Stream stream  = new Stream(rst.getString("Stream_Id"),rst.getString("Stream_Name"),rst.getString("Subject1"),rst.getString("Subject2"),rst.getString("Subject3"),rst.getString("English"),rst.getString("Rank"),rst.getString("ZScore"),rst.getString("Student_Id"));
            streamlist.add(stream);
        }
        return streamlist;
    }
}
