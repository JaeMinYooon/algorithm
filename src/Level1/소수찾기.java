package Level1;
public class 소수찾기 {

	public static void main(String[] args) {
		int n = 10;
		solution(n);
		
		
	}
	public static int solution(int n) {
	      int answer = 0;
	      int count;
	      for(int i = 2 ; i <= n ; i++) {
	    	  count=0;
	    	  for(int j = 1 ; j <= i/2 ; j++) {
	    		  if(i%j==0) {
	    			  count++;
	    			  if(count == 2)
	    				  break;
	    		  }
	    	  }
	    	  if(count==1)
	    		  answer++;
	      }
	      System.out.println(answer);
	      return answer;
	  }
}
