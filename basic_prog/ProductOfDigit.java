//WAJP to find out product of digit
public class ProductOfDigit
{
   public static void main(String [] args)
    {
        int num=87731;
        int product=1;
        
        while(num>0)
        {   
            int lastdigit=num%10;
            product*=lastdigit;
            num/=10;
        }
        System.out.println(product);
    }
}