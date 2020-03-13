
public class 가운데글자가져오기 {
	public static void main(String[] args) {
		String a = "qwer";
		solution(a);
		
	}
	static String solution(String s) {
		String answer = "";
		String[] array = s.split("");
		if(s.length()%2==0) {
			answer=(array[(s.length())/2-1] + array[s.length()/2]);
		}
		else 
			answer=array[(s.length())/2];
		
		
		System.out.println(answer);
		return answer;
    }
}

/*
return word.substring((word.length()-1) / 2, word.length()/2 + 1);    
*/