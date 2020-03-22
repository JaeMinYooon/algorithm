
public class 정수제곱근판별 {

	public static void main(String[] args) {
		int n = 2;
		solution(n);
	}
	public static long solution(long n) {
	      long answer = -1;
	      double d = Math.sqrt(n);
	      if(d - (int)d == 0)
	      {
	    	  answer = (long) ((d+1) * (d+1));
	      }
	      
	      return answer;
	  }

}
