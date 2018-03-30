package edu.handong.csee.java.lab07.prob1;

import java.util.*;

public class YearToCentury {
	int year;
	int century;
	
	public YearToCentury(int year) {
		this.year = year;
	}
	
	public int calcCentury() {
		century = (year - 1) / 100 + 1; 
		return century;
	}
	
	public static void main(String[] args) {
		int input;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Input year: ");
		input = keyboard.nextInt();
		
		YearToCentury calcCent = new YearToCentury(input);
		
		System.out.println(input + " is " + calcCent.calcCentury() + "th century.");
	}

}
