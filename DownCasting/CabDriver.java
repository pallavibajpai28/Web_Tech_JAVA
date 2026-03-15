package DownCasting;
import java.util.Scanner;
public class CabDriver {
public static void main(String[] args)     
{
	System.out.println("Welcome To Ola Services!!!");
	System.out.println("Press 1 to Book Mini");
	System.out.println("Press 2 to Book Mini");
	System.out.println("Press 3 to Book Mini");
	System.out.println("Enter your Choice : ");
	
	Scanner sc = new Scanner(System.in);
	int choice = sc.nextInt();
	
	Cab c = null;
	
	switch(choice)
	{
	case 1 ->
	{
		c = new Mini("Suresh", 2309, 40, 1500, 3, 4, "Non-AC");
		Mini m = (Mini)c;
		m.printDetails();
	}
	
	case 2 ->
	{
		c = new Sedan("Ramesh", 3309, 10, 2000, 4, 5, "AC");
		Sedan s = (Sedan)c;
		s.printDetails();
	}
	
	case 3 ->
	{
		c = new Suv("Vedu  Baby", 4407,27, 3500, 2, 6, "AC");
		Suv suv = (Suv)c;
		suv.printDetails();
	}
  }
 }
}
