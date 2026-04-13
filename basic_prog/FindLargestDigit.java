class FindLargestDigit 
{
    public static void main(String [] args)
    {
        int num=1269;
        num=Math.abs(num); //! Works for negative number also 
        int largedigit=num%10;
        while(num>0)
        {
            int lastdigit=num%10;
            if(lastdigit>largedigit)  
            {
                largedigit=lastdigit;
            }
            num/=10;
        }
        System.out.println(largedigit);
    }
}
