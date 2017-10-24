package caesar;

import java.util.Scanner;

public class BeginHere {
	
	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		
		CaesarCiphur myCiphur = new CaesarCiphur();
		
		System.out.println("Please enter plain text to ciphur.");
		String plainText = kbd.nextLine().toLowerCase();
		
		System.out.println("Please enter a key:");
		int key = kbd.nextInt();
		//System.out.println("Your key is: " + key);
		
		String codedText = myCiphur.encode(plainText, key);
		System.out.println("Your secret message is:" + codedText);
		
	}
}
