package Level2;

import java.util.HashMap;
import java.util.Vector;

public class 위장 {
	//해쉬 연습좀 하고 풀자
	public static void main(String[] args) {
		String[][] clothes= {{"yellow_hat", "headgear"},{"blue_sunglasses","eyewear"},{"green_turban","headgear"}};
		
		solution(clothes);
		
	}
	public static int solution(String[][] clothes) {
        int answer = 0;
        HashMap<String, String> map = new HashMap<String, String>();
        Vector<Integer> num = new Vector<Integer>();
        for(int i = 0 ; i < clothes.length ; i++) {
        	map.put(clothes[i][0], clothes[i][1]);
        }
        System.out.println(map.values());
        int cnt = 0;
        System.out.println(map);
        while(!map.isEmpty()) {
        	
        }
        return answer;
    }
}
