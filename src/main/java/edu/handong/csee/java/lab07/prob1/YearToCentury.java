package edu.handong.csee.java.lab07.prob1;

import java.util.*;

/**
 * This class implements YearToCentury.
 * This class has one constuctor that receives year
 * This class one method beside main method that calculates the century given years
 * @author qpalzmm22
 *
 */
public class YearToCentury {
	int year;
	int century;
	
	/**
	 * This is the constructor of YearToCentury
	 * @param year
	 * this constructor takes one parameter of year to save in this class
	 */
	public YearToCentury(int year) {
		this.year = year;
	}
	
	/**
	 * This method calculates century by this class's year
	 * @return century
	 * This method returns century after calculation
 	 */
	public int calcCentury() {
		century = (year - 1) / 100 + 1; 
		return century;
	}
	
	/**
	 * This is the main method to test out the YearToCentury
	 * @param args
	 * no arguments are given for cmd line
	 */
	public static void main(String[] args) {
		int input;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Input year: ");
		input = keyboard.nextInt();
		
		YearToCentury calcCent = new YearToCentury(input);
		
		System.out.println(input + " is " + calcCent.calcCentury() + "th century.");
	}

}
