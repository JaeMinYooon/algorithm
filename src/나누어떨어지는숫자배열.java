
public class 나누어떨어지는숫자배열 {
	public static void main(String[] args) {
		int []arr = {5,9,7,10};
		int divisor = 5;
		
		solution(arr, divisor);
		
	}
	
	public static int[] solution(int[] arr, int divisor) {
	      int[] answer = {};
	      int[] save = {};
	      save = new int [arr.length];
	      int savecount = 0;
	      for(int i = 0 ; i < arr.length-1; i++) {
				for(int j = i+1 ; j <arr.length; j++ ) {
					if(arr[i]>arr[j]) {
						int temp;
						temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}	
				}
	      }
	      for(int i = 0 ; i < arr.length; i++) {
	    	  if(arr[i]%divisor==0) {
	    		  save[savecount] = arr[i];
	    		  savecount++;
	    	  }
	      }
	      if(savecount==0) {
	    	  save[savecount]=-1;
	    	  savecount++;
	      }
	      answer = new int [savecount];
	      for(int i = 0 ; i < savecount; i++)
	    	  answer[i] = save[i];
	      return answer;
	  }
}


// return Arrays.stream(array).filter(factor -> factor % divisor == 0).toArray();