package caesar;

public class CaesarCiphur {
	
	private String alpha = "abcdefghijklmnopqrstuvwxyz 0123456789.:'";

	public String encode(String plainText, int key) {
		
		String secretText = "";
		int index, keyAdded;
		
		/*System.out.println("Test alpha length = " + alpha.length());
		System.out.println("The first char is: " + alpha.charAt(0));
		System.out.println("The first char is: " + alpha.charAt(alpha.length()-1));
		
		for (int i = 0; i < alpha.length(); i++) {	
			System.out.println(alpha.charAt(i));	
		}
		System.out.println("\n\n");*/
		
		for (int i = 0; i < plainText.length(); i++) {
			
			System.out.println(plainText.charAt(i));
			
		}
		
		for (int i = 0; i < plainText.length(); i++) {
			
			index = alpha.indexOf(plainText.charAt(i));
			//System.out.println("index = " + index);
			
			keyAdded = index + key;
			
			if (keyAdded >= alpha.length()) {
				keyAdded -= alpha.length();
			}
			
			System.out.println("Encoded text is: " + alpha.charAt(keyAdded));
			
		}
		
		return secretText;

	}
	
}
