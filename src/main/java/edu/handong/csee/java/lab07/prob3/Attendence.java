package edu.handong.csee.java.lab07.prob3;

import java.util.Random;

public class Attendence {
	String name;
	int grade;
	int studentNum;
	int absent;
	
	public Attendence() {
		setName("");
		setGrade(1);
		setStudentNum(00000000);
		assignAbsent();
	}
	
	public Attendence(String name, int grade, int stdnum) {
		setName(name);
		setGrade(grade);
		setStudentNum(stdnum);
		assignAbsent();
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public void setStudentNum(int stdnum) {
		this.studentNum = stdnum;
	}
	
	public void assignAbsent() {
		Random randomGen = new Random();
		
		this.absent = randomGen.nextInt(10);
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getGrade() {
		return this.grade;
	}
	
	public int getStudentNum() {
		return this.studentNum;
	}
	
	public int getAbsent() {
		return this.absent;
	}
	
	public void checkFail() {
		if(this.absent > 6) 
			System.out.println("I'm sorry, " + getName() + ". You failed this course" );
		else
			System.out.println("Congrats, "+ getName() + " You passed the class");
		System.out.println("You missed " + getAbsent() + " times");
	}

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
