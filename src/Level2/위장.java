package Level2;

import java.util.HashMap;
import java.util.Set;

public class 위장 {
	//해쉬 연습좀 하고 풀자
	public static void main(String[] args) {
		String[][] clothes= {{"yellow_hat", "headgear"},{"blue_sunglasses","eyewear"},{"green_turban","headgear"}};
		
		solution(clothes);
		
	}
	public static int solution(String[][] clothes) {
		int answer = 1; //곱셈을 위해 1로 선언
        HashMap<String, Integer> clothesMap = new HashMap<String, Integer>();
        //map 구하기
        for(int i =0; i<clothes.length; i++){
        	//의상종류, 갯수
            clothesMap.put(clothes[i][1], clothesMap.getOrDefault(clothes[i][1], 0)+1);
        }
        //조합
        Set<String> keySet = clothesMap.keySet(); //의상종류.
        
        System.out.println(clothesMap);
        for(String key : keySet) {
        	answer *= clothesMap.get(key)+1; 
        }
        return answer-1; //아무것도 안입는 경우의 수 제거
    }
}
