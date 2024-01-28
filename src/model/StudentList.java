/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nhs
 */
public class StudentList {
    private List<Student> studentList = new ArrayList<>();

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
    public void addList(Student st){
        studentList.add(st);
    }
    
    public void removeList(Student st){
        studentList.remove(st);
    }
    
    public Student findById(String id){
        for(Student st : studentList){
            if(st.getId().equalsIgnoreCase(id)){
                return st;
            }
        }
        return null;
    }
    
    public List<Student> findByName (String name){
        List<Student> foundList = new ArrayList<>();
        for (Student st : studentList){
            if(st.getName().toLowerCase().contains(name.toLowerCase())){
                foundList.add(st);
            }
        }
        return foundList;
    }
}
