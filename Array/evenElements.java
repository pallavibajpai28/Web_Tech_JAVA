//Write a java prog to print even elements from an array

public class evenElements {
    public static void main(String[] args) {
        
        int[] arr = new int[7];

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 25;
        arr[3] = 33;
        arr[4] = 50;
        arr[5] = 64;
        arr[6] = 79;

        System.out.println(arr); //[I@372f7a8d
        System.out.println("Jenght of array is :" +arr.length); //7

        System.out.println("The Even Elements are");
        for(int i=0; i<arr.length; i++)
        {
        if(arr[i]%2 == 0)
            System.out.println(arr[i]);
        }

    }
}

