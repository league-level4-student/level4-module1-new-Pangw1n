package _00_Intro_to_Exceptions;

import javax.swing.JOptionPane;

public class ZeroException extends Exception{
	void scaryPopup()
	{
		JOptionPane.showMessageDialog(null, "Number Is Zero");
	}
}
