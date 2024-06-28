package _00_Intro_to_Exceptions;

import javax.swing.JOptionPane;

public class NegativeNumberException extends Exception {
	void scaryPopup()
	{
		JOptionPane.showMessageDialog(null, "Number Is Negative");
	}
}
