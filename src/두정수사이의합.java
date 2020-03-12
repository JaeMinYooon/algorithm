
public class 두정수사이의합 {

	public static void main(String[] args) {
		int a = 5, b = 5;
		solution(a, b);
		
	}

	public static long solution(int a, int b) {
		long answer = 0;
		if(a>b)
			for(int i = b ; i<=a ; i++) 
				answer += i;
		else if(a<b) 
			for(int i = a ; i<=b; i++)
				answer += i;
		else
			answer += a;
		
		return answer;
	}
}

/*
  class Solution {
  public long solution(int a, int b) {
      long answer = 0;
      for (int i = ((a < b) ? a : b); i <= ((a < b) ? b : a); i++) 
          answer += i;

      return answer;
  }
}
*/