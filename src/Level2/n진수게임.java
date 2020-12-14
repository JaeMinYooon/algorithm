package Level2;

public class n진수게임 {

	public static void main(String[] args) {
		int n = 16; // 진법
		int t = 4; // 구할 숫자의 개수
		int m = 2; // 인원
		int p = 1; // 순서

		System.out.println(solution(n, t, m, p));
	}

	public static String solution(int n, int t, int m, int p) {
		String answer = "";
		String sumAnswer = "0";
		int value = 13;
		
		//while (answer.length() < t*m) 		
		
		StringBuilder builder = new StringBuilder();
		while (value >= 1) {
			builder.insert(0, value % n);
			value /= n;
			
		}
		
		System.out.println(builder.toString());

		return answer;
	}
}
