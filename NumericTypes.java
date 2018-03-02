//by Avi Ghimire
//10/12/2016
// TASK #2 Add an import statement for the Scanner class
import java.util.Scanner;
// TASK #2(Alternate)
// Add an import statement for the JOptionPane class

/**
   This program demonstrates how numeric types and
   operators behave in Java.
*/

public class NumericTypes
{
   public static void main (String [] args)
   {
      // TASK #2 Create a Scanner object here
	   Scanner keyboard = new Scanner(System.in);
      // (not used for alternate)

      // Identifier declarations
      final int NUMBER = 2 ;        // Number of scores
      float SCORE1 = 100f;       // First test score
      final int SCORE2 = 95;        // Second test score
      final int BOILING_IN_F = 212; // Boiling temperature
      int fToC;                     // Temperature Celsius
      double average;               // Arithmetic average
      String output;                // Line of output

      // TASK #2 declare variables used here
      String lastname;
      String firstname;
      String fullname;
      // TASK #3 declare variables used here
      // TASK #4 declare variables used here

      // Find an arithmetic average.
      average = (SCORE1 + SCORE2)/ NUMBER;
      output = SCORE1 + " and " + SCORE2 +
               " have an average of " + average;
      System.out.println(output);

      // Convert Fahrenheit temperature to Celsius.
      fToC = 5 * (BOILING_IN_F - 32)/9;
      output = BOILING_IN_F + " in Fahrenheit is " +
               fToC + " in Celsius.";
      System.out.println(output);
      System.out.println();      // To leave a blank line

      // ADD LINES FOR TASK #2 HERE
      
      // Prompt the user for first name
      System.out.println("What is first name?");
      // Read the user's first name
      firstname = keyboard.next();
      // Prompt the user for last name
      System.out.println("What is last name?");
      // Read the user's last name
      lastname = keyboard.next();
      // Concatenate the user's first and last names
      fullname = firstname+lastname;
      // Print out the user's full name
      System.out.println(fullname);
      System.out.println();      // To leave a blank line

      // ADD LINES FOR TASK #3 HERE
      char letter;
      // Get the first character from the user's first name
      String firstname1 ="Avi";
      // Print out the user's first initial
      letter= firstname1.charAt(0);	
      System.out.println(letter);
      // Convert the user's full name to uppercase
      String fullname1="Avi Ghimire";
      String uppercase = fullname1.toUpperCase();
      // Print out the user's full name in uppercase
      System.out.println(uppercase);
      int fullnameSize = fullname1.length(); //To get length of fullname
      System.out.println(fullnameSize);  
      System.out.println();      // To leave a blank line

      // ADD LINES FOR TASK #4 HERE
      // Prompt the user for a diameter of a sphere
      double diameter;
      
      
      // Read the diameter
       
      System.out.print("What is the diameter of the circle? ");
      
      diameter = keyboard.nextDouble();
      // Calculate the radius
      double radius = diameter/2;           
      // Calculate the volume
      double volume = (4.0 / 3.0) * Math.PI* Math.pow(radius,3);
      
      // Print out the volume
      System.out.println("The volume of the sphere is : " + volume);
   }
}