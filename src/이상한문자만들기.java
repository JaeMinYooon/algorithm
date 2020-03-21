
public class 이상한문자만들기 {

	public static void main(String[] args) {
		String s = "try hello world ";
		solution(s);
	}

	public static String solution(String s) {
		String answer = "";
		String[] split = s.split(" ", -1);
		for(int i = 0 ; i < split.length ; i++) {
			System.out.println(split[i]);
		}
		for(int word = 0 ; word < split.length ; word++) {
			for(int seat = 0 ; seat < split[word].length() ; seat++) {
				if((seat+1) % 2 == 0) {
					//System.out.println(split[word].substring(seat,seat+1).toLowerCase());
					answer = answer + split[word].substring(seat,seat+1).toLowerCase(); 		
				}
				else {
					//System.out.println(split[word].substring(seat).toUpperCase());
					answer = answer + split[word].substring(seat,seat+1).toUpperCase();
				}
			}
			answer += " ";
		}
		answer = answer.substring(0,answer.length()-1);
		System.out.println(answer);
		return answer;
	}
}
