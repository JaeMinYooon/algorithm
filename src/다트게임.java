
public class 다트게임 {

	public static void main(String[] args) {
		String dartResult = "1S2D*3T";
		
		solution(dartResult);

	}
	public static int solution(String dartResult) {
	      int answer = 0;
	      String[] sa = dartResult.split(""); //splitArray
	      int num = 0;
	      //배열 3개 만들어서 해야할듯...???  그래야 *을 해결 가능
	      for(int i = 0 ; i < sa.length ; i++) {
	    	  switch(sa[i]) {
	    	  case "S":
	    		  break;
	    	  case "D":
	    		  //숫자 제곱
	    		  break;
	    	  case "T":
	    		  //숫자 세제곱
	    		  break;
	    	  case "*":
	    		  //앞숫자 *2 지금숫자 *2
	    		  break;
	    	  case "#":
	    		  //숫자 * -1
	    		  break;
	    	  default:
	    		  // 숫자 들어옴
	    		  num = Integer.parseInt(sa[i]);
	    		  break;
	    			  
	    	  }
	      }
	      
	      return answer;
	  }
}
