package Level2;

public class 수식최대화 {
	static long answer;
	static char[] exp;
	public static void main(String[] args) {
		String expression = "100-200*300-500+20";
		
		System.out.println(solution(expression));
	}
	
	public static long solution(String expression) {
	    answer = 0;
        String[] num = expression.split("\\*|\\-|\\+");
        exp = new char[num.length-1];

        int step = 0;
        
        
        for(int i = 0 ; i < exp.length ; i++) {
        	step += num[i].length();
        	exp[i] = expression.charAt(step);
        	step++;
        }
        
        return answer;
    }

}
