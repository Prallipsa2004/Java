//Q2. Write a program to create a class named 'Student' with members 'name', 'roll', ‘branch’. Declare two methods to input the student details and display the details of the student. Create a Main class to test the functionalities of the above class.

import java.util.Scanner;

class student_cgpa {
    private String sic, name, branch;
    private double cgpa;

    public void initialize(String sic, String name, String branch, double cgpa) {
        if (cgpa < 0.0) {
            System.out.println("CGPA cannot be negative");
            System.exit(0);
        }
        this.sic = sic;
        this.name = name;
        this.branch = branch;
        this.cgpa = cgpa;
    }

    public void display() {
        System.out.println("SIC: " + sic);
        System.out.println("Name: " + name);
        System.out.println("Branch: " + branch);
        System.out.println("CGPA: " + cgpa);
        System.out.println();
    }

    public double getCgpa() {
        return cgpa;
    }
}

class Student_cgpa_data {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        student_cgpa[] students = new student_cgpa[5];

        System.out.println("Enter details of 5 Students: ");
        for (int i = 0; i < 5; i++) {
            students[i] = new student_cgpa();
            System.out.print("Enter SIC, Name, Branch and CGPA of the Student " + (i + 1) + ": ");
            String sic = sc.next();
            String name = sc.next();
            String branch = sc.next();
            double cgpa = sc.nextDouble();
            students[i].initialize(sic, name, branch, cgpa);
        }

        System.out.println("\nThe student details are: ");
        student_cgpa highestCgpa = students[0];
        for (student_cgpa student : students) {
            if (student.getCgpa() > highestCgpa.getCgpa()) {
                highestCgpa = student;
            }
            student.display();
        }

        System.out.println("Student with highest CGPA is:");
        highestCgpa.display();
    }
}