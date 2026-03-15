package DownCasting;

public class Sedan extends Cab{
	int seats; 
	double fare;
	int rating;
	String carType;
	
	Sedan(String CabDriverName,int CabNo,int DriverNo, int seats, double fare,int rating,String carType)
	{
		super(CabDriverName, CabNo, DriverNo);
		this.seats = seats;
		this.fare = fare;
		this.rating = rating; 
		this.carType = carType;	
	}
	
	void printDetails()
	{
		System.out.println("Sedan Cab No : "+CabDriverName);
		System.out.println("Sedan Driver name : "+CabNo);
		System.out.println("Sedan Driver No : "+DriverNo);
		System.out.println("Sedan Seats No : "+seats);
		System.out.println("Sedan Fare : "+fare);
		System.out.println("Sedan Rating : "+rating);
		System.out.println("Sedan Car Type(Ac/Non-Ac) : "+carType);
}
}
