package Level2;

public class n�������� {

	public static void main(String[] args) {
		int n = 2; // ����
		int t = 4; // ���� ������ ����
		int m = 2; // �ο�
		int p = 1; // ����

		System.out.println(solution(n, t, m, p));

	}

	public static String solution(int n, int t, int m, int p) {
		String answer = "";
		String sumAnswer = "0";
		int num = 0;
		
		while (answer.length() < t*m) {
			while (num > 0) {
				sumAnswer = (num % n) + sumAnswer;
				num /= n;
			}
			System.out.println(sumAnswer);
			answer = sumAnswer + answer;
			num++;
		}

		return answer;
	}
}
