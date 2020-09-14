package Level2;

public class ¿Ã¹Ù¸¥°ýÈ£ {

	public static void main(String[] args) {
		String s = "(()(";
		
		System.out.println(solution(s));
	}

	public static boolean solution(String s) {
        boolean answer = true;
        int score = 0;
        
        for(int i = 0 ; i < s.length() ; i++) {
        	if(s.charAt(i)=='(')
        		score++;
        	else
        		score--;
        	if(score<0)
        		return false;
        }
        if(score == 0)
        	return answer;
        else
        	return false;
    }
}
