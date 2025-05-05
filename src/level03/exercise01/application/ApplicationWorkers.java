package level03.exercise01.application;

import level03.exercise01.Utils.StringUtils;
import level03.exercise01.model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * PROGRAM: AplicationWorkers
 * AUTHOR: Diego Balaguer
 * DATE: 30/04/2025
 */

public class ApplicationWorkers {

    private ArrayList<Student> students;

    public ApplicationWorkers() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void listStudents() {
        System.out.println(StringUtils.formatToChars("NAME", 20) + "\t" +
                StringUtils.formatToChars("AGE", 4) + "\t" +
                StringUtils.formatToChars("COURSE", 8) + "\t" +
                StringUtils.formatToChars("GRADE", 8));

        students.forEach(s -> System.out.println(StringUtils.formatToChars(s.getName(), 20) + "\t" +
                StringUtils.formatToChars(String.valueOf(s.getAge()), 4) + "\t" +
                StringUtils.formatToChars(s.getCourse(), 8) + "\t" +
                StringUtils.formatToChars(String.valueOf(s.getGrade()), 8)));
    }

    public void showNamesAndAge() {
        System.out.println(StringUtils.formatToChars("NAME", 20) + "\t" +
                StringUtils.formatToChars("AGE", 4));

        students.forEach(s -> System.out.println(StringUtils.formatToChars(s.getName(), 20) + "\t" +
                StringUtils.formatToChars(String.valueOf(s.getAge()), 4)));
    }

    public void showNamesFirstChar(String inputString) {
        System.out.println(StringUtils.formatToChars("NAME", 20) + "\t" +
                StringUtils.formatToChars("GRADE", 8));

        List<Student> filteredStudents = students.stream()
                .filter(s -> s.getName().toUpperCase().startsWith(inputString.toUpperCase()))
                .collect(Collectors.toList());

        filteredStudents
                .forEach(s -> System.out.println(StringUtils.formatToChars(s.getName(), 20) + "\t" +
                        StringUtils.formatToChars(String.valueOf(s.getGrade()), 8)));
    }

    public void showGradeEqualOrMajor(double inputGrade) {
        System.out.println(StringUtils.formatToChars("NAME", 20) + "\t" +
                StringUtils.formatToChars("GRADE", 8));

        students.stream()
                .filter(s -> s.getGrade() >= inputGrade)
                .forEach(s -> System.out.println(StringUtils.formatToChars(s.getName(), 20) + "\t" +
                        StringUtils.formatToChars(String.valueOf(s.getGrade()), 8)));
    }

    public void showGradeEqualOrMajorAndCuourseNotEqual(double inputGrade, String inputCuourse) {
        System.out.println(StringUtils.formatToChars("NAME", 20) + "\t" +
                StringUtils.formatToChars("COURSE", 8) + "\t" +
                StringUtils.formatToChars("GRADE", 8));

        students.stream()
                .filter(s -> s.getGrade() >= inputGrade && !s.getCourse().equalsIgnoreCase(inputCuourse))
                .forEach(s -> System.out.println(StringUtils.formatToChars(s.getName(), 20) + "\t" +
                        StringUtils.formatToChars(s.getCourse(), 8) + "\t" +
                        StringUtils.formatToChars(String.valueOf(s.getGrade()), 8)));
    }

    public void showCourseEqualAndAdult(String inputCourse, int inputAge) {
        System.out.println(StringUtils.formatToChars("NAME", 20) + "\t" +
                StringUtils.formatToChars("AGE", 4) + "\t" +
                StringUtils.formatToChars("COURSE", 8));

        students.stream()
                .filter(s -> s.getCourse().equalsIgnoreCase(inputCourse) && s.getAge() >= inputAge)
                .forEach(s -> System.out.println(StringUtils.formatToChars(s.getName(), 20) + "\t" +
                        StringUtils.formatToChars(String.valueOf(s.getAge()), 4) + "\t" +
                        StringUtils.formatToChars(s.getCourse(), 8)));
    }
}
