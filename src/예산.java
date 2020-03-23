import java.util.Arrays;

public class ¿¹»ê {

	public static void main(String[] args) {
		int [] d = {2,2,3,3};
		int budget = 10;
		System.out.println(solution(d, budget));
	}
	public static int solution(int[] d, int budget) {

	      Arrays.sort(d);
	      int sum = 0;
	      int i = 0;
	      for(i = 0 ; i < d.length; i++){
	    	  sum += d[i];
	    	  if(sum > budget) {
	    		  return i;
	    	  }
	    	  else if (sum == budget)
	    		  return i+1;
	          
	          
	      }
	      return i;
	  }
}
