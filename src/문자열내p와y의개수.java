
public class 문자열내p와y의개수 {
	public static void main(String[] args) {
		String a = "pPoooyY";
		solution(a);
		
	}
	static boolean solution(String s) {
        boolean answer = true;
        s = s.toLowerCase();
        String[] array = s.split("");
        int countP=0, countY=0;
        for(int i = 0 ; i < s.length(); i++) {
        	if(array[i].equals("p"))
        		countP++;
        	else if (array[i].equals("y"))
        		countY++;
        }
        if(countP != countY)
        	answer=false;
        

        return answer;
    }
}

/*

class Solution {
    boolean solution(String s) {
        s = s.toUpperCase();

        return s.chars().filter( e -> 'P'== e).count() == s.chars().filter( e -> 'Y'== e).count();
    }
}
 */