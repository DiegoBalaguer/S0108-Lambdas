package level02.exercises01to04;


import level02.exercises01to04.application.ApplicationController;

/**
 * PROGRAM: Main
 * AUTHOR: Diego Balaguer
 * DATE: 01/05/2025
 */

public class Main {

    public static void main(String[] args) {

        ApplicationController applicationController = new ApplicationController();

        applicationController.run();

        System.out.println("PROCESS FINISHED...");
    }
}