/**
 * Name: Homework 1
 * Author: Shinyeob Kim
 * Due Date:8/3/2017
 * Purpose: This program will ask the users to enter Student ID, quiz grades, calculate their age in months 
 * and convert it in ages and current temperature in degrees Celsius and convert it to Fahrenheit.
 */

import java.util.Scanner; //
public class ShinyeobKimHwOne {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //Scanner 
		
		String DEGREE = "\u00b0"; //Unicode for degree for celcius and farenheit
		
		System.out.println("Enter your Student EMPLID (0 - 999999):" ); //User inputs student ID
		int i = sc.nextInt(); //Scan student Id
		
		System.out.println("Enter your Quiz 1 percentage score (0.0 - 100.0):");
		double quiz1 = sc.nextDouble(); //Scans user input for Quiz 1 Score
		
		System.out.println("Enter your Quiz 2 percentage score (0.0 - 100.0):");
		double quiz2 = sc.nextDouble();//Scans user input for Quiz 2 Score
		
		System.out.println("Enter your Quiz 3 percentage score (0.0 - 100.0):");
		double quiz3 = sc.nextDouble();//Scans user input for Quiz 3 Score
		
		System.out.println("Enter your age in months: (0 - 1440):");
		short age = sc.nextShort();//Scans user input for his or her age in months
		
		System.out.println("Enter the current Temperature in degrees Celsius:");
		double celsius = sc.nextDouble();//Scans user input for current temperature in celcius
		
		System.out.println("\n ******RESULTS******"+"\n Student EMPLID:" + i +
				"\n Quiz 1 Score:" +quiz1 + "\n Quiz 2 Score:" + quiz2 + "\n Quiz 3 Score:" 
				+ quiz3 + "\n Average quiz score:" +((quiz1+quiz2+quiz3)/3) +
				"\n Age in months:"+age+"\n Age in years:"+ (age/12)+ 
				"\n Temperature in Celsius:" + celsius + DEGREE +
				"\n Temperature in Farenheit:" + (celsius*1.8+32+DEGREE)); 
		
		/** Results are programmed above
		 * Quiz average was all added and divided by three
		 * Age in months was divided by 12 to show age in years
		 * Temperature  in celsius was multiplied by 1.8 and added 32 to convert to Farenheit
		 */



		

		
		
		
		
		
	}

}
