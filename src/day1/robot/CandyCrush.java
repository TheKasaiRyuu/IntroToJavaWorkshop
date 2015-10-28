package day1.robot;

import javax.swing.JOptionPane;

public class CandyCrush {
public static void main(String[] args) {
	String answer = JOptionPane.showInputDialog("Who do you hate in this class");
	JOptionPane.showMessageDialog(null, "Hahahhahah you have a crush on " + answer + " Don't worry i wont tell them");
	String bf = JOptionPane.showInputDialog("Who is your Best Friend");
	JOptionPane.showMessageDialog(null, bf + " Is Sweet as Cotton Candy");
	String candy = JOptionPane.showInputDialog("What is your favorite candy");
	JOptionPane.showMessageDialog(null, "Oh i like " + candy);
}
}
