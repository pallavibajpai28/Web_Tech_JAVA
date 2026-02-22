import java.util.Scanner;
import java.util.Random;
class zomato {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);  
        Random r = new Random();
        int num = r.nextInt(9999);

        System.out.println("Welcome to Zomato!");
        System.out.print("Please select your Food: ");
        System.out.println("Press 1 for Breakfast");
        System.out.println("Press 2 for Lunch");
        System.out.println("Press 3 for Dinner");
        System.out.println("Press 4 for Soft Drinks");
        System.out.println("Press 5 for Desserts");
        String food = sc.nextLine();

        switch(food)
        {
            case "1":
            {
                System.out.println("You have selected Breakfast.");
                System.out.println("Press 1 for Poha");
                System.out.println("Press 2 for Idli");
                System.out.println("Press 3 for Paratha");
                String breakfast = sc.nextLine();

                switch (breakfast) {
                    case "1":
                    {
                        System.out.println("Your Poha is Getting Ready in 5 mins!!!");
                        break;
                    }

                     case "2":
                    {
                        System.out.println("Your Idli is Getting Ready in 5 mins!!!");
                        break;
                    }

                     case "3":
                    {
                        System.out.println("Your Paratha is Getting Ready in 5 mins!!!");
                        break;
                    }   
                }   
                break; 
            }
            
            case "2":
            {
                System.out.println("You have selected Lunch.");
                System.out.println("Press 1 for Biryani");
                System.out.println("Press 2 for Paneer Chilli & Roti");
                System.out.println("Press 3 for Paneer Thali");
                String lunch = sc.nextLine();

                switch (lunch) {
                    case "1":
                    {
                        System.out.println("Your Biryani is Getting Ready in 5 mins!!!");
                        break;
                    }

                     case "2":
                    {
                        System.out.println("Your Paneer Chilli & Roti is Getting Ready in 5 mins!!!");
                        break;
                    }

                     case "3":
                    {
                        System.out.println("Your Paneer Thali is Getting Ready in 5 mins!!!");
                        break;
                    }   
                }   
                break; 
            }


            case "3":
            {
                System.out.println("You have selected Dinner.");
                System.out.println("Press 1 for Mutton Biryani");
                System.out.println("Press 2 for Paneer Gravy & Roti");
                System.out.println("Press 3 for Spl Paneer Thali");
                String dinner = sc.nextLine();

                switch (dinner) {
                    case "1":
                    {
                        System.out.println("Your Mutton Biryani is Getting Ready in 5 mins!!!");
                        break;
                    }

                     case "2":
                    {
                        System.out.println("Your Paneer Gravy & Roti is Getting Ready in 5 mins!!!");
                        break;
                    }

                     case "3":
                    {
                        System.out.println("Your Spl Paneer Thali is Getting Ready in 5 mins!!!");
                        break;
                    }   
                }   
                break; 
            }



            case "4":
            {
                System.out.println("You have selected Soft Drinks.");
                System.out.println("Press 1 for Coke");
                System.out.println("Press 2 for Sprite");
                System.out.println("Press 3 for ThumbsUp");
                String softdrink = sc.nextLine();

                switch (softdrink) {
                    case "1":
                    {
                        System.out.println("Your Coke is Getting Ready in 5 mins!!!");
                        break;
                    }

                     case "2":
                    {
                        System.out.println("Your Sprite is Getting Ready in 5 mins!!!");
                        break;
                    }

                     case "3":
                    {
                        System.out.println("Your ThumbsUp is Getting Ready in 5 mins!!!");
                        break;
                    }   
                }   
                break; 
            }



            case "5":
            {
                System.out.println("You have selected Dessert.");
                System.out.println("Press 1 for Cake");
                System.out.println("Press 2 for icecream");
                System.out.println("Press 3 for Mithai");
                String dessert = sc.nextLine();

                switch (dessert) {
                    case "1":
                    {
                        System.out.println("Your Cake is Getting Ready in 5 mins!!!");
                        break;
                    }

                     case "2":
                    {
                        System.out.println("Your Icecream is Getting Ready in 5 mins!!!");
                        break;
                    }

                     case "3":
                    {
                        System.out.println("Your Mithai is Getting Ready in 5 mins!!!");
                        break;
                    }   
                }   
                break; 
            }
            
}
System.out.println("Your Order ID is: "+num);
    }
}
