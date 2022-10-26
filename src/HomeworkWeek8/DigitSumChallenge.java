package HomeworkWeek8;

public class DigitSumChallenge
{
    public static int sumDigits(int number)
    {
        if (number<=9){
            return -1;
        }
        int sumDigits=0;
        //convert number to string
        String numberToString=Integer.toString(number);
        for (char c: numberToString.toCharArray())
        {
           sumDigits=sumDigits+Integer.parseInt(String.valueOf(c));
        }
        return sumDigits;
    }
    public static void main(String[] args){
        System.out.println("Sum of 125 is= "+sumDigits(125));
        System.out.println("Sum of -5 is = "+sumDigits(-5));
        System.out.println("Sum of 371 is= "+sumDigits(371));
        System.out.println("Sum of 25 is= "+sumDigits(25));
    }
}
