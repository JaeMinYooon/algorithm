package Level2;

public class ���̽�ƽ {
	���� �´µ� �׽�Ʈ ���̽��� ������� ����.
	public static void main(String[] args) {
		String name ="JEROEN";
		solution(name);

	}
	public static int solution(String name) {
		int answer= 0;
		int answer1 = 0;
		String [] sname = name.split("");
		
		for(int i = 0 ; i < sname.length; i++) {
			//System.out.println((int)sname[i].charAt(0)-65);
			if((int)sname[i].charAt(0)-65 > 13) {
				answer = answer + 26 - ((int)sname[i].charAt(0)-65);
			}
			else {
				answer += ((int)sname[i].charAt(0)-65);
			}
			if(sname[i].contentEquals("A"))
				answer--;
			answer++; // ĭ�̵�
		}
		answer--; //�Ǹ������� Ƚ������ x
		
		for(int i = sname.length-1 ; i >= 0; i--) {
			//System.out.println((int)sname[i].charAt(0)-65);
			if((int)sname[i].charAt(0)-65 > 13) {
				answer1 += 26 - ((int)sname[i].charAt(0)-65);
			}
			else {
				answer1 += ((int)sname[i].charAt(0)-65);
			}
			if(sname[i].contentEquals("A"))
				answer1--;
			answer1++; // ĭ�̵�
		}
		answer1--; //�Ǹ������� Ƚ������ x
		System.out.println(answer);
		if(answer1 < answer)
			answer = answer1;
		return answer;
	}

}
