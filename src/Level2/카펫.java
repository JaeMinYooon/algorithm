package Level2;

import java.util.Vector;

public class 카펫 {

	public static void main(String[] args) {
		int brown = 6;
		int red = 1;
		
		System.out.println(solution(brown, red));
	}
	//이거 더한거의 약수의 곱!!
	public static int[] solution(int brown, int red) {
        int[] answer = new int[2];
        int sum = brown + red;
        int a = 1;
        int b = 1;
        Vector<Integer> save = new Vector<Integer>();
        
        for(int i = 1 ; i <= sum; i++) {
        	if((sum%i)==0)
        		save.add(i);
        }
        System.out.println(save.toString());
        
        if(save.size() % 2 !=0) {
        	a = save.get(save.size()/2);
        	b = save.get(save.size()/2);
        }
        else {
        	a = save.get(save.size()/2);
        	b = save.get(save.size()/2-1);
        }
        System.out.println(a + " | " + b);
        
        answer[0] = a;
        answer[1] = b;
        return answer;
    }
}
