package syst17796_w01;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 727
 */
public class PartTimeStudent extends Student {
    
    private int numCourses;

    public void setNumCourses(int numCourses) {
        this.numCourses = numCourses;
    }
    
    public PartTimeStudent(String name, int numCourses) {
        super(name);
    }

    public int getNumCourses() {
        return numCourses;
    }
}
