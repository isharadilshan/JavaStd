
package model;

/**
 *
 * @author Bunty
 */
public class Evaluation {
    private String Evaluation_Id;
    private String Type;
    private String Grade;
    public Evaluation(){
    }
    public Evaluation(String Evaluation_Id,String Type,String Grade){
        this.Evaluation_Id=Evaluation_Id;
        this.Type=Type;
        this.Grade=Grade;
    }
    public String getId(){
        return this.Evaluation_Id;
    }
    public void setId(String Evaluation_Id){
        this.Evaluation_Id=Evaluation_Id;
    }
    public String getType(){
        return this.Type;
    }
    public void setType(String Type){
        this.Type=Type;
    }
     public String getGrade(){
        return this.Grade;
    }
    public void setGrade(String Grade){
        this.Grade=Grade;
    }
    
}
