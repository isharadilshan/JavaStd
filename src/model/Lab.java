
package model;

/**
 *
 * @author Bunty
 */
public class Lab{
    private String Lab_Id;
    private String Name;
    private String Location;
    private int Seats;
    
    public Lab(){
    }
    
    public Lab(String Lab_Id,String Name,String Location,int Seats){
        this.Lab_Id=Lab_Id;
        this.Name=Name;
        this.Location=Location;
        this.Seats=Seats;
        
    }
    public String getId(){
        return this.Lab_Id;
    }
    public void setId(String Lab_Id){
        this.Lab_Id=Lab_Id;
    }
    public String getName(){
        return this.Name;
    }
    public void setName(String Name){
        this.Name=Name;
    }
    public String getLocation(){
        return this.Location;
    }
    public void setLocation(String Location){
        this.Location=Location;
    }
    public int getSeats(){
        return this.Seats;
    }
    public void setSeats(int Seats){
        this.Seats=Seats;
    }
}
