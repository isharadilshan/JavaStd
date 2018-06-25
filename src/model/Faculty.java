
package model;

/**
 *
 * @author Bunty
 */
public class Faculty {
    private String Faculty_Id;
    private String Name;
    public Faculty(){
    }
    public Faculty(String Faculty_Id,String Name){
        this.Faculty_Id=Faculty_Id;
        this.Name=Name;
    }
    public String getId(){
        return this.Faculty_Id;
    }
    public void setId(String Faculty_Id){
        this.Faculty_Id=Faculty_Id;
    }
    public String getName(){
        return this.Name;
    }
    public void setName(String Name){
        this.Name=Name;
    }
}
