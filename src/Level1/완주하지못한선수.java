package Level1;
import java.util.Arrays;
public class 완주하지못한선수 {

	public static void main(String[] args) {
		String[] participant = {"leo", "kiki", "eden"};
		String[] completion = {"eden", "kiki"};
		System.out.println(solution(participant, completion));
	}
	 public static String solution(String[] participant, String[] completion) {
	        Arrays.sort(participant);
	        Arrays.sort(completion);
	        int i = 0;
	        for(i = 0 ; i < participant.length-1 ; i++)
	        	if(participant[i].equals(completion[i])!= true) 
	        		return participant[i];
	        
	        
	        return participant[i];
	    }
}
