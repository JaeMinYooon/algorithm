package Level2;

import java.util.Arrays;

public class H_Index {

	public static void main(String[] args) {
		int[] citations = {3,0,6,1,5};
		
		System.out.println(solution(citations));
	}

	 public static int solution(int[] citations) {
	        int answer = 0;
	        
	        Arrays.parallelSort(citations);
	        answer = citations.length/2 + 1;
	        
	        return answer;
	    }
}
