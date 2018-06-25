
package model;

/**
 *
 * @author Bunty
 */
public class Course {
    private String Course_Id;
    private String Name;
    private String Code;
    private int Credits;
    public Course(){
    }
    public Course(String Course_Id,String Name,String Code,int Credits){
        this.Course_Id=Course_Id;
        this.Name=Name;
        this.Code=Code;
        this.Credits=Credits;
    }
    public String getId(){
        return this.Course_Id;
    }
    public void setId(String Course_Id){
        this.Course_Id=Course_Id;
    }
    public String getName(){
        return this.Name;
    }
    public void setName(String Name){
        this.Name=Name;
    }
    public String getCode(){
        return this.Code;
    }
    public void setCode(String Code){
        this.Code=Code;
    }
    public int getCredits(){
        return this.Credits;
    }
    public void setCredits(int Credits){
        this.Credits=Credits;
    }
    
}
