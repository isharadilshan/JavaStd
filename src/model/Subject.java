
package model;

/**
 *
 * @author Bunty
 */
public class Subject {
    private String Subject_Id;
    private String Name;
    private String Fees;
    private String TimeSlot;
    private String Venue;
    private String RegDate;
    private String StudentId;
    private String LectureId;
    private String FacultyId;
    public Subject(){
    }
    public Subject(String Subject_Id,String Name,String Fees,String TimeSlot,String Venue,String RegDate,String StudentId,String LectureId,String FacultyId){
        this.Subject_Id=Subject_Id;
        this.Name=Name;
        this.Fees=Fees;
        this.TimeSlot=TimeSlot;
        this.Venue=Venue;
        this.RegDate=RegDate;
        this.StudentId=StudentId;
        this.LectureId=LectureId;
        this.FacultyId=FacultyId;
    }
    public String getId(){
        return this.Subject_Id;
    }
    public void setId(String Subject_Id){
        this.Subject_Id=Subject_Id;
    }
    public String getName(){
        return this.Name;
    }
    public void setName(String Name){
        this.Name=Name;
    }
    public String getFees(){
        return this.Fees;
    }
    public void setFees(String Fees){
        this.Fees=Fees;
    }
    public String getTimeSlot(){
        return this.TimeSlot;
    }
    public void setTimeSlot(String TimeSlot){
        this.TimeSlot=TimeSlot;
    }
    public String getVenue(){
        return this.Venue;
    }
    public void setVenue(String Venue){
        this.Venue=Venue;
    }
    public String getRegDate(){
        return this.RegDate;          
    }
    public void setRegDate(String RegDate){
        this.RegDate=RegDate;
    }
    public String getStudentId(){
        return this.StudentId;
    }
    public void SetStudentId(String StudentId){
        this.StudentId=StudentId;
    }
     public String getLectureId(){
        return this.LectureId;
    }
    public void SetLectureId(String LectureId){
        this.LectureId=LectureId;
    }
     public String getFacultyId(){
        return this.FacultyId;
    }
    public void SetFacultyId(String FacultyId){
        this.FacultyId=FacultyId;
    }
}  
