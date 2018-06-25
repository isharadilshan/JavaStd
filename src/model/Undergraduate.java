
package model;

/**
 *
 * @author Bunty
 */
public class Undergraduate {
    private String Student_Id;
    private String Name;
    private String DoB;
    private String Address;
    private String Email;
    private String Contact;
    private String RegDate;
    private String Intake;
    private String Stream;
    private String Faculty_Id;
    public Undergraduate(){}
    public Undergraduate(String Student_Id,String Name,String DoB,String Address,String Email,String Contact,String RegDate,String Intake,String Stream,String Faculty_Id){
        this.Student_Id=Student_Id;
        this.Name=Name;
        this.DoB=DoB;
        this.Address=Address;
        this.Email=Email;
        this.Contact=Contact;
        this.RegDate=RegDate;
        this.Intake=Intake;
        this.Stream=Stream;
        this.Faculty_Id=Faculty_Id;
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
    public void steRegDate(String RegDate){
        this.RegDate=RegDate;
    }
     public String getStream(){
        return this.Stream;
    }
    public void setStream(String Stream){
        this.Stream=Stream;
    }
    public String getIntake(){
        return this.Intake;
    }
    public void setIntake(String Intake){
        this.Intake=Intake;
    }
    public String getFaculty(){
        return this.Faculty_Id;
    }
    public void setFaculty(String Faculty_Id){
        this.Faculty_Id=Faculty_Id;
    }
}
