//3.Write a program to input two floating point numbers through the keyboard and display their sum.

import java.util.Scanner;
class SumInput
{
    public static void main(String[ ] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        double a = sc.nextDouble();
        System.out.print("Enter 2nd number: ");
        double b = sc.nextDouble();
        double sum = a + b;
        System.out.println("Sum = " + sum);
        sc.close();
    }
}
