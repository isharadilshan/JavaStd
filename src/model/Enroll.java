/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Bunty
 */
public class Enroll {
    private String SubjectId;
    private String StudentId;
    private String RegDate;
    private String Marks;
    public Enroll(){
    }
    public Enroll(String SubjectId,String StudentId,String RegDate){
        this.SubjectId=SubjectId;
        this.StudentId=StudentId;
        this.RegDate=RegDate;
    }
    public String getId(){
        return this.SubjectId;
    }
    public void setId(String SubjectId){
        this.SubjectId=SubjectId;
    }
    public String getStudentId(){
        return this.StudentId;
    }
    public void SetStudentId(String StudentId){
        this.StudentId=StudentId;
    }
    public String getRegDate(){
        return this.RegDate;
    }
    public void SetRegDate(String RegDate){
        this.RegDate=RegDate;
    }
}  