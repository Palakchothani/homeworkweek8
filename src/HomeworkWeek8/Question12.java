package HomeworkWeek8;

import java.util.Scanner;

public class Question12
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Input any number: ");
        int num = s.nextInt();

        for(int i=2;i<=Math.sqrt(num);i++)
        {

            if(num%i!=0 )
            {
                if(num%3==0 || num%5==0)
                {
                    System.out.println("It is not a prime number.");
                }
                else
                {
                    System.out.println("It is a prime number.");
                }
            }else
            {
                System.out.println("It is not a prime number");
            }
            break;

        }
        s.close();

    }
}
