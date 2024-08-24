import java.util.Scanner;
public class Lab06_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the size to display the pattern: ");
		int size = input.nextInt();
		input.close();
		displayPattern(size);
	}
	public static void displayPattern(int size) {
		for (int i = 1; i <= size; i++) {
			for (int j = size; j >= 1; j--) {
				System.out.print(j > i ? "  \t" : j + " \t");
			}
			System.out.println("\n\n\n");
		}
	}
}