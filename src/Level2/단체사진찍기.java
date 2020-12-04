package Level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class 단체사진찍기 {
	static String[] friends = { "A", "C", "F", "J", "M", "N", "R", "T" };
	static ArrayList<String> friend = new ArrayList<>(Arrays.asList(friends));
	static int answer = 0;

	public static void main(String[] args) {
		int n = 2;
		String[] data = { "N~F=0", "R~T>2"};
		// System.out.println(data[0].charAt(4)-'0'+1);
		System.out.println(solution(n, data));
	}

	public static int solution(int n, String[] data) {
		LinkedList<Integer> perArr = new LinkedList<Integer>();
		int[] perCheck = new int[8];
		permutation(8, 8, perArr, perCheck, data, n);

		return answer;
	}

	private static void permutation(int n, int r, LinkedList<Integer> perArr, int[] perCheck, String[] data, int num) {
		if (perArr.size() == r) {
			String aa = "";
			for (int i : perArr) {
				aa += friends[i] + "";
			}
			if (isValid(aa, data, num)) {
				//System.out.println(aa);
				answer++;
			}

			return;
		}

		for (int i = 0; i < n; i++) {
			if (perCheck[i] == 0) {
				perArr.add(i);
				perCheck[i] = 1;
				permutation(n, r, perArr, perCheck, data, num);
				perCheck[i] = 0;
				perArr.removeLast();
			}
		}
	}

	private static boolean isValid(String aa, String[] data, int num) {
		boolean[]flag = new boolean[num];
		
		for (int i = 0; i < num; i++) {
			switch (data[i].charAt(3)) {
			case '=':
				if (Math.abs(aa.indexOf(Character.toString(data[i].charAt(0)))
						- aa.indexOf(Character.toString(data[i].charAt(2)))) == data[i].charAt(4) - '0' + 1)
					flag[i] = true;
				break;
			case '<':
				if (Math.abs(aa.indexOf(Character.toString(data[i].charAt(0)))
						- aa.indexOf(Character.toString(data[i].charAt(2)))) < data[i].charAt(4) - '0' + 1)
					flag[i] = true;
				break;
			case '>':
				if (Math.abs(aa.indexOf(Character.toString(data[i].charAt(0)))
						- aa.indexOf(Character.toString(data[i].charAt(2)))) > data[i].charAt(4) - '0' + 1)
					flag[i] = true;
				break;
			}
		}
		for(int i = 0 ; i < num ; i++) {
			if (!flag[i])
				return false;
		}
		
		return true;
	}
}
