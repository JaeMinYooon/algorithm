package ����LEVEL;

public class ����ǰ��ȯ�ϱ� {

	public static void main(String[] args) {
		// 12 0
		// 10 14
		// 4 20
		// 5 24242
		int n = 12;
		int m = 0;
		int answer = 0;
		int answer2 = 0;
		answer = n/5;
		answer2 = (n+m)/12;
		
		answer = Math.min(answer, answer2);

		System.out.println(answer);
	}

}
