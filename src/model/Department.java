
package model;

/**
 *
 * @author Bunty
 */
public class Department {
    private String Department_Id;
    private String Name;
    public Department(){
    }
    public Department(String Department_Id,String Name){
        this.Department_Id=Department_Id;
        this.Name=Name;
    }
    public String getId(){
        return this.Department_Id;
    }
    public void setId(String Department_Id){
        this.Department_Id=Department_Id;
    }
    public String getName(){
        return this.Name;
    }
    public void setName(String Name){
        this.Name=Name;
    }
    
}
