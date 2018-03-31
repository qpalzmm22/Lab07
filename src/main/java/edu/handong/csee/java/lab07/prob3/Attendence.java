package edu.handong.csee.java.lab07.prob3;	// makes this class a pacakge of prob3

import java.util.Random;	// import this to use nextInt() 

/**
 * This class implements a student.
 * This class contains information about student(ex: name, year grade, student ID and randomly assigned absent number)
 * This class also checks if one can pass the class ( has less than 7 absent)
 * @author qpalzmm22
 *
 */
public class Attendence {	// Attendence class implements student's info + absent info
	private String name;	// a variable to store student's name
	private int grade;		// a variable to store student's year grade
	private int studentNum;	// a variable to store student's student ID
	private int absent;		// a variable to store student's absent number
	
	/**
	 * This default constuctor sets name as empty string,
	 * year grade as 1
	 * student id as 0000000
	 * and randomly assign absent number
	 */
	public Attendence() {	// default constructor when no param was given
		setName("");		// set this student's name as ""
		setGrade(1);		// set this student's year grade as 1
		setStudentNum(00000000);	// set this student's student ID as 0000000
		assignAbsent();				// assign random number( 0 ~ 10) to absent
	}
	
	/**
	 * @param name
	 * (Student Name) as this.name
	 * @param grade	
	 * (Year Grade) as this.grade
	 * @param stdnum
	 * (Student ID) as this.studentNum
	 * and randomly assign absent number
	 */
	public Attendence(String name, int grade, int stdnum) {	// String int int constructor of Attendence class
		setName(name);		//set this student's name as name
		setGrade(grade);			// set this student's year grade as grade
		setStudentNum(stdnum);		// set this student's student ID as stdnum
		assignAbsent();				// assign random number( 0 ~ 10) to absent
	}
	
	/**
	 * Takes a param and makes it this.name
	 * @param name
	 * name of a student
	 */
	public void setName(String name) {	// this method set given param to this class' name
		this.name = name;				// assign this class' name by given string
	}
	
	/**
	 * Takes a param and makes it this.grade
	 * @param grade
	 * year grade of a student
	 */
	public void setGrade(int grade) {	// this method set given param to this class' grade
		this.grade = grade;				// assign this class' grade by given integer
	}
	
	/**
	 * Takes a param and makes it this.studentNum
	 * @param stdnum
	 * Student ID of a student
	 */
	public void setStudentNum(int stdnum) {	// this method set given param to this class' stdnum
		this.studentNum = stdnum;			// assign this class' grade by given integer
	}
	
	/**
	 * assigns a random num (0, 10] to this.absent
	 */
	public void assignAbsent() {		// this method create a random number and assign it to this.absent
		Random randomGen = new Random();	// initialize to use nextInt()
		
		this.absent = randomGen.nextInt(10);	// gets a random number between 0 ~ 10 and assign it to this.absent
	}
	
	/**
	 * gets name of this class
	 * @return this.name
	 */
	public String getName() {	// this method gets name of this class
		return this.name;		// returns the value of name of this class
	}
	
	/**
	 * gets year grade of this class
	 * @return this.grade
	 */
	public int getGrade() {		// this method gets year grade of this class
		return this.grade;		// returns the value of grade of this class
	}
	
	/**
	 * gets student ID of this class
	 * @return this.studentNum
	 */
	public int getStudentNum() {	// this method gets student ID of this class
		return this.studentNum;		// returns the value of studentNum of this class
	}
	
	/**
	 * gets absent number of this class
	 * @return this.absent
	 */
	public int getAbsent() {		// this method gets absent number of this class
		return this.absent;			// returns the value of absent of this class
	}
	
	/**
	 * checks if this student has more than 6 absent
	 * prints results according to the result 
	 */
	public void checkFail() {	// this method checks if a student would fail the class due to the number of absent
		if(this.absent > 6) 	// check if the studnet had more than 6 absent
			System.out.println("I'm sorry, " + getName() + ". You failed this course" );	// if so, tell that student the bad news
		else	// if not
			System.out.println("Congrats, "+ getName() + " You passed the class");	// tell him the good news
		System.out.println("You missed " + getAbsent() + " times");	// give the student how many absent he/she made
	}

	/**
	 * Main method to check if the class is working as designed
	 * initialize 4 students and check if they passed the class or not
	 * @param args
	 * no cmd arguments would be given
	 */
	public static void main(String[] args) {	// main method to test out the Attendence class
		Attendence student1 = new Attendence(); // student with default setting
		Attendence student2 = new Attendence("Kent", 2, 21700111);	// student with name of Kent, year grade of 2 and student Id of 21700111
		Attendence student3 = new Attendence("Lucas", 1, 21833222);	// student with name of Lucas, year grade of 1 and student Id of 21833222
		Attendence student4 = new Attendence("Martha", 2, 21733444);// student with name of Martha, year grade of 2 and student Id of 21733444
		
		student1.setName("Jess");	// set student1's name as Jess
		student1.setGrade(4);		// set student1's year grade as 4
		student1.setStudentNum(21400999);	// set student1's student ID as 21400999
		
		System.out.println("\nChecking Student 1");	// tell which student the programming is checking
		student1.checkFail();						// tell the user the result
		System.out.println("\nChecking Student 2");	// tell which student the programming is checking
		student2.checkFail();						// tell the user the result
		System.out.println("\nChecking Student 3"); // tell which student the programming is checking
		student3.checkFail();						// tell the user the result
		System.out.println("\nChecking Student 4");	// tell which student the programming is checking
		student4.checkFail();						// tell the user the result
	}

}
