package Level2;

import java.util.Vector;

public class N개의최소공배수 {
	static Vector<Integer> v = new Vector<Integer>();

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3 };

		System.out.println(solution(arr));
	}

	public static int solution(int[] arr) {
		int lcm = arr[0];

		for (int i = 1; i < arr.length; i++) {
			lcm = getLcm(lcm, arr[i]);
		}

		return lcm;
	}

	public static int getGcd(int a, int b) {
		int tmp;
		while (b != 0) {
			tmp = b;
			b = a % b;
			a = tmp;
		}

		return a;
	}

	public static int getLcm(int a, int b) {
		if (a <= 0 || b <= 0)
			return -1;
		return a * b / getGcd(a, b);
	}
}
