package Level2;

public class 숫자의표현 {

	public static void main(String[] args) {
		int n = 15;
		
		System.out.println(solution(n));
	}
	public static int solution(int n) {
	      int answer = 1;
	      int sum = 0;
	      for(int i = 1 ; i <= n/2 ; i++) {
	    	  sum = 0;
	    	  for( int j = i ; j < n ; j++) {
	    		  sum += j;
	    		  if(sum == n) {
	    			  answer++;
	    			  break;
	    		  }
	    		  else if(sum > n) {
	    			  break;
	    		  }
	    	  }
	      }
	      
	      return answer;
	  }
}
