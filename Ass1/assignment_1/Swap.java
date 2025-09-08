//4. Write a program to swap two numbers without using a third variable.

import java.util.Scanner;
class Swap
{
    public static void main(String[ ] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int b = sc.nextInt();
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping: a = " + a + ", b = " + b);
        sc.close();
    }
}
