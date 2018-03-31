package edu.handong.csee.java.lab07.prob2;

public class Chicken {
	String name;
	int price;
	int starNum;
	
	public Chicken(String name, int price, int starNum) {
		setName(name);
		setPrice(price);
		setStarNum(starNum);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setStarNum(int starNum) {
		this.starNum = starNum;
	}
	
	public String getname() {
		return this.name;
	}
	
	public int getprice() {
		return this.price;
	}
	
	public int getStarNum() {
		return this.starNum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chicken chicken1 = new Chicken("Cheeze_mustard", 18000, 3);
		Chicken chicken2 = new Chicken("Honney_mustard", 21000, 4);
		Chicken chicken3 = new Chicken("Spicey_chicken", 20000, 1);
		
		System.out.println(chicken1.getname() + "'s rating is " + chicken1.getStarNum());
		System.out.println(chicken2.getname() + "'s rating is " + chicken2.getStarNum());
		System.out.println(chicken3.getname() + "'s rating is " + chicken3.getStarNum());
	}

}
