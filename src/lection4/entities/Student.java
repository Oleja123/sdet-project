package lection4.entities;

import java.util.HashMap;
import java.util.Map;

public class Student {
    private String name, group;
    private int course;
    final Map<String, Integer> marks = new HashMap<>();

    public Student(String name, String group, int course){
        this.name = name;
        this.group = group;
        this.course = course;
    }

    Student(){}

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public int getCourse() {
        return course;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public Map<String, Integer> getMarks() {
        return marks;
    }
}
