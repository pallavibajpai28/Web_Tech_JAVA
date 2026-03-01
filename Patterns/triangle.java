// Print Pattern lower triangle
// *
// * *
// * * *
// * * * *
// * * * * *

// way1
class triangle {
    public static void main(String[] args) throws Exception {
        int num = 5; // num of the window pattern
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                if (i >= j) { // explaination : i>=j is for filling the left triangle
                    System.out.print("* ");
                } else {
                    System.out.print("  ");  
                }
                Thread.sleep(100); // Adding a small delay for better visualization
            }
            System.out.println();
        }
    }
    
}


//way2 - more optimized code, no need of if-else it is only going to the coordinates where star is to be printed
class triangle1 {
    public static void main(String[] args) throws Exception {
        int num = 5; // num of the window pattern
        for (int i = 1; i <= num; i++)
      {
            for (int j = 1; i >= j; j++) 
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}




// Print Pattern upper triangle
// * * * * *
// * * * * 
// * * * 
// * * 
// * 

// way1
class triangle2 {
    public static void main(String[] args) {
        int num = 5;
        for (int i = 1; i <= num; i++)
        {
            for (int j = num; j >= i; j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}



// way2

class triangle2_1{
    public static void main(String[] args) {
        int num = 5;
        for (int i = 1; i <= num; i++)
        {
            for (int j = 1; j <= num; j++)
            {
                if( i + j <= num+1)
                {
                System.out.print("* ");
                }
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}





//mirror triangle of 1st triangle
//         * 
//       * * 
//     * * * 
//   * * * * 
// * * * * * 
class triangle3 {
    public static void main(String[] args) throws Exception {
        int num = 5; // num of the window pattern
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                if (i + j > num) { 
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
                Thread.sleep(100); // Adding a small delay for better visualization
            }
            System.out.println();
        }
    }
    
}




// Print
// * * * * * 
//   * * * * 
//     * * * 
//       * * 
//         * 
class triangle4 {
    public static void main(String[] args) throws Exception {
        int num = 5; // num of the window pattern
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                if (i <= j) { // explaination : i>=j is for filling the left triangle
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
                Thread.sleep(100); // Adding a small delay for better visualization
            }
            System.out.println();
        }
    }
    
}



// print triangle4 but number
//  1 1 1 1 1
//    2 2 2 2
//      3 3 3
//        4 4
//          5
class triangle4Num {
    public static void main(String[] args)  {
        int num = 5; 
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                if (i <= j) { 
                    System.out.print(" "+i);
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    
}



// print 1st triangle but instead of star print alphabet
// A         
// B C       
// D E F     
// G H I J   
// K L M N O 
class triangleAlpha {
    public static void main(String[] args) {
        int num = 5; 
        char ch = 'A';
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                if (i >= j) { 
                    System.out.print(ch++ +" ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    
}




// print 1st triangle but instead of star print alphabet
// A         
// A B
// A B C
// A B C D
// A B C D E
class triangleAlpha1 {
    public static void main(String[] args) {
        int num = 5;       
        for (int i = 1; i <= num; i++) {
            char ch = 'A';
            for (int j = 1; j <= num; j++) {
                if (i >= j) { 
                    System.out.print(ch++ +" ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
            
        }
    }
    
}
