import java.util.Scanner;
public class Lab06_6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a phone number: ");
		String phoneNumStr = input.nextLine().toUpperCase();
		String allDigits = "";
		for (int i = 0; i < phoneNumStr.length(); i++) {
			if (phoneNumStr.charAt(i) >= 'A' && phoneNumStr.charAt(i) <= 'Z') {
				allDigits += phoneKey(phoneNumStr.charAt(i));
			}
			else allDigits += phoneNumStr.charAt(i);
		}
		System.out.println(allDigits);
		input.close();
		
	}
	public static int phoneKey(char ch) {
		switch(ch) {
		case 'A':
		case 'B':
		case 'C': return 2;
		case 'D':
		case 'E':
		case 'F': return 3;
		case 'G':
		case 'H':
		case 'I': return 4;
		case 'J':
		case 'K':
		case 'L': return 5;
		case 'M':
		case 'N':
		case 'O': return 6;
		case 'P':
		case 'Q':
		case 'R':
		case 'S': return 7;
		case 'T':
		case 'U':
		case 'V': return 8;
		case 'W':
		case 'X':
		case 'Y':
		case 'Z': return 9;
		}
		return 0;
	}

}