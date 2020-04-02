package Level2;

public class 나라124의숫자 {
	
	public static void main(String[] args) {
		int n = 9;
		
		solution(n);
	}
	
	public static String solution(int n) {
	      String answer = "";
	      while(n > 3) {
	    	  if(n%3 == 1)
	    		  answer = 1 + answer;
	    	  else if (n%3 == 2)
	    		  answer = 2 + answer;
	    	  else if (n%3 == 0) {
	    		  answer = 4 + answer;
	    		  n = n-1;
	    	  }
	    	 n = n/3;
	      }
	      if(n%3 == 1)
    		  answer = 1 + answer;
    	  else if (n%3 == 2)
    		  answer = 2 + answer;
    	  else if (n%3 == 0)
    		  answer = 4 + answer;
	      return answer;
	  }
}
