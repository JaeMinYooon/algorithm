
public class ���ڿ������ιٲٱ� {

	public static void main(String[] args) {
		String s = "-1234";
		solution(s);
		
	}
	public static int solution(String s) {
	      int answer = 0;
	      answer = Integer.parseInt(s);
	      System.out.println(answer);
	      if(s.substring(0,1) == "-")
	    	  answer *= -1;
	      else if (s.substring(0,1) == "+")
	    	  answer *= 1;
	      
	      return answer;
	  }
}
