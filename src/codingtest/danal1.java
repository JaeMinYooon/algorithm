package codingtest;

public class danal1 {

	public static void main(String[] args) {
		String[] strs = {"abcdaefg", "a", "abcdhfg"};
		
		System.out.println(solution(strs));
	}
	public static String solution(String[] strs) {
		if(strs.length == 0 )return "";
        if (strs.length == 1) return strs[0];
        String answer = strs[0];
        boolean flag = true;
        int min = 0;
        for(int i=1; i<strs.length; i++) {
            min = Math.min(strs[i].length(), answer.length());
            for(int j=0; j<min; j++) {
                if(strs[i].charAt(j) != answer.charAt(j)) {
                    answer = answer.substring(0, j);
                    flag = false;
                    break;
                }
            }
            if(flag)
            	answer = answer.substring(0, min);
            
        }

        return answer;
    }
}
