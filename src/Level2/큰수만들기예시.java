package Level2;

public class 큰수만들기예시 {

	public static void main(String[] args) {
		String number = "1231234";
		int k = 3;

		System.out.println(solution(number, k));
	}

	public static String solution(String number, int k) {
		int idx = 0;
		char max;
		StringBuilder answer = new StringBuilder();

		if (number.charAt(0) == '0')
			return "0";
		for (int i = 0; i < number.length() - k; i++) {
			max = '0';
			for (int j = idx; j <= k + i; j++) {
				if (max < number.charAt(j)) {
					max = number.charAt(j);
					idx = j + 1;
				}
			}
			answer.append(max);
		}
		return answer.toString();
	}
}
