package Level2;

import java.util.Vector;

public class 수식최대화 {

	public static void main(String[] args) {
		String expression = "100-200*300-500+20";
		
		System.out.println(solution(expression));
	}
	
	public static long solution(String expression) {
        long answer = 0;
        String[] num = expression.split("\\*|\\-|\\+");
        char[] exp = new char[num.length-1];
        int step = 0;
        Vector<String> v = new Vector<String>();
        Vector<String> newv = new Vector<String>();
        
        for(int i = 0 ; i < exp.length ; i++) {
        	step += num[i].length();
        	exp[i] = expression.charAt(step);
        	step++;
        }
        
        for(int i = 0 ; i < num.length ; i++) {
        	v.add(num[i]);
        	newv.add(num[i]);
        }
        
        // * - +
        for(int i = 0 ; i < exp.length ; i++) {
        	if(exp[i] == '*') {
        		
        	}
        }
        
        
        return answer;
    }

}
