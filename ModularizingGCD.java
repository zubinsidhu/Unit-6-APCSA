import java.util.Scanner;
public class ModularizingGCD {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter integer 1: ");
		int n1 = input.nextInt();
		System.out.print("Enter integer 2: ");
		int n2 = input.nextInt();
		input.close();
		
		System.out.println("GCD for " + n1 + ", " + n2 + ": " + gcd(n1, n2));
	}
	
	public static int gcd(int n1, int n2) {
	    int gcd = 1;
	    for (int k = 2; k <= n1 && k <= n2; k++) { 
	    	if (n1 % k == 0 && n2 % k == 0)
	    	gcd = k;
	    }
	    return gcd; 
	}

}
