//7. Write a program to input the time value in seconds and then display it in the hour: minute: second format using the modulus operator (%). For example, INPUT: Enter the time in second: 3610 OUTPUT: 1Hour: 0 minute: 10 seconds

import java.util.Scanner;
class TimeFormat
{
    public static void main(String[ ] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter time in seconds: ");
        int totalSeconds = sc.nextInt();
        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;
        System.out.println(hours + " Hour : " + minutes + " Minute : " + seconds + " Seconds");
        sc.close();
    }
}
