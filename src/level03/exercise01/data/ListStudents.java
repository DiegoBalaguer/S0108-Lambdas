package level03.exercise01.data;

import level03.exercise01.application.ApplicationWorkers;
import level03.exercise01.model.Student;

public class ListStudents {

    public static void addStudents(ApplicationWorkers applicationWorkers) {
        applicationWorkers.addStudent(new Student("Emma Johnson", 20, "JAVA", 6));
        applicationWorkers.addStudent(new Student("Liam Smith", 17, "PHP", 4));
        applicationWorkers.addStudent(new Student("Olivia Williams", 22, "JAVA", 8));
        applicationWorkers.addStudent(new Student("Noah Brown", 19, "PYTHON", 5));
        applicationWorkers.addStudent(new Student("Ava Jones", 18, "JAVA", 7));
        applicationWorkers.addStudent(new Student("William Davis", 16, "PHP", 6));
        applicationWorkers.addStudent(new Student("Sophia Miller", 21, "C++", 5));
        applicationWorkers.addStudent(new Student("James Wilson", 23, "JAVA", 4));
        applicationWorkers.addStudent(new Student("Isabella Taylor", 20, "PHP", 9));
        applicationWorkers.addStudent(new Student("Benjamin Anderson", 19, "JAVA", 10));
    }
}
