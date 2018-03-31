package edu.handong.csee.java.lab07.prob1;	// makes it a package 

import java.util.*;	// import to use Scanner

/**
 * This class implements YearToCentury.
 * This class has one constuctor that receives year
 * This class one method beside main method that calculates the century given years
 * @author qpalzmm22
 *
 */
public class YearToCentury {	// class to implement calculation of year to century
	int year;		// a variable to hold given year
	int century;	// a variable to store the century value
	
	/**
	 * This is the constructor of YearToCentury
	 * @param year
	 * this constructor takes one parameter of year to save in this class
	 */
	public YearToCentury(int year) {	// a constructor that saves given parameter as this.year
		this.year = year;	// this class' year is assign to given parameter
	}
	
	/**
	 * This method calculates century by this class's year
	 * @return century
	 * This method returns century after calculation
 	 */
	public int calcCentury() {		// a method to calculate the century
		century = (year - 1) / 100 + 1; // year-1 to get rid of exceptions like 1900
										// making them go lower
										// then divide them by 100 to get the hudreth value
										// and add one to get actual value of century
		return century;					// the output of this method
	}
	
	/**
	 * This is the main method to test out the YearToCentury
	 * @param args
	 * no arguments are given for cmd line
	 */
	public static void main(String[] args) { // a main method to check if constructed class is working
		int input;			// a variable to store user's input
		
		Scanner keyboard = new Scanner(System.in);	// initialize to use nextInt() 
		
		System.out.println("Input year: ");	// ask user for year
		input = keyboard.nextInt();			// store user's answer in input
		
		YearToCentury calcCent = new YearToCentury(input);	// initialize by (input) to receive the parameter of user's input to use calcCentury()
		
		System.out.println(input + " is " + calcCent.calcCentury() + "th century.");	// print out the result of calcCentury()
		
		keyboard.close();	// close keyboard to prevent resource leak
	}

}
