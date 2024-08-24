import java.util.Scanner;
public class Lab06_5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a password: ");
		String s = input.nextLine().toLowerCase();
		input.close();
		if (isValid(s)) {
			System.out.print("The password " + s + " is valid");
		}
		else System.out.print("The password " + s + " is not valid");
	}
	public static boolean isValid(String s) {
		if (s.length() < 8) return false;
		int countDigit = 0;
		for (int i = 0; i < s.length(); i++) {
			if (((s.charAt(i) < '0' || s.charAt(i) > '9')) &&
			  ((s.charAt(i) < 'a') || (s.charAt(i) > 'z')) && 
			  ((s.charAt(i) < 'A') || (s.charAt(i) > 'Z'))) {
				return false;
			}
			if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
				countDigit++;
			}
		}
		if (countDigit < 2) return false;
		return true;
	}
}