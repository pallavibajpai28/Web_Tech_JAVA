package DownCasting;

public class Cab {
 
	static {
		System.out.println("Dear Rider, Your Cab is Booked!!");
	}
	String CabDriverName;
	int CabNo;
	int DriverNo;
	
	Cab(String CabDriverName,int CabNo,int DriverNo)
	{
	this.CabDriverName = CabDriverName;
	this.CabNo = CabNo;
	this.DriverNo = DriverNo;
	}
	
}
