import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		solution(4);
		
	}

	static  public String solution(int n) {
	      String answer = "";
	      for(int i = 0 ; i < n ; i++) {
	    	  if(i%2==0)
	    		  answer += "¼ö";
	    	  else
	    		  answer += "¹Ú";
	      }
	      System.out.println(answer);
	      return answer;
	}
}
