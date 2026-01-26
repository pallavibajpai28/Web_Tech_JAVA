import java.util.Scanner;
class vORcORdORs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a single alphabet character: ");
        char ch = sc.next().charAt(0);

        if( ch>='A' && ch<='Z' || ch>='a' && ch<='z' ) 
            {
              switch (ch) {
            case 'a', 'e', 'i', 'o', 'u',
                 'A', 'E', 'I', 'O', 'U':
                 {
                    System.out.println(ch + " is a Vowel.");
                    break;
                 }
            default :
            {
                 System.out.println(ch + " is a Consonant.");
            }
          }
         }

         else if( ch>='0' && ch<='9' )
         {
            System.out.println(ch + " is a Digit.");
         }
         else 
         {
            System.out.println(ch + " is a Special Character.");
         }
        }
    }

