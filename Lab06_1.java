import java.util.Scanner;
public class Lab06_1 {
 
     public static void main(String[] args) {
           Scanner input = new Scanner(System.in);
           System.out.print("Enter a number: ");
           int n = input.nextInt();
           input.close();
           System.out.print("The sum of all digits in " + n + ": " + sumDigits(n));
     }
     public static int sumDigits(int n) {
           int sum = 0;
           int num = Math.abs(n);
           while (n > 0) {
                num = n % 10;
                n /= 10;
                sum += num;
           }
           return sum;
     }
}