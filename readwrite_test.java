import java.io.*;
import java.util.Scanner;
import java.util.Random;

public class readwrite_test {

	
	public static void main(String[] args)throws IOException {
		
		FileWriter fw = new FileWriter("/home/ag/Desktop/avi.txt",false);
		PrintWriter keyboard = new PrintWriter(fw);
		
		
		Random rangen= new Random();
		int count = 0;
		int sum = 0;
		while( count<100){
		int rand = rangen.nextInt(6)+1;
		keyboard.println(rand);
		if (rand==6){
		sum++;
		}
		count++;
		
		
		}
		double prob= sum/100.0;
		System.out.println("The probability of having 6 roling a dice is :  " + prob);
		keyboard.close();
		File filereader= new File("/home/ag/Desktop/avi.txt");
		Scanner scanreader= new Scanner (filereader);
		while(scanreader.hasNext()){
			
		
		int number= scanreader.nextInt();
		System.out.print(number+"  ");
		}
		
	}

}
