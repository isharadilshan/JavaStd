
package model;

/**
 *
 * @author Bunty
 */
public class Stream {
    private String Id;
    private String Name;
    private String Subject1;
    private String Subject2;
    private String Subject3;
    private String English;
    private String Rank;
    private String ZScore;
    private String Student_Id;
    
    public Stream(){
    }
    
    public Stream(String Id,String Name,String Subject1,String Subject2,String Subject3,String English,String Rank,String ZScore,String Student_Id){
        this.Id=Id;
        this.Name=Name;
        this.Subject1=Subject1;
        this.Subject2=Subject2;
        this.Subject3=Subject3;
        this.English=English;
        this.Rank=Rank;
        this.ZScore=ZScore;
        this.Student_Id=Student_Id;
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
    public String getSubject1(){
        return this.Subject1;
    }
    public void setSubject1(String Subject1){
        this.Subject1=Subject1;
    }
    public String getSubject2(){
        return this.Subject2;
    }
    public void setSubject2(String Subject2){
        this.Subject2=Subject2;
    }
    public String getSubject3(){
        return this.Subject3;
    }
    public void setSubject3(String Subject3){
        this.Subject3=Subject3;
    }
    public String getEnglish(){
        return this.English;
    }
    public void setEnglish(String English){
        this.English=English;
    }
    public String getRank(){
        return this.Rank;
    }
    public void setRank(String Rank){
        this.Rank=Rank;
    }
    public String getZScore(){
        return this.ZScore;
    }
    public void setZScore(String ZScore){
        this.ZScore=ZScore;
    }
    public String getStudentId(){
        return this.Student_Id;
    }
    public void setStudentId(String Student_Id){
        this.Student_Id=Student_Id;
    }

}
