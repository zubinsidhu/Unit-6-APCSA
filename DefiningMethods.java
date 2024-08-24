
public class DefiningMethods {

	public static void main(String[] args) {
		int num1 = 45;
		int num2 = -34;
		System.out.println("Max of " + num1 + " and " + num2 + " : " + max(num1, num2));

	}
	
	public static int max(int n1, int n2) {
		if (n1 > n2) {
			return n1;
		}
		else {
			return n2;
		}
		//return n1 > n2 ? n1 : n2; (advanced if statement)
	}
}
