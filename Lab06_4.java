public class Lab06_4 {

	public static void main(String[] args) {
		int count = 0;
		for (int n = 2; n < 10000; n++) {
			if (isPrime(n)) {
				count++;
			}
		}
		System.out.println("Number of primes less than 10,000: " + count);
	}
	public static boolean isPrime(int n) {
		for (int d = 2; d <= n / 2; d++) {
			if (n % d == 0) {
				return false;
			}
		}
		return true;
	}
}