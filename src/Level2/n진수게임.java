package Level2;

public class n�������� {

	public static void main(String[] args) {
		int n = 16; // ����
		int t = 4; // ���� ������ ����
		int m = 2; // �ο�
		int p = 1; // ����

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
