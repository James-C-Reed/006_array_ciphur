package caesar;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class BeginHere {
	
	public static void main(String[] args) {
		
		/*String msg = "Would you like to encode a plain text message?";
		int confirm = JOptionPane.showConfirmDialog(null, msg);
		*/
		
		/*Object[] possibilities = {"encode", "decode", "crack", "exit"};
		String s = (String)JOptionPane.showInputDialog(
				null,
				"please make your selection",
				"Start Here",
				JOptionPane.PLAIN_MESSAGE,
				possibilities 	
		*/
		Scanner kbd = new Scanner(System.in);
		
		CaesarCiphur myCiphur = new CaesarCiphur();
		
		//System.out.println("Please enter plain text to ciphur.");
		String plainText = kbd.nextLine().toLowerCase();
		
		//System.out.println("Please enter a key:");
		int key = kbd.nextInt();
		
		String codedText = myCiphur.encode(plainText, key);
		//System.out.println("Your secret message is: " + codedText);
		
	}
}
