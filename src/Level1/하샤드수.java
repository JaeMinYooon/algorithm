package Level1;
public class �ϻ���� {
	public static void main(String[] args) {
		int x = 10;
		solution(x);
	}
	public static boolean solution(int x) {
	      boolean answer = true;
	      int sum = 0;
	      sum += x/10000;
	      sum += x%10000/1000;
	      sum += x%10000%1000/100;
	      sum += x%10000%1000%100/10;
	      sum += x%10000%1000%100%10/1;
	      if(x%sum!=0) {
	    	  return answer=false;
	      }
	      return answer;
	}
	
}

