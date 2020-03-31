package Level2;

public class 조이스틱 {
	값은 맞는데 테스트 케이스가 통과되지 않음.
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
			answer++; // 칸이동
		}
		answer--; //맨마지막은 횟수포함 x
		
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
			answer1++; // 칸이동
		}
		answer1--; //맨마지막은 횟수포함 x
		System.out.println(answer);
		if(answer1 < answer)
			answer = answer1;
		return answer;
	}

}
