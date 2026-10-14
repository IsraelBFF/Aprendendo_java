package entities;

import java.util.Set;

public class Course {
    private String name;

    private Set<Student> students;
   
    // Constructor

    public Course(String name, Set<Student> students) {
        this.name = name;
        this.students = students;
    }

    // Methods Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
   
    public void setStudents(Set<Student> students) {
        this.students = students;
    }
}
