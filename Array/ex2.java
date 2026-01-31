import java.util.Scanner;
public class ex2 {
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

        System.out.println("The length of the array is " +arr.length);

        //Accessing the elements usning for loop

        System.out.println("The Even Elements are");
        for(int i=0; i<arr.length; i++)
        {
        if(arr[i]%2 == 0)
            System.out.println(arr[i]);
        }

    }

        
}

