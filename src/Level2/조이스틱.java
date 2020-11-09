package Level2;

public class ���̽�ƽ {
	// ���� �´µ� �׽�Ʈ ���̽��� ������� ����.
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
