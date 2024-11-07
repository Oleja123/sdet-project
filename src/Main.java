import lection1.abstracts.AbstractHelicopter;
import lection1.helicopters.AttackHelicopter;
import lection1.helicopters.CargoHelicopter;
import lection1.helicopters.MinigunHelicopter;
import lection1.helicopters.RocketLauncherHelicopter;
import lection1.helicopters.supportive.Cargo;
import lection4.collections.StudentsCollection;
import lection4.entities.Student;

import java.util.List;

public class Main {

    public static void printStudents(List<Student> students, int course) {
        students.stream().filter(x -> x.getCourse() == course).forEach(x -> System.out.println(x.getName()));
    }

    public static void checkLection4(){
        StudentsCollection studentsCollection = new StudentsCollection();

        Student student1 = new Student("Баринов Виктор", "Кухня", 4);
        student1.getMarks().put("Математика", 2);
        student1.getMarks().put("Русский язык", 3);
        student1.getMarks().put("Кулинарное искусство", 5);

        Student student2 = new Student("Лавров Максим", "Кухня", 1);
        student2.getMarks().put("Математика", 2);
        student2.getMarks().put("Русский язык", 2);
        student2.getMarks().put("Кулинарное искусство", 4);

        Student student3 = new Student("Чуганин Арсений", "Кухня", 3);
        student3.getMarks().put("Математика", 4);
        student3.getMarks().put("Русский язык", 3);
        student3.getMarks().put("Кулинарное искусство", 3);

        Student student4 = new Student("Гончарова Виктория", "Администрация", 4);
        student4.getMarks().put("Математика", 4);
        student4.getMarks().put("Русский язык", 5);
        student4.getMarks().put("Кулинарное искусство", 2);

        Student student5 = new Student("Нагиев Дмитрий", "Администрация", 4);
        student5.getMarks().put("Математика", 2);
        student5.getMarks().put("Русский язык", 2);
        student5.getMarks().put("Кулинарное искусство", 2);

        studentsCollection.addStudent(student1);
        studentsCollection.addStudent(student2);
        studentsCollection.addStudent(student3);
        studentsCollection.addStudent(student4);
        studentsCollection.addStudent(student5);

        printStudents(studentsCollection.getStudents(), 4);
        System.out.println();
        printStudents(studentsCollection.getStudents(), 1);
        System.out.println();
        studentsCollection.getStudents().forEach(x -> System.out.println(x.getName()));
        studentsCollection.updateStudents();
        System.out.println();
        studentsCollection.getStudents().forEach(x -> System.out.println(x.getName()));
        System.out.println();
        printStudents(studentsCollection.getStudents(), 5);
        System.out.println();
        printStudents(studentsCollection.getStudents(), 4);
        System.out.println();
    }

    public static void main(String[] args) {
        checkLection4();
    }
}
