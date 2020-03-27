package Level1;
public class 문자열정수로바꾸기 {

	public static void main(String[] args) {
		String s = "-1234";
		solution(s);
		
	}
	public static int solution(String s) {
	      int answer = 0;
	      answer = Integer.parseInt(s);
	      return answer;
	  }
}
