//Aemun Ahmar 1047508
//CSCI 260 - M02: Fall 2017
//Professor Sandra Kopecky
//Assignment 1: Days Between
//September 21, 2017

import java.util.Scanner;

public class DaysBetween 
{
	public static void main(String[] args)
	{
		Scanner conIn = new Scanner(System.in);
		int day, month, year;
		
		//Introduction to program and implementing user input for object Date 1
		System.out.println("Enter two 'modern' dates: month, day, year");
		System.out.println("For example: January 12, 1954 owuld be 1 12 1954");
		System.out.println();
		System.out.println("Modern dates occur after " + Date.MINYEAR + ".");
		System.out.println();
		System.out.println("Enter the first date: ");
		
		month = conIn.nextInt();
		day = conIn.nextInt();
		year = conIn.nextInt();
		
		Date date1 = new Date(month, day, year);

		//Implementing user input for object Date 2
		System.out.println("Enter the second date: ");
		
		month = conIn.nextInt();
		day = conIn.nextInt();
		year = conIn.nextInt();
		
		Date date2 = new Date(month, day, year);
		
		if((date1.getYear() <= Date.MINYEAR) || date2.getYear() <= Date.MINYEAR)
		{
			System.out.println("You entered a 'pre-modern' date.");
		} else
		{
			//Calculates days between two dates
			System.out.println("\nThe number of days between " + date1 + "and " + date2
					+ "is: ");
			System.out.println(Math.abs(date1.lilian() - date2.lilian()));	
			
			//Calculates leap years between two dates
			System.out.println("\nThe number of leap years between " + date1 + "and " + date2
					+ "is: ");
			System.out.println((Math.abs(date1.getYear() - date2.getYear())) / 4);
		}
		
		conIn.close();
	}
}
