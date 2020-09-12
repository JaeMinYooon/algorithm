package Level2;

import java.util.Arrays;

public class H_Index {

	public static void main(String[] args) {
		int[] citations = {22,42};
		
		
		System.out.println(solution(citations));
	}

	 public static int solution(int[] citations) {
	        int answer = 0;
	        
	        Arrays.parallelSort(citations);
	        
	        for(int i = 0 ; i < citations.length ; i++) {
	        	answer = i;
	        	if(answer >= citations[citations.length-i-1])
	        		return answer;
	        }
	        
	        
	        return answer+1;
	    }
}
