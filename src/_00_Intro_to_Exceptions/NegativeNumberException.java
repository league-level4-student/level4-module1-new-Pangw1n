package _00_Intro_to_Exceptions;

import javax.swing.JOptionPane;

public class NegativeNumberException extends Exception {
	void scaryPopup()
	{
		JOptionPane.showMessageDialog(null, "A Critical Error Has Occured");
	}
	
	public static void testPositive(int x) throws Exception
	{
		
	}
}
