package Level2;

import java.util.HashMap;

public class 영어끝말잇기 {

	public static void main(String[] args) {
		int n = 2;
		//String words[] = { "tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "dank" };
		String words[] = {"land", "dream", "mom", "mom"};
		System.out.println(solution(n, words)[0] + " " + solution(n,words)[1]);
	}

	public static int[] solution(int n, String[] words) {
		int[] answer = { 0, 0 };
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(0, words[0]);
		for(int i= 1 ; i < words.length; i++) {
			
			if (words[i-1].charAt(words[i-1].length() - 1) != words[i].charAt(0)) {
				answer[0] = i % n + 1;
				if (answer[0] == 0)
					answer[0] = n;
				answer[1] = i / n + 1;
				break;
			}
			
			if (map.containsValue(words[i])) {
				answer[0] = i % n + 1;
				if (answer[0] == 0)
					answer[0] = n;
				answer[1] = i / n + 1;
				break;
			}
			map.put(i, words[i]);
			
		}
		
		return answer;
	}
}
