/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package syst17796_w01;

/**
 *
 * @author 727
 */
public class Student {
    
    private String studentId;
    private String studentName;
    
    public Student() {
        
    }
    public Student(String studentId, String studentName) {
        setStudentId(studentId);
        setStudentName(studentName);
    }
    
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    
    public String getStudentId() {
        return studentId;
    }
    
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    
    public String getStudentName() {
        return studentName;
    }
    
    public String toString() {
        return String.format("Name: %s\tNumber: %s",studentName, studentId);
    }
}
