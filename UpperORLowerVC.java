import java.util.Scanner;
class UpperORLowerVC {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a single alphabet character: ");
        char ch= sc.next().charAt(0);

        switch (ch) {
            case 'A', 'E', 'I', 'O', 'U':
            {
                System.out.println(ch + " is an Uppercase Vowel.");
                break;
            }
                
            case 'a', 'e', 'i', 'o', 'u':
            {
                System.out.println(ch + " is a Lowercase Vowel.");
                break;
            }

            default :
            {
                if( ch>='A' && ch<='Z' )
                {
                    System.out.println(ch + " is an Uppercase Consonant.");
                }
                else if( ch>='a' && ch<='z' )
                {
                    System.out.println(ch + " is a Lowercase Consonant.");
                }
                else
                {
                    System.out.println(ch + " is not an alphabet character.");
                }
              
          }
      }
   }
}
