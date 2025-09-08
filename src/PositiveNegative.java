//11. Write a program to check whether an inputted number is positive or negative.

import java.util.Scanner;
class PositiveNegative
{
    public static void main(String[ ] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if(num > 0)
            System.out.println("Positive number");
        else
            System.out.println("Negative number");
        sc.close();
    }
}
