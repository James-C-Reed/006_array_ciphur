package caesar;

public class CaesarDecipher {
	
	//abcdefghijklmnopqrstuvwxyz0123456789.:'"
	private String alpha = "':.9876543210zyxwvutsrqponmlkjihgfedcba";

	public String encode(String secretText, int key) {
		
		String plainText = "";
		int index, keyAdded;

		for (int i = 0; i < secretText.length(); i++) {
			if (secretText.charAt(i) != ' ') {
				index = alpha.indexOf(secretText.charAt(i));
				keyAdded = (index + key) % alpha.length();
				plainText = plainText + alpha.charAt(keyAdded);
			} else {
				plainText = plainText + " ";
			}

		}

		return plainText;

	}

}
