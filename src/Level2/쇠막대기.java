package Level2;

import java.util.Stack;

public class ¼è¸·´ë±â {

	public static void main(String[] args) {
		String a = "()(((()())(())()))";
		System.out.println(solution(a));
	}
	public static int solution(String arrangement) {
        int answer = 0;
        Stack<Character> st = new Stack<>();
        
        for(int i = 0 ; i < arrangement.length(); i++) {
        	if(arrangement.charAt(i) == '(') {
        		if(i+1 < arrangement.length() && arrangement.charAt(i+1) == ')') {
        			answer+= st.size();
        			i++;
        		}
        		else {
        			st.push('(');
        		}
        	}
        	else if(arrangement.charAt(i) == ')') {
        		st.pop();
        		answer++;
        	}
        }
	
        return answer;
    }
}
