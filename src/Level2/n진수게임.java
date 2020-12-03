package Level2;

public class n진수게임 {

	public static void main(String[] args) {
		int n = 16;
		int t = 16;
		int m = 2;
		int p = 1;

		System.out.println(solution(n, t, m, p));

	}

	public static String solution(int n, int t, int m, int p) {
		String answer = "";
		int num = 1;
		String sumString = "";
		
		while (true) {
			String returnString = "";
			int temp = num;
			while (temp != 0) {
				// 나머지가 0~9 사이이면 캐릭터 값을 배열에 저장
				if ((temp % n) < 10) {
					// 문자열 우->좌로 배열
					
					returnString = (temp % n) + returnString;
					// 몫을 구함
					temp /= n;
				}
				// 나머지가 10 이상이면 해당하는 값의 알파벳을 저장
				else {
					int temp1 = (char)((num % n) + 55);

					returnString = Integer.toString(temp1) + returnString;
				}

			}
			num++;
			sumString += returnString;
			
			System.out.println(sumString);
			if (t*m == sumString.length())
				break;
			t++;
			
		}

		return answer;
	}
}
