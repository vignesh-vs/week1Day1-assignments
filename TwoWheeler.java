package week1.day1.assignments;

public class TwoWheeler {
	
	int noOfWheels = 4;
	short noOfMirrors = 2;
	long chassisNumbers = 1234567L;
	boolean isPunctured = false;
	String bikeName = "BMW";
	double runningKM = 250000;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoWheeler details   = new TwoWheeler ();
		System.out.println(details.noOfWheels);
		System.out.println(details.noOfMirrors);
		System.out.println(details.isPunctured);
		System.out.println(details.bikeName);
		System.out.println(details.runningKM);
	}

}




/*
*_Assignment1_*
Create a class for TwoWheeler and declare below variables with appropriate values
int noOfWheels
short noOfMirrors
long chassisNumber
boolean isPunctured
String bikeName
double runningKM
create object for TwoWheeler and call all the variables inside main method and print the values.

*/
