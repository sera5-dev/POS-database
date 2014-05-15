package com.wanyama.model;

/*
 *Class representation of sale booths (points of sale) 
 * @author FUJITSU
 *
 */
public class Stall {
	
	long id;
	int stall_number;
	int balance;
	
	//constructor
	public Stall(int number, int balance){
		stall_number = number;
		this.balance = balance;
	}
	// constructor (SHOULD NOT BE USED, rather set id after table insertion)
	public Stall(long id, int number, int balance) {
		this.id = id;
		stall_number = number;
		this.balance = balance;
	}
	
	// Setters
	public void setId(long id){
		this.id = id;
	}
	public void setNumber(int number){
		stall_number = number;
	}
	public void setBalance(int amount){
		balance = amount;
	}
	public void addPurchaseToBalance(int price){
		balance += price;
	}
	public void resetBalance(){
		balance = 0;
	}
	
	// Getters
	public long getId(){
		return id;
	}
	public int getNumber(){
		return stall_number;
	}
	public int getBalance(){
		return balance;
	}
	
	// stall printout format
	@Override
	public String toString(){
		// build display string line by line
		StringBuilder result = new StringBuilder();
		String newLine = System.getProperty("line.separator");
		
		result.append("Number: "+stall_number+newLine);
		result.append("Balance: "+balance);
		
		
		return result.toString();
	}
}
