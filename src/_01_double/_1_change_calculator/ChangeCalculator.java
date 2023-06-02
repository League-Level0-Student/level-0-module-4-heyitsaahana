package _01_double._1_change_calculator;

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain.
 */

public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
		String nickelsString=JOptionPane.showInputDialog("How many nickels do you have?");

		// Convert their answer to an int.   Hint: Integer.parseInt()  
	int nickelsInt=Integer.parseInt(nickelsString);
		// Ask the user how many dimes they have, and convert their answer
	String dimesString=JOptionPane.showInputDialog("How many dimes do you have?");
	 int dimesInt=Integer.parseInt(dimesString);
		// Ask the user how many quarters they have, and convert their answer
	String quartersString=JOptionPane.showInputDialog("How many quarters do you have?");
		 int quartersInt=Integer.parseInt(quartersString);
		// Calculate how much money the user has.  Hint: Use a double variable 
double nickelsValue=0.05*nickelsInt;
double dimesValue=0.10*dimesInt;
double quartersValue=0.25*quartersInt;
double totalMoney= nickelsValue+dimesValue+quartersValue;
System.out.println(totalMoney);
		// Tell the user how much money they have in dollars and cents format (e.g. $6.75)
		JOptionPane.showMessageDialog(null,"You have $"+totalMoney);
	}
}

