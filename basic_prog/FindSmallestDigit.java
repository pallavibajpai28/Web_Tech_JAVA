class FindSmallestDigit
{
    public static void main(String [] args)
    {
        int num=1269;
        num=Math.abs(num); //! Works for negative number also 
        int smallerdigit=num%10;
        while(num>0)
        {
            int lastdigit=num%10; 
            if(lastdigit<smallerdigit)
            {
                smallerdigit=lastdigit;
            }
            num/=10;
        }
        System.out.println(smallerdigit);
    }
}
