package Level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 두개뽑아서더하기 {

	public static void main(String[] args) {
		int[] numbers = {2,1,3,4,1};
		
		solution(numbers);
		
	}
	public static int[] solution(int[] numbers) {
        int[] answer =  {};
        List<Integer> list = new ArrayList<Integer>();
        
        for(int i = 0 ; i < numbers.length-1 ; i++){
            for(int j = i+1 ; j < numbers.length ; j++){
            	if(!list.contains(numbers[i]+numbers[j]))
            		list.add(numbers[i]+numbers[j]);
            }
        }
        Collections.sort(list);
        answer = new int[list.size()];
        for(int i = 0 ; i < answer.length ;i++) {
        	answer[i] = list.get(i);
        }
        return answer;
    }
}
