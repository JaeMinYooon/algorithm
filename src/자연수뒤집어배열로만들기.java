
public class �ڿ���������迭�θ���� {

	public static void main(String[] args) {
		int n = 12345;
		String a = "" + n;
		System.out.println(a);
		solution(n);
		
	}
	public static int[] solution(long n) {
	      int[] answer = {};
	      String array = Long.toString(n);
	      String []change = new String[array.length()];
	      answer = new int[change.length];
	      change = array.split("");
	      for(int i = 0 ; i < change.length ; i++) {
	    	  answer[i] = Integer.parseInt(change[change.length-i-1]);
	      }
	      return answer;
	  }
}
