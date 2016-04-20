/*
 * DebitCard.java
 * 
 * Copyright 2016 graf <graf@chillosphere.spacepotato>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */


public class DebitCard {
	
	private String cardNumber;
	private double accountBalance;
	private double credit;
	private double debit;
	
	public void setCardNumber(String newDebitCard){
		cardNumber = newDebitCard;
		}
	
	public void useDebit(double debit){
		double transaction = debit;
		accountBalance += transaction;
		}
	
	public void useCredit(double credit){
		double transaction = credit;
		accountBalance -= transaction;
		}
	
	public void getInfo(){
		System.out.println("your card number is: " + cardNumber);
		System.out.println("your balance is: " + accountBalance);
		}	
	
	public static void main (String args[]) {
		
		DebitCard demo = new DebitCard();
		demo.setCardNumber("xxxx-xxx-xxxx");
		demo.useDebit(10.00);
		demo.useCredit(3.00);
		demo.getInfo();
		
		
	}
}

