package Level2;

import java.util.HashMap;
import java.util.Set;

public class ���� {
	//�ؽ� ������ �ϰ� Ǯ��
	public static void main(String[] args) {
		String[][] clothes= {{"yellow_hat", "headgear"},{"blue_sunglasses","eyewear"},{"green_turban","headgear"}};
		
		solution(clothes);
		
	}
	public static int solution(String[][] clothes) {
		int answer = 1; //������ ���� 1�� ����
        HashMap<String, Integer> clothesMap = new HashMap<String, Integer>();
        //map ���ϱ�
        for(int i =0; i<clothes.length; i++){
        	//�ǻ�����, ����
            clothesMap.put(clothes[i][1], clothesMap.getOrDefault(clothes[i][1], 0)+1);
        }
        //����
        Set<String> keySet = clothesMap.keySet(); //�ǻ�����.
        
        System.out.println(clothesMap);
        for(String key : keySet) {
        	answer *= clothesMap.get(key)+1; 
        }
        return answer-1; //�ƹ��͵� ���Դ� ����� �� ����
    }
}
