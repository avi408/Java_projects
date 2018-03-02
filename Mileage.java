//This program calculates the mileage of a car
//by Avi Ghimire
//10/12/2016

import java.util.Scanner;

public class Mileage {

	
	public static void main(String[] args) {
		
		System.out.println("This program will calculate mileage\n");
		double milesDriven;
		double gallons;
		Scanner input = new Scanner(System.in);
		System.out.println("What is the number of miles driven?");
		milesDriven = input.nextDouble();//Input the miles
		System.out.println("The number of miles driven is: " + milesDriven);
		System.out.println("What is the no of gallons used?");
  		gallons = input.nextDouble();//Input gallons
		System.out.println("The no of gallos used is : "+ gallons); 
		double MPG= milesDriven/gallons;// Formula to calculate mileage
		System.out.println("The milage of your car is: " + MPG);//Outputs the mileage of the car
	}

}
