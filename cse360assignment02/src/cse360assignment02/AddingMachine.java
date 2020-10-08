/* Class: CSE 360
 * Author: Liam Gomez
 * ASU ID: 1214820607
 */
package cse360assignment02;

public class AddingMachine {
	
	private int total;
	private String totalChar = "0";	
	
	public AddingMachine() {
		total = 0; // not needed - included for clarity
	}
	
	public int getTotal() {
		return total; //return total to be printed
	}
	
	public void add (int value) {
		total = total + value; //add value to total
		totalChar = totalChar + " + "; //add "+" to totalChar output string
		totalChar = totalChar + value; //add value to totalChar output string
	}
	
	public void subtract (int value) {
		total = total - value; //subtract value from total
		totalChar = totalChar + " - "; //add "-" to totalChar output string
		totalChar = totalChar + value; //add value to totalChar output string
	}
	
	public String toString() {
		return totalChar; //return totalChar string to be printed
	}
	
	public void clear() {
		total = 0; //reset total
		totalChar = "0"; //reset totalChar string
	}
}