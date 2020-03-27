package Level1;
import java.util.Scanner;

public class Q1003 {
	static int count0;
	static int count1;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N;
		N = scanner.nextInt();
		fibonacci(N);
		
		System.out.println(count0 + " | " + count1);
		scanner.close();

	}
	static int fibonacci(int n) {
	    if (n == 0) {
	    	count0++;
	        //System.out.println("0");
	        return 0;
	    } else if (n == 1) {
	    	count1++;
	        //System.out.println("1");
	        return 1;
	    } else {
	        return fibonacci(n-1) + fibonacci(n-2);
	    }
	}
}
