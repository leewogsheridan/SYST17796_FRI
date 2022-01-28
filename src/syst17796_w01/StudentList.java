/*
 * Project: SYST17796_W01
 * Programmer: Gregory Lee Wo
 * Date: Jan 28 2022
 * Program: StudentList.java
 * Description: To model a student.
 */
package syst17796_w01;

/**
 *
 * @author 727
 */
public class StudentList {
    
    public static void main(String[] args) {
        Student[] studentList = new Student[5];
        
        studentList[0] = new Student("991638131", "Gregory");
        studentList[1] = new Student("327582475", "Jno");
        studentList[2] = new Student("123456789", "Bjorn");
        studentList[3] = new Student("332233322", "John");
        studentList[4] = new Student("987654321", "Bobby");
        
        for (int i = 0; i < studentList.length; i++) {
            System.out.println(studentList[i].getStudentName());
        }
        // djkhskjlhkdfka
    }
    
}
