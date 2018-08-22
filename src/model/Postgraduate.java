
package model;

/**
 *
 * @author Bunty
 */
public class Postgraduate {
    private String Student_Id;
    private String Name;
    private String DoB;
    private String Address;
    private String Email;
    private String Contact;
    public String RegDate;
    private String Intake;
    private String CompletionYear;
    private String QualificationType;
    private String FacultyId;
    Postgraduate(){}
    public Postgraduate(String Student_Id,String Name,String DoB,String Address,String Email,String Contact,String RegDate,String Intake,String CompletionYear,String QualificationType,String FacultyId){
        this.Student_Id=Student_Id;
        this.Name=Name;
        this.DoB=DoB;
        this.Address=Address;
        this.Email=Email;
        this.Contact=Contact;
        this.RegDate=RegDate;
        this.Intake=Intake;
        this.CompletionYear=CompletionYear;
        this.QualificationType=QualificationType;
        this.FacultyId=FacultyId;
    }

    public String getId(){
        return this.Student_Id;
    }
    public void setId(String Student_Id){
        this.Student_Id=Student_Id;
    }
     public String getName(){
        return this.Name;
    }
    public void setName(String Name){
        this.Name=Name;
    }
     public String getDoB(){
        return this.DoB;
    }
    public void setDoB(String DoB){
        this.DoB=DoB;
    }
     public String getAddress(){
        return this.Address;
    }
    public void setAddress(String Address){
        this.Address=Address;
    }
     public String getEmail(){
        return this.Email;
    }
    public void setEmail(String Email){
        this.Email=Email;
    }
     public String getContact(){
        return this.Contact;
    }
    public void setContact(String Contact){
        this.Contact=Contact;
    }
    public String getRegDate(){
        return this.RegDate;
    }
    public void setRegDate(String RegDate){
        this.RegDate=RegDate;
    }
    public String getCompletionYear(){
        return this.CompletionYear;
    }
    public void setCompletionYear(String CompletionYear){
        this.CompletionYear=CompletionYear;
    }
    public String getIntake(){
        return this.Intake;
    }
    public void setIntake(String Intake){
        this.Intake=Intake;
    }
    public String getQualificationType(){
        return this.QualificationType;
    }
    public void setQualificationType(String QualificationType){
        this.QualificationType=QualificationType;
    }
    public String getFaculty(){
        return this.FacultyId;
    }
    public void setFaculty(String FacultyId){
        this.FacultyId=FacultyId;
    }
    
}
