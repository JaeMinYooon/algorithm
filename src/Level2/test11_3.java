package Level2;

import java.util.Arrays;

public class test11_3 {

	public static void main(String[] args) {
		int []A = {6,2,3,5,6,3};
		
		System.out.println(solution(A));
	}

	public static int solution(int[] A) {
		int answer = 0;
		Arrays.parallelSort(A);
		for(int i = 0 ; i < A.length ; i++) {
			if(A[i] > i+1) {
				answer += A[i]-(i+1);
			}
			else if(A[i] < i+1) {
				answer += (i+1)-A[i];
			}
		}
			
		return answer;
    }
}
