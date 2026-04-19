//WAJP to check the given number is palindrome or not
import java.util.*;
public class Palindrome {
    public static boolean isPalindrome(int n)
    {
        int rev=0;
        int original=n;

        while(n>0)      
        {
            int digit = n % 10;  //fetch last digit
            rev = rev *10 + digit; //store last digit in reverse
            n = n/10; //remove last digit from n
        }

        if(rev==original)
            return true;
        else    
            return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        System.out.println(isPalindrome(num));
    }
}
