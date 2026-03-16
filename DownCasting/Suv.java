package DownCasting;

public class Suv extends Cab{
	int seats; 
	double fare;
	int rating;
	String carType;
	
	Suv(String CabDriverName,int CabNo,int DriverNo, int seats, double fare,int rating,String carType)
	{
		super(CabDriverName, CabNo, DriverNo);
		this.seats = seats;
		this.fare = fare;
		this.rating = rating; 
		this.carType = carType;	
	}
	
	void printDetails()
	{
		System.out.println("SUV Driver name : "+CabDriverName);
		System.out.println("SUV Cab No : "+CabNo);
		System.out.println("SUV Driver No : "+DriverNo);
		System.out.println("SUV Seats No : "+seats);
		System.out.println("SUV Fare : "+fare);
		System.out.println("SUV Rating : "+rating);
		System.out.println("SUV Car Type(Ac/Non-Ac) : "+carType);
	}
}
