package edu.handong.csee.java.lab07.prob2; // makes it a package

/**
 * This class implements a menu
 * Menu has 3 features(name, price and number of stars(rating)).
 * @author qpalzmm22
 *
 */
public class Chicken {	// Chicken class implements menu
	String name;		// a variable to store chicken menu's name
	int price;			// a variable to store chicken menu's price
	int starNum;		// a variable to store chicken menu's starNum
	
	/**
	 * a default constructor that sets name a empty string,
	 * price as 0 and star as 0
	 */
	public Chicken() {	// default constructor when no param was given
		setName("");	// set this class' name as ""
		setPrice(0);	// set price as 0
		setStarNum(0);	// set starNym as 0
	}
	
	/**
	 * 3 parameter constructor sets each as name, price and starNum
	 * @param name of class
	 * @param price of class
	 * @param starNum of class
	 */
	public Chicken(String name, int price, int starNum) {	// String int int constructor of chicken class 
		setName(name);			// set class' name by first param 
		setPrice(price);		// set class' price by sceond param
		setStarNum(starNum);	// set class' starNum by third param
	}
	
	/**
	 * This method sets this.name as given string
	 * @param name of Chicken class
	 * 
	 */
	public void setName(String name) {	// this method set given param to this class' name
		this.name = name;				// assign this class' name by given string
	}
	
	
	/**
	 * This method sets this.price as given integer
	 * @param price of Chicken class
	 */
	public void setPrice(int price) {	// this method set given param to this class' price
		this.price = price;				// assign this class' price by given integer
	}
	/**
	 * This method sets this.starNum by given integer
	 * @param starNum of Chicken class
	 */
	public void setStarNum(int starNum) {	// this method set given param to this class' starNum
		this.starNum = starNum;				// assign this class' starNum by given integer
	}
	/**
	 * This method allows other users to get the name variable
	 * @return name of this class
	 */
	public String getname() {		// this method gets name of this class
		return this.name;			// returns the value of name of this class
	}
	
	/**
	 * This method allows other users to get the price variable 
	 * @return price of this class
	 */
	public int getprice() {		// this method gets the price of this class
		return this.price;		// returns the value of price of this class
	}
	
	 
	/**
	 * This method allows other users to get the starNum variable
	 * @return starNum of this class
	 */
	public int getStarNum() {	// this method gets the starNum of this class
		return this.starNum;	// returns the value of price of this class
	}
	
	/**
	 * Main method initialize 3 dfferent Chicken classes and print out the name and starNum of each of them
	 * @param args
	 * no cmd argmuments are taken in the process
	 */
	public static void main(String[] args) {	// main method to test the Chicken class
		Chicken chicken1 = new Chicken("Cheeze_mustard", 18000, 3);	// Chicken menu with name of Cheeze_mustard, price of 18000 and starNum of 3
		Chicken chicken2 = new Chicken("Honney_mustard", 21000, 4);	// Chicken menu with name of Honey_mustard, price of 21000 and starNum of 4
		Chicken chicken3 = new Chicken("Spicey_chicken", 20000, 1); // Chicken menu with name of Spicey_chicken, price of 20000 and starNum of 1
		
		System.out.println(chicken1.getname() + "'s rating is " + chicken1.getStarNum());	// print out the chicken1's name and starNum
		System.out.println(chicken2.getname() + "'s rating is " + chicken2.getStarNum());	// print out the chicken2's name and starNum
		System.out.println(chicken3.getname() + "'s rating is " + chicken3.getStarNum());	// print out the chicken3's name and starNum
	}

}
