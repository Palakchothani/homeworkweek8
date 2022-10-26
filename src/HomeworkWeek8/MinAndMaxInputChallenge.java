package HomeworkWeek8;

import java.util.Scanner;

public class MinAndMaxInputChallenge
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number (or -1 to stop): ");
        int num=s.nextInt();
        int min=num;
        int max=num;
        while(num!=-1)
        {
            if(num>max)
            {
                max=num;
            }else if(num<min)
            {
                min=num;
            }
            System.out.println("Type a number (or -1 to stop);");
            num=s.nextInt();
        }
        if(max!=-1 && min !=-1)
        {
            System.out.println("Maximum was " +max);
            System.out.println("Minimum was "+min);
        }
    }
}
