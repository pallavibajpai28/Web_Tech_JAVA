package DownCasting;

public class Mini extends Cab{

	int seats; 
	double fare;
	int rating;
	String carType;
	
	Mini(String CabDriverName,int CabNo,int DriverNo, int seats, double fare,int rating,String carType)
	{
		super(CabDriverName, CabNo, DriverNo);
		this.seats = seats;
		this.fare = fare;
		this.rating = rating; 
		this.carType = carType;	
	}
	
	void printDetails()
	{
		System.out.println("Mini Driver name : "+CabDriverName);
		System.out.println("Mini Cab No : "+CabNo);
		System.out.println("Mini Driver No : "+DriverNo);
		System.out.println("Mini Seats No : "+seats);
		System.out.println("Mini Fare : "+fare);
		System.out.println("Mini Rating : "+rating);
		System.out.println("Mini Car Type(Ac/Non-Ac) : "+carType);
		
	}
}
