package Level2;

import java.util.HashMap;

public class ���� {
	//�ؽ� ������ �ϰ� Ǯ��
	public static void main(String[] args) {
		String[][] clothes= {{"yellow_hat", "headgear"},{"blue_sunglasses","eyewear"},{"green_turban","headgear"}};
		
		solution(clothes);
		
	}
	public static int solution(String[][] clothes) {
        int answer = 0;
        HashMap<String, String> map = new HashMap<String, String>();
        for(int i = 0 ; i < clothes.length ; i++) {
        	map.put(clothes[i][0], clothes[i][1]);
        }
        System.out.println(map.values());
        System.out.println(map);
        while(!map.isEmpty()) {
        	
        }
        return answer;
    }
}
