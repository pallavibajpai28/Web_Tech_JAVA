// WAJP to find average of all the digit in a given number 
class AverageOfDigit
{

    public static void main(String [] args)
    {   
        int num=722;
        int sum=0;
        //! dont use this logic
        float average=0; //Don't Do this 
        int count=0;
        while(num>0)
        {
            int lastdigit=num%10;
            sum+=lastdigit;
            num/=10;
            count++;
         }
        //! average=sum/count;--> average is wrong
        System.out.println((double)sum/count); /// Best approach
   
    }
}
