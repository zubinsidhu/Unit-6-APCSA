import java.util.Scanner;
public class MethodsToConvertHexadecimalsToDecimals {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the hex string: ");
		String hexString = input.nextLine().toUpperCase();
		input.close();
		System.out.println("The hex number " + hexString + " has decimal value of " + hexToDec(hexString.toUpperCase()));
	}
	
	public static int hexToDec(String h) {
		int decValue = 0;
		for (int i = 0; i < h.length(); i++) {
			char hexDigit = h.charAt(i);
			decValue = decValue * 16 + hexDigitToDec(hexDigit);
		}
		return decValue;
	}
	
	public static int hexDigitToDec(char ch) {
		if (ch >= 'A' && ch <= 'F') {
			return 10 + ch - 'A';
		}
		else {
		    return ch - '0';
		}
		
		/* or can have 0 and 9 in if and 'A' - 'F' as implied in else:
		 * int value = 0;
		 * if (ch >= '0' && ch <= '9') value = ch - '0';
		 * else value = ch - 'A' + 10;
		 * return value;
		 */
	}

}