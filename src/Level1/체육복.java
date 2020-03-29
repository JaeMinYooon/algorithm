package Level1;
// ¾î·Á¿ö¼­ ÈùÆ® º½...
public class Ã¼À°º¹ {

	public static void main(String[] args) {
		int n = 8;
		int[] lost = { 4, 5 };
		int[] reserve = { 5, 6 };
		solution(n, lost, reserve);

	}

	public static int solution(int n, int[] lost, int[] reserve) {
	    int answer = n-lost.length;
	    for(int i=0;i<reserve.length;i++){
            for(int j=0;j<lost.length;j++){
            	if(lost[j] == reserve[i])
            	{
            		
            		lost[j] = -1;
            		reserve[i] = -1;
            		break;
            	}
            }
	    }
        for(int i=0;i<reserve.length;i++){
            for(int j=0;j<lost.length;j++){
                if(reserve[i]-1 == lost[j] || reserve[i]+1 == lost[j] || reserve[i] == lost[j] ){
                    answer++;
                    lost[j]=-2;
                    break;
                }
            }
           
        }
        System.out.println(answer);
        return answer;
	}
}

/*
 * class Solution { public int solution(int n, int[] lost, int[] reserve) { int
 * answer = 0; answer = n;
 * 
 * for(int i = 0; i < lost.length; i++) { boolean rent = false; int j = 0;
 * while(!rent) { if(j == reserve.length) break; if(lost[i] == reserve[j])
 * {reserve[j] = -1; rent=true;} else if(lost[i] - reserve[j] == 1 ) {reserve[j]
 * = -1; rent=true;} else if(lost[i] - reserve[j] == -1) {reserve[j] = -1;
 * rent=true;} else {j++; } } if(!rent) answer--; } return answer; } }
 */
/*
 * 
 * 
 * class Solution { public int solution(int n, int[] lost, int[] reserve) {
 * int[] people = new int[n]; int answer = n;
 * 
 * for (int l : lost) people[l-1]--; for (int r : reserve) people[r-1]++;
 * 
 * for (int i = 0; i < people.length; i++) { if(people[i] == -1) { if(i-1>=0 &&
 * people[i-1] == 1) { people[i]++; people[i-1]--; }else if(i+1< people.length
 * && people[i+1] == 1) { people[i]++; people[i+1]--; }else answer--; } } return
 * answer; } }
 */