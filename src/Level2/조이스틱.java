package Level2;

public class 조이스틱 {
	// 값은 맞는데 테스트 케이스가 통과되지 않음.
	public static void main(String[] args) {
		String name = "AAB";
		System.out.println(solution(name));
	}

	public static int solution(String name) {
		int answer = 0;

		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) != 'A') {
				if ((int) name.charAt(i) - 65 > 13) {
					answer += 26 - ((int) name.charAt(i) - 65);
				} else {
					answer += ((int) name.charAt(i) - 65);
				}
			}
		}
		int minMove = name.length() - 1;
		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) != 'A') {
				int next = i + 1;
				while (next < name.length() && name.charAt(next) == 'A') {
					next++;
				}
				int move = 2 * i + name.length() - next;
				minMove = Math.min(move, minMove);
			}
		}
		
		return answer + minMove;
	}
}
