//write a java prog to identify the summation of even index elements and the average of odd index elements
import java.util.Scanner;
public class ex7  {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the size of the Array : ");
        int size = s.nextInt();
        int[] arr = new int[size];

        //storing elements using for loop 
        System.out.println("Enter "+arr.length+ " Elements in an array");
        
        for(int i=0; i<arr.length; i++)
        {
         arr[i] = s.nextInt();
        }

        int evensum = 0;
        int oddsum = 0;
        int oddcount = 0;
        for(int i=0; i<arr.length; i++)
        {
            if(i%2==0)
            {
            evensum = evensum + arr[i];  
            }

            else{
                oddsum = oddsum + arr[i];
                oddcount++;
            }

       
    }
    System.out.println("The Summation of Even elements is : "+evensum);
    System.out.println("The Average of Odd elements is : "+oddsum/oddcount);
}}