//Aemun Ahmar 1047508
//CSCI 260 - M02: Fall 2017
//Professor Sandra Kopecky
//Assignment 1: Days Between
//September 21, 2017

public class Date 
{
	protected int year;
	protected int month;
	protected int day;
	public static final int MINYEAR = 1583;
	
	//Constructor
	public Date(int newMonth, int newDay, int newYear)
	{
		month = newMonth;
		day = newDay;
		year = newYear;
	}
	
	//Observers
	public int getYear()
	{
		return year;
	}
	
	public int getMonth()
	{
		return month;
	}
	
	public int getDay()
	{
		return day;
	}
	
	public int lilian()
	{
		//Returns the Lilian Day Number of this date.
		//Precondition: THis date is a valid date after 10/14/1582
		
		//Computes the number of days between 1/1/0 and this date as if
		//no calendar reforms took place, then subtracts 578,100 so that 
		//October 15, 1582 is day 1.
		
		final int SUBDAYS = 578100;
		
		int numDays = 0;
		
		//Add days in years
		numDays = year * 365;
		
		//Add days in the months
		if(month <= 2)
		{
			numDays = numDays + (month - 1) * 31;
		} else
		{
			numDays = numDays + ((month - 1) * 31) - ((4 * (month - 1) + 27) / 10);
		}
		
		//Add days in the days
		numDays = numDays + day;
		
		//Take care of leap years
		numDays = numDays + (year / 4) - (year / 100) + (year / 400);
		
		//Handle special case of leap year but not yet leap day
		if(month < 3)
		{
			if((year % 4) == 0)
			{
				numDays = numDays - 1;
			}
			if((year % 100) == 0)
			{
				numDays = numDays + 1;
			}
			if((year % 400) == 0)
			{
				numDays = numDays - 1;
			}
		}
		
		//Subtract extra days up to 10/14/1582
		numDays = numDays - SUBDAYS;
		
		return numDays;
	}
}
