package Level2;

import java.util.Arrays;

public class ∞≈∫œ¿Ã {

	public static void main(String[] args) {
		int[] move = {1,2,3,4};
		
		
		System.out.println(solution(move));
	}
	
	public static int solution(int[] move) {
		int answer = 0;
		
		Arrays.sort(move);
		answer = move[0] * move[2];
		
		return answer ;
	}
}
