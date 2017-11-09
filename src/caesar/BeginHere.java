package caesar;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class BeginHere {

	public static void main(String[] args) {
		/* Doug's example of drop-down JOP, with adds by Mr. M */
		//Object is top class in Java, used when you are not sure what type might be used --
		//using a String, int, class object, or what? -- so use Object [] array to cover anything
		Object[] selectionsArray = { "Encoder", "Decoder", "Cracker", "Exit", "late addition" };
		String showFirst = "Encoder";
		String selection = (String) JOptionPane.showInputDialog(
				null, 
				"Message: Select a Utility: ",
				"Title: Doug's Example", 
				JOptionPane.PLAIN_MESSAGE, 
				null, 
				selectionsArray, 
				showFirst);
		if (selection == null) selection = "Cancelled";// .equals doesn't work, null is not a String
		JOptionPane.showMessageDialog(null, "You have selected: " + selection);

		switch (selection) { // switch on String allowed in Java 7 and higher
		case "Encoder":
			
			CaesarCipher myCipher = new CaesarCipher();

			JOptionPane.showMessageDialog(null, "(new)Please enter the plain text to encode:");
			String plainText = JOptionPane.showInputDialog("Please enter plain text: ").toLowerCase();
			JOptionPane.showMessageDialog(null, "You have entered this for plain text: " + plainText);
			
			int key = Integer.parseInt( JOptionPane.showInputDialog("Please enter the key:"));
			
			String codedText = myCipher.encode(plainText, key);
			JOptionPane.showMessageDialog(null, "Your secret message is: " + codedText);
			
			break;
			//JOptionPane.showMessageDialog(null, "We are now in the Encoder switch block - add some code!");
			//Scanner kbd = new Scanner(System.in);
			//System.out.println("Please enter the plain text to encode:");
			//String plainText = kbd.nextLine().toLowerCase();
			//JOptionPane.showMessageDialog(null, "Please enter the key:");
			//int key = kbd.nextInt();
			// System.out.println("Your key is: " + key);
			//break means all done, leave the switch block - almost always use break
			//if no break, execution continues for all remaining cases
		
		
		case "Decoder":
			//JOptionPane.showMessageDialog(null, "We are now in the Decoder switch block - add some code!");
			
			CaesarDecipher myDecipher = new CaesarDecipher();

			JOptionPane.showMessageDialog(null, "Please enter the coded text to decode:");
			String initText = JOptionPane.showInputDialog("Please enter coded text: ").toLowerCase();
			JOptionPane.showMessageDialog(null, "You have entered this for coded text: " + initText);
			
			int key2 = Integer.parseInt( JOptionPane.showInputDialog("Please enter the key:"));
			
			String newText = myDecipher.encode(initText, key2);
			JOptionPane.showMessageDialog(null, "Your message is: " + newText);
			
			break;
		
		
		case "Cracker":
			JOptionPane.showMessageDialog(null, 
				"We are now in the Cracker switch block - add some code!");
			break;
		
		
		case "Exit":
			JOptionPane.showMessageDialog(null, 
				"We are now in the Exit switch block - so add some code already to get us out of here!");
			System.exit(0);
			break;
		
		
		default:
			JOptionPane.showMessageDialog(null, 
				"We are now in the Unknown Case or Cancelled switch block - what do you want to do?");
		
		
		
		}
		//after the 'break' continue with the following code
		
		//OK, back to our earlier code ...
		

	}

}