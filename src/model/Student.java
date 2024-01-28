package model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author nhs
 */
public class Student implements Comparable<Student> {

    private String id;
    private String name;
    private List<Course> course;

    public Student() {
    }

    public Student(String id, String name, List<Course> course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Course> getCourse() {
        return course;
    }

    public void setCourse(List<Course> course) {
        this.course = course;
    }
    

    @Override
    public String toString() {
        for (Course cs : course) {
            System.out.printf("%-10s|%-25s|", id, name);
            cs.toString();
            System.out.println("");
        }

        return "";
    }

    public String displayStudentReport() {
        Map<String, Integer> coursesName = new HashMap<>();
        for (Course cs : course) {
            String courseName = cs.getCourseName();
            if (!coursesName.containsKey(courseName)) {
                coursesName.put(courseName, 1);
            } else {
                int count = coursesName.get(courseName);
                coursesName.put(courseName, count + 1);
            }
        }
        for (Map.Entry<String, Integer> entry : coursesName.entrySet()) {
            String courseName = entry.getKey();
            int count = entry.getValue();
            System.out.printf("%-10s|%-25s|%-20s|%-10d\n", id, name, courseName, count);
        }
        return "";
    }
    
    public String displayToUpdateOrDelete(){
        for (Course cs : course) {
            System.out.printf("%-10s|%-25s|", id, name);
            cs.displayWithCourseNum();
            System.out.println("");
        }

        return "";
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }

}
