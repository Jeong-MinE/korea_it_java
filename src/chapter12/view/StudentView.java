package chapter12.view;


import chapter12.StudentManagement;
import chapter12.controller.StudentController;
import chapter12.model.Student;

import java.io.PipedReader;
import java.util.List;
import java.util.Scanner;
import java.util.stream.StreamSupport;

public class StudentView {
    private Scanner scanner;
    private StudentController controller;

    public StudentView() {
        this.scanner = new Scanner(System.in);
        this.controller = new StudentController();
    }

    public void showMenu() {
        while (true) {
            System.out.println("=== Student Management System ===");
            System.out.println("1. Add a student");
            System.out.println("2. Show all Student");
            System.out.println("3. Find a student");
            System.out.println("4. Update a student");
            System.out.println("5. Delete student");
            System.out.println("6. Quit");
            System.out.println("Choice an option >>>");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addStudentView();
                    break;
                case 2:
                    showallStudentView();
                    break;
                case 3:
                    findStudentView();
                    break;
                case 4:
                    updateStudentView();
                    break;
                case 5:
                    removeStudentView();
                    break;
                case 6:
                    System.out.println("=======Process Exit =========");
                    ;
                    return;
            }
        }
    }

    private void showallStudentView() {
    }

    private void addStudentView() {
        System.out.println("Enter Student Name: ");
        String name = scanner.nextLine();
        System.out.println("Enter Student Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter Student ID: ");
        String id = scanner.nextLine();

        controller.addStudent(name, age, id);
        System.out.println("Student added successfully");
    }
    private void showAllStudentView() {
        List<Student> student = controller.getAllStudents();

        for (Student sutdnet : student) {
            System.out.println(student.toString());
        }
    }

    private void findStudentView() {
        System.out.println("Enter Student ID to find: ");
        String id = scanner.nextLine();
        Student student = controller.findStudentById(id);
        if (student != null) {
            System.out.println(student);
        }else {
            System.out.println("Student not found");
        }
    }

    private void updateStudentView() {
        System.out.println("Enter Student Id to update: ");
        String id = scanner.nextLine();
        System.out.println("Enter new Name: ");
        String newName = scanner.nextLine();
        System.out.println("Enter new Age: ");
        int newAge = scanner.nextInt ();
        scanner.nextLine();

        if (controller.updateStudent(id, newName, newAge)) {
            System.out.println("Student updated successfully.");
        }else {
            System.out.println("Student not found");
        }
    }



    private void removeStudentView() {
        System.out.println("Enter Student Id to remove: ");
        String id = scanner.nextLine();
        System.out.println("Enter ");

    }

}