package edu.handong.csee.java.lab07.prob2;

/**
 * This class implements a menu
 * Menu has 3 features(name, price and number of stars(rating)).
 * @author qpalzmm22
 *
 */
public class Chicken {
	String name;
	int price;
	int starNum;
	
	/**
	 * a default constructor that sets name a empty string,
	 * price as 0 and star as 0
	 */
	public Chicken() {
		setName("");
		setPrice(0);
		setStarNum(0);
	}
	
	/**
	 * 3 parameter constructor sets each as name, price and starNum
	 * @param name of class
	 * @param price of class
	 * @param starNum of class
	 */
	public Chicken(String name, int price, int starNum) {
		setName(name);
		setPrice(price);
		setStarNum(starNum);
	}
	
	/**
	 * This method sets this.name as given string
	 * @param name of Chicken class
	 * 
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	
	/**
	 * This method sets this.price as given integer
	 * @param price of Chicken class
	 */
	public void setPrice(int price) {
		this.price = price;
	}
	/**
	 * This method sets this.starNum by given integer
	 * @param starNum of Chicken class
	 */
	public void setStarNum(int starNum) {
		this.starNum = starNum;
	}
	
	/**
	 * This method allows other users to get the name variable
	 * @return name of this class
	 */
	public String getname() {
		return this.name;
	}
	
	/**
	 * This method allows other users to get the price variable 
	 * @return price of this class
	 */
	public int getprice() {
		return this.price;
	}
	
	 
	/**
	 * This method allows other users to get the starNum variable
	 * @return starNum of this class
	 */
	public int getStarNum() {
		return this.starNum;
	}
	
	/**
	 * Main method initialize 3 dfferent Chicken classes and print out the name and starNum of each of them
	 * @param args
	 * no cmd argmuments are taken
	 */
	public static void main(String[] args) {
		Chicken chicken1 = new Chicken("Cheeze_mustard", 18000, 3);
		Chicken chicken2 = new Chicken("Honney_mustard", 21000, 4);
		Chicken chicken3 = new Chicken("Spicey_chicken", 20000, 1);
		
		System.out.println(chicken1.getname() + "'s rating is " + chicken1.getStarNum());
		System.out.println(chicken2.getname() + "'s rating is " + chicken2.getStarNum());
		System.out.println(chicken3.getname() + "'s rating is " + chicken3.getStarNum());
	}

}
