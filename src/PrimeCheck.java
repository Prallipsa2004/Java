//9. Write a program to check a number is prime or not.

import java.util.Scanner;
class PrimeCheck
{
    public static void main(String[ ] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        boolean prime = true;
        if(num <= 1) prime = false;
        else
        {
            for(int i = 2; i <= num/2; i++)
            {
                if(num % i == 0)
                {
                    prime = false;
                    break;
                }
            }
        }
        if(prime)
            System.out.println(num + " is Prime");
        else
            System.out.println(num + " is Not Prime");
        sc.close();
    }
}

