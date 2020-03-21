import java.util.Arrays;
import java.util.Collections;

public class 정수내림차순으로배치하기 {

	public static void main(String[] args) {
		long n = 118372;
		solution(n);
		
	}
	 public static long solution(long n) {
	      long answer = 0;
	      String notyet = "";
	      String change = Long.toString(n);
	      String []array = change.split("");
	      int []number = new int [array.length];
	      for(int i = 0 ; i < number.length; i++) {
	    	  number[i] = Integer.parseInt(array[i]);
	      }

	      Arrays.sort(number);
	      
	      for(int i = 0 ; i < number.length; i++) {
	    	  notyet += Long.toString(number[number.length-1-i]);
	      }
	      answer = Long.parseLong(notyet);
	      System.out.println(answer);
	      return answer;
	  }
}
