//6. Write a program to input the marks of a student in three different subjects and then display the average mark.

import java.util.Scanner;
class AverageMarks
{
    public static void main(String[ ] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks in Subject 1: ");
        double m1 = sc.nextDouble();
        System.out.print("Enter marks in Subject 2: ");
        double m2 = sc.nextDouble();
        System.out.print("Enter marks in Subject 3: ");
        double m3 = sc.nextDouble();
        double avg = (m1 + m2 + m3) / 3;
        System.out.println("Average = " + avg);
        sc.close();
    }
}
