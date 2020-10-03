package Level2;

public class test11 {
	
	public static void main(String[] args) {

		String S = "dog";
		System.out.println(solution(S));
	}

	public static int solution(String S) {
		int answer = 0;
		int cntA = 0;
		int []intS = new int [S.length()];
		for(int i = 0 ; i < S.length(); i++) {
			if(S.charAt(i)=='a') {
				cntA++;
				intS[i]=cntA;
				if(cntA == 3)
					return -1;
			}
			else {
				cntA=0;
				intS[i]=cntA;
			}
		}
		for(int i = 1 ; i < S.length(); i++) {
			if(intS[i]==0) {
				if(intS[i-1]==0) {
					answer+=2;
				}
				else if (intS[i-1]==2) {
					continue;
				}
				else if(intS[i-1]==1) {
					answer++;
				}
			}
		}
		if(intS[S.length()-1]==1)
			answer++;
		else if(intS[S.length()-1]==0)
			answer+=2;
		
		if(intS[0]==1) {
			if(intS[1]==0)
				answer++;
		}
		else if( intS[0]==0) {
			if(intS[1]==1)
				answer++;
			else if(intS[1]==0)
				answer+=2;
		}
		return answer; 
    }
}
