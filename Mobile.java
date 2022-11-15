package week1.day1.assignments;

public class Mobile {
	
	String  mobileBrandName = "Apple";
	char mobileLogo = 'A';
	short noOfMobilePiece = 100;
	int modelNumber = 123;
	long mobileImeiNumber = 12345678901234L;
	float mobilePrice = 29000f;
	boolean isDamaged = false;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Mobile modetails = new Mobile();
		 System.out.println(modetails.mobileBrandName);
		 System.out.println(modetails.mobileLogo);
		 System.out.println(modetails.noOfMobilePiece);
		 System.out.println(modetails.modelNumber);
		 System.out.println(modetails.mobileBrandName);
		 System.out.println(modetails.mobilePrice);
		 System.out.println(modetails.isDamaged);
	}

}






/*
Create a class for Mobile and declare below variables with appropriate values
String mobileBrandName
char mobileLogo
short noOfMobilePiece
int modelNumber
long mobileImeiNumber
float mobilePrice
boolean isDamaged
create object for Mobile and call all the variables inside main method and print the values.
*/