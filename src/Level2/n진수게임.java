package Level2;

public class n�������� {

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
				// �������� 0~9 �����̸� ĳ���� ���� �迭�� ����
				if ((temp % n) < 10) {
					// ���ڿ� ��->�·� �迭
					
					returnString = (temp % n) + returnString;
					// ���� ����
					temp /= n;
				}
				// �������� 10 �̻��̸� �ش��ϴ� ���� ���ĺ��� ����
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
