package Level1;
public class 같은숫자는싫어 {

	public static void main(String[] args) {
		int []arr = {1,1,3,3,0,1,1};
		solution(arr);
		
	}
	public static int[] solution(int []arr) {
        int[] answer = {};
        int[] answers = new int [30];
        int cnt = 0, i;
        for(i = 0 ; i < arr.length-1; i++) {
        	if(arr[i] != arr[i+1]) {
        		answers[cnt] = arr[i];
        		cnt++;
        	}
        }
        answers[cnt] = arr[i]; 
        cnt++;
        answer = new int [cnt];
        for (i = 0 ; i < cnt ; i++) {
        	answer[i] = answers[i];
        }
        for (i = 0 ; i < answer.length ; i++) {
        	System.out.println(answer[i]);
        }
        return answer;
	}
}


/*
 import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> tempList = new ArrayList<Integer>();
        int preNum = 10;
        for(int num : arr) {
            if(preNum != num)
                tempList.add(num);
            preNum = num;
        }       
        int[] answer = new int[tempList.size()];
        for(int i=0; i<answer.length; i++) {
            answer[i] = tempList.get(i).intValue();
        }
        return answer;
    }
}
 */
