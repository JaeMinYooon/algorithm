package codingtest;

import java.util.ArrayList;
import java.util.List;

public class kakao1 {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(10);
		arr.add(-5);
		arr.add(6);
		//arr.add(20);
		//arr.add(-30);
		System.out.println(solution(arr));
	}

	public static int solution(List<Integer> arr) {
		int answer = 0;
		int index = 1;
		int sum1 = 0, sum2 = 0;
		for (int i = 0; i < arr.size() - 1; i++) {
			for (int j = 0; j < arr.size(); j++) {
				if (index > j) {
					sum1 += arr.get(j);
				} else
					sum2 += arr.get(j);
			}
			index++;
			if (sum1 > sum2) {
				answer++;
			}
			System.out.println("sum1 = " + sum1);
			System.out.println("sum2 = " + sum2);
			sum1 = 0;
			sum2 = 0;
		}

		return answer;
	}
}
