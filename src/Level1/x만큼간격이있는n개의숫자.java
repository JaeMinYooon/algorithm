package Level1;
public class x��ŭ�������ִ�n���Ǽ��� {

	public static void main(String[] args) {
		int x = 2;
		int n = 5;
		solution(x,n);
		
	}
	 public static long[] solution(long x, int n) {
	      long[] answer = {};
	      answer = new long [n];
	      for(int i = 1; i <= n ; i++) {
	    	  answer[i-1] = x * i;
	      }
	      return answer;
	  }
}
