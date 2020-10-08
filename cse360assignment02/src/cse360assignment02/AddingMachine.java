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
		return total;
	}
	
	public void add (int value) {
		total = total + value;
		totalChar = totalChar + " + ";
		totalChar = totalChar + value;
	}
	
	public void subtract (int value) {
		total = total - value;
		totalChar = totalChar + " - ";
		totalChar = totalChar + value;
	}
	
	public String toString() {
		return totalChar;
	}
	
	public void clear() {
		total = 0;
		totalChar = "0";
	}
}