package Level3;

import java.util.HashMap;

public class 베스트앨범 {
	// 해시
	public static void main(String[] args) {
		String[] genres = {"classic", "pop", "classic", "classic", "pop"};
		int[] plays = {500, 600, 150, 800, 2500};

		solution(genres, plays);
	}
	public static int[] solution(String[] genres, int[] plays) {
        int[] answer = {};
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for(int i = 0 ; i < genres.length ; i++) {
        	map.put(genres[i],plays[i]);
        }
        
        
        return answer;
    }
}
