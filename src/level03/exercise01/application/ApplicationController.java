package level03.exercise01.application;

import level03.exercise01.data.ListStudents;

import java.util.List;

/**
 * PROGRAM: AplicationController
 * AUTHOR: Diego Balaguer
 * DATE: 01/05/2025
 */

public class ApplicationController {

    public void run() {

        System.out.println(System.lineSeparator() + "* EXERCISES STUDENTS.................."+ System.lineSeparator());

        ApplicationWorkers workers = new ApplicationWorkers();

        ListStudents.addStudents(workers);
        System.out.println("*** List of Students: " + System.lineSeparator());
        workers.listStudents();

        System.out.println(System.lineSeparator() + "** Exercise01 - show name and age of students............." + System.lineSeparator());
        System.out.println("*** Result:");
        workers.showNamesAndAge();

        System.out.println(System.lineSeparator() + "** Exercise02 - show name with first char is 'A' ............." + System.lineSeparator());
        System.out.println("*** Result:");
        workers.showNamesFirstChar("A");

        System.out.println(System.lineSeparator() + "** Exercise03 - students grade above 5 ............." + System.lineSeparator());
        System.out.println("*** Result:");
        workers.showGradeEqualOrMajor(5);

        System.out.println(System.lineSeparator() + "** Exercise04 - students course PHP and grade above 5............." + System.lineSeparator());
        System.out.println("*** Result:");
        workers.showGradeEqualOrMajorAndCuourseNotEqual(5, "PHP");

        System.out.println(System.lineSeparator() + "** Exercise05 - students course JAVA and Adult ............." + System.lineSeparator());
        System.out.println("*** Result:");
        workers.showCourseEqualAndAdult("JAVA", 18);

        System.out.println(System.lineSeparator() + "✅ process completed correctly");
    }
}
