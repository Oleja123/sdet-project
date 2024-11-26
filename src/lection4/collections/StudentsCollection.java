package lection4.collections;

import lection4.entities.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentsCollection {
    private List<Student> students = new ArrayList<>();

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public void updateStudents(){
        students = students.stream().filter(
                x -> (x.getMarks()
                        .values()
                        .stream()
                        .mapToDouble(Integer::doubleValue)
                        .sum()) / x.getMarks().size() >= 3.0
        ).collect(Collectors.toList());
        students.forEach(x -> x.setCourse(x.getCourse() + 1));
    }
}
