/*
 * Project: SYST17796_W01
 * Programmer: Gregory Lee Wo
 * Date: Jan 28 2022
 * Program: Student.java
 * Description: To model a student.
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
    
    public Student(String name) {
        setStudentName(name);
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
