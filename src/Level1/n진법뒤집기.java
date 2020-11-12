package Level1;

public class n진법뒤집기 {

	public static void main(String[] args) {
		int n = 45;
		
		System.out.println(solution(n));
	}
	public static int solution(int n) {
        int answer = 0;
        String ans = "";
        
        // n진법 만들기
        while(n>0) {
        	ans += (n%3);
        	n /= 3;
        }
        for(int i = 0 ; i < ans.length() ; i++) {
        	answer +=(ans.charAt(i) - '0' ) * Math.pow(3, ans.length()-1-i);
        }
        
        return answer;
    }
}
