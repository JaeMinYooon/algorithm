package codingtest;

public class re1 {

	public static void main(String[] args) {
		String  vote = "AAAABCCCCC";
		System.out.println(solution(vote));
	}
	public static String solution(String vote) {
        String answer = "";
        int cntA = 0;
        int cntB = 0;
        int cntC = 0;
        for(int i = 0 ; i < vote.length() ; i++) {
        	if(vote.charAt(i)=='A')
        		cntA++;
        	else if (vote.charAt(i)=='B')
        		cntB++;
        	else if (vote.charAt(i)=='C')
        		cntC++;
        	
        	if(cntC>=vote.length()/2)
        		return "C";
        }
        if(cntA>cntB)
        	return "A";
        else if(cntA==cntB)
        	return "AB";
        else
        	return "B";
    }
}
