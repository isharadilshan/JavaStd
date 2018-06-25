
package model;

/**
 *
 * @author Bunty
 */
public class Lecturer {
    private String Id;
    private String Name;
    private String DoB;
    private String Address;
    private String Email;
    private String Contact;
    
    public Lecturer(){
    }
    
    public Lecturer(String Id,String Name,String DoB,String Address,String Email,String Contact){
        this.Id=Id;
        this.Name=Name;
        this.DoB=DoB;
        this.Address=Address;
        this.Email=Email;
        this.Contact=Contact;
    }
    public String getId(){
        return this.Id;
    }
    public void setId(String Id){
        this.Id=Id;
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
}
