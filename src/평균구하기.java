
public class ��ձ��ϱ� {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4};
		solution(arr);
		
	}
	public static double solution(int[] arr) {
	      double answer = 0;
	      double sum = 0;
	      for(int i = 0 ; i < arr.length ; i++) {
	    	  sum += arr[i];
	      }
	      answer = sum / arr.length;
	      return answer;
	  }
}
