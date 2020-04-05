package Level2;

public class 피보나치수 {
	public static void main(String[] args) {
		int n = 5;
		solution(n);
	}
	
	 public static int solution(int n) {
	      int answer = 0;
	      
	      int a1 = 0;
	      int a2 = 1;
	      int a3 = 0;
	      for(int i = 1 ; i < n ; i++) {
	    	  a3 = a1 + a2;
	    	  a1 = a2;
	    	  a2 = a3;
	      }
	      answer = a3%1234567;
	      System.out.println(answer);
	      return answer;
	  }
	
}
