package Level1;
public class 제일작은수제거하기 {
	public static void main(String[] args) {
		int []arr = {4,2,1,3};
		solution(arr);
	}
	public static int[] solution(int[] arr) {
	      int[] answer = {-1};
	      if(arr.length == 1) {
	    	  return answer;
	      }
	      answer = new int[arr.length-1];
	      int min = arr[0];
	      int index = 0;
	      for(int i = 0 ; i < arr.length; i++) {
	    	  if(arr[i] < min) {
	    		  min = arr[i];
	    		  index = i;
	    	  }
	      }
	      int count= 0;
	      for(int i = 0 ; i < arr.length; i++) {
	    	  if(i == index)
	    		  continue;
	    	  else {
	    		  answer[count] = arr[i];
	    		  count++;
	    	  }
	      }
	      for(int i =0  ; i < answer.length ; i++)
	    	  System.out.println(answer[i]);
	      return answer;
	  }
}
