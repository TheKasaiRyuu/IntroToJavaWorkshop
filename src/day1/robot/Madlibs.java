package day1.robot;

import javax.swing.JOptionPane;

public class Madlibs {
public static void main(String[] args) {
	String noun = JOptionPane.showInputDialog("Name?");
	String verb = JOptionPane.showInputDialog("Verb ");
	String nouns = JOptionPane.showInputDialog("noun that ends with S ");
	String adjective = JOptionPane.showInputDialog(" Adjective describing feeling");

		
	JOptionPane.showMessageDialog(null, "One Lovely morning " + noun + " woke up with a ton of " + nouns + ", but he wasnt scared he was " + adjective);		
	JOptionPane.showMessageDialog(null, "as fast as " + noun + " could " + verb + ", " + noun + " managed to get away from the " + nouns + " but he was still " + adjective);
	JOptionPane.showMessageDialog(null, "in the end " + noun + " died");	
	JOptionPane.showMessageDialog(null, "The End?");
			
}
}
