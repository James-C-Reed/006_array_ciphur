package caesar;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class BeginHere {
	
	public static void main(String[] args) {
		
		/*String msg = "Would you like to encode a plain text message?";
		int confirm = JOptionPane.showConfirmDialog(null, msg);
		*/
		
		Object[] selectionArray = {"Encoder", "Decoder", "Cracker", "Exit"};
		String showFirst = "Encoder";
		String selection = (String) JOptionPane.showInputDialog(
				null,
				"Message: Select a utility: ",
				"Doug's Example",
				JOptionPane.PLAIN_MESSAGE,
				null,
				selectionArray
				showFirst);
		
		if (selection == null) selection = "Cancelled";
		JOptionPane.showMessageDialog(null, "You have selected: " + selection);
		
		switch (selection) {
		case "Encoder":
			JOptionPane.showMessageDialog(null, 
					"We are now in the Encoder switch block - add some code!");
			break;
		case "Decoder":
			JOptionPane.showMessageDialog(null, 
					"We are now in the Decoder switch block - add some code!");
			break;
		case "Cracker":
			JOptionPane.showMessageDialog(null, 
					"We are now in the Cracker switch block - add some code!");
			break;
		case "Exit":
			JOptionPane.showMessageDialog(null, 
					"We are now in the Exit switch block - add some code to get us out!");
			break;
		}
		
		Scanner kbd = new Scanner(System.in);
		
		CaesarCiphur myCiphur = new CaesarCiphur();
		
		String msg = "Please enter plain text to ciphur.";
		//System.out.println("Please enter plain text to ciphur.");
		String plainText = kbd.nextLine().toLowerCase();
		
		String msg = 
		//System.out.println("Please enter a key:");
		int key = kbd.nextInt();
		
		String codedText = myCiphur.encode(plainText, key);
		//System.out.println("Your secret message is: " + codedText);
		
	}
}
