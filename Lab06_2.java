import java.util.Scanner;
public class Lab06_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = input.nextInt();
		input.close();
		if (isPalindrome(n)) {
			System.out.print(n + " is a Palindrome number.");
		}
		else {
			System.out.print(n + " is not a Palindrome number.");
		}
	}
	public static int reverse(int n) {
		int reverse = 0;
		int num = Math.abs(n);
		while (num > 0) {
			reverse = (reverse * 10) + (num % 10);
			num /= 10;
		}
		return reverse;
	}
	public static boolean isPalindrome(int n) {
		return n == reverse(n);
	}
}
