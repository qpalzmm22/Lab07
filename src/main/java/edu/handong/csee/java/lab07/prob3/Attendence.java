package edu.handong.csee.java.lab07.prob3;

import java.util.Random;

/**
 * This class implements a student.
 * This class contains information about student(ex: name, year grade, student ID and randomly assigned absent number)
 * This class also checks if one can pass the class ( has less than 7 absent)
 * @author qpalzmm22
 *
 */
public class Attendence {
	private String name;
	private int grade;
	private int studentNum;
	private int absent;
	
	/**
	 * This default constuctor sets name as empty string,
	 * year grade as 1
	 * student id as 0000000
	 * and randomly assign absent number
	 */
	public Attendence() {
		setName("");
		setGrade(1);
		setStudentNum(00000000);
		assignAbsent();
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
	public Attendence(String name, int grade, int stdnum) {
		setName(name);
		setGrade(grade);
		setStudentNum(stdnum);
		assignAbsent();
	}
	
	/**
	 * Takes a param and makes it this.name
	 * @param name
	 * name of a student
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Takes a param and makes it this.grade
	 * @param grade
	 * year grade of a student
	 */
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	/**
	 * Takes a param and makes it this.studentNum
	 * @param stdnum
	 * Student ID of a student
	 */
	public void setStudentNum(int stdnum) {
		this.studentNum = stdnum;
	}
	
	/**
	 * assigns a random num (0, 10] to this.absent
	 */
	public void assignAbsent() {
		Random randomGen = new Random();
		
		this.absent = randomGen.nextInt(10);
	}
	
	/**
	 * gets name of this class
	 * @return this.name
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * gets year grade of this class
	 * @return this.grade
	 */
	public int getGrade() {
		return this.grade;
	}
	
	/**
	 * gets student ID of this class
	 * @return this.studentNum
	 */
	public int getStudentNum() {
		return this.studentNum;
	}
	
	/**
	 * gets absent number of this class
	 * @return this.absent
	 */
	public int getAbsent() {
		return this.absent;
	}
	
	/**
	 * checks if this student has more than 6 absent
	 * prints results according to the result 
	 */
	public void checkFail() {
		if(this.absent > 6) 
			System.out.println("I'm sorry, " + getName() + ". You failed this course" );
		else
			System.out.println("Congrats, "+ getName() + " You passed the class");
		System.out.println("You missed " + getAbsent() + " times");
	}

	/**
	 * Main method to check if the class is working as designed
	 * initialize 4 students and check if they passed the class or not
	 * @param args
	 * no cmd arguments would be given
	 */
	public static void main(String[] args) {
		Attendence student1 = new Attendence();
		Attendence student2 = new Attendence("Kent", 2, 21700111);
		Attendence student3 = new Attendence("Lucas", 1, 21833222);
		Attendence student4 = new Attendence("Martha", 2, 21733444);
		
		student1.setName("Jess");
		student1.setGrade(4);
		student1.setStudentNum(21400999);
		
		System.out.println("\nChecking Student 1");
		student1.checkFail();
		System.out.println("\nChecking Student 2");
		student2.checkFail();
		System.out.println("\nChecking Student 3");
		student3.checkFail();
		System.out.println("\nChecking Student 4");
		student4.checkFail();
	}

}
