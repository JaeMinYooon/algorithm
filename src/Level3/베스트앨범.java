package Level3;

import java.util.HashMap;

public class 베스트앨범 {
	// 해시
	public static void main(String[] args) {
		String[] genres = {"classic", "pop", "classic", "classic", "pop","aa"};
		int[] plays = {500, 600, 150, 800, 2500, 100};

		solution(genres, plays);
	}
	public static int[] solution(String[] genres, int[] plays) {
        int[] answer = {};
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        
        for(int i = 0; i < genres.length; i++) {                             
            hm.put(genres[i], hm.getOrDefault(genres[i], 0) + plays[i]); // getOrDefault 찾는 키가 존재하면 해당 키의 값을 반환하고 없으면 기본값을 반환함
        }
        int firstIndex = 0;
        int secondIndex = 0;
        
        return answer;
    }
}
//https://tosuccess.tistory.com/40 참고msep