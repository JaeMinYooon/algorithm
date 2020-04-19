package Level2;

import java.util.Arrays;

public class 상근날드 {

	public static void main(String[] args) {
		int[] price = {800, 700, 900, 198, 330};
		
		System.out.println(solution(price));
	}

	
	public static int solution(int[] price) {
		int answer = 0;
		int[] ham = new int[3];
		int[] coke = new int[2];
		
		for(int i = 0 ; i < 3 ;i++) {
			ham[i] = price[i];
		}
		for(int i = 3 ; i < 5 ; i++) {
			coke[i-3] = price[i];
		}
		Arrays.parallelSort(ham);
		Arrays.sort(coke);
		
		answer = ham[0] + coke[0] - 50;
		
		
		return answer;
	}
}
