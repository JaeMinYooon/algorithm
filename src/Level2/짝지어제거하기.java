package Level2;

import java.util.Stack;

public class 짝지어제거하기 {

	public static void main(String[] args) {
		String s = "cd cd";
		System.out.println(solution(s));
	}

	public static int solution(String s) {
		Stack<Character> st = new Stack<>();
		for(char c : s.toCharArray()) {
			System.out.println(s.toCharArray());
			if(!st.empty() && st.peek() == c) st.pop();
			else st.push(c);
		}
		
		return st.isEmpty() ? 1 : 0;
	}

}
