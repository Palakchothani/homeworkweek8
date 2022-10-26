package HomeworkWeek8;

public class Question5
{
    public static boolean isPalindrome(int number)
    {
        int temp=number;
        int reverse = 0;
        while(number!=0)
        {
            int lastDigit = number % 10;
            reverse = reverse * 10;
            reverse = reverse + lastDigit;
            number = number / 10;
        }
        if(temp==reverse)
        {
            System.out.println("Number is palindrome.");
            return true;
        }else
        {
            System.out.println("Number is not palindrome.");
            return false;
        }
    }
    public static void main(String[] args)
    {
        System.out.println("1221");
        isPalindrome(1221);
        System.out.println("707");
        isPalindrome(707);
        System.out.println("11212");
        isPalindrome(11212);
        System.out.println("12321");
        isPalindrome(12321);
        System.out.println("1001");
        isPalindrome(1001);
        System.out.println("121");
        isPalindrome(121);

    }
}
