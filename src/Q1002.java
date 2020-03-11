import java.util.Scanner;

public class Q1002 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCase, x1, x2, y1, y2, r1, r2;
		testCase = scanner.nextInt();
		
		for(int i = 0 ; i < testCase; i++) {
			x1 = scanner.nextInt();
			y1 = scanner.nextInt();
			r1 = scanner.nextInt();
			x2 = scanner.nextInt();
			y2 = scanner.nextInt();
			r2 = scanner.nextInt();
			
			if((x2-x1)+(y2-y1) == (r1+r2)) {
				System.out.println("1");
			}
			else if((x2-x1)+(y2-y1) < (r1+r2)) {
				System.out.println("2");
			}
			else if((x2-x1)+(y2-y1) > (r1+r2)) {
				System.out.println("0");
			}
			else
				System.out.println("-1");
			
		}
		
		
		
		scanner.close();

	}

}
