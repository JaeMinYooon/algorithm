package codingtest;

public class danal3 {

	public static void main(String[] args) {
		int[] price = {5,1,1,1,1,1,1,1,1,10};
		
		solution(price);
	}
	public static int[] solution(int[] price) {
		
        int[] answer = new int[price.length];
        int count = 0;
        int i = 0;
        for(i = 0 ; i < price.length ; i++) {
        	for(int j = i+1 ; j < price.length ; j++) {
        		count++;
        		if(price[i] < price[j]) {
        			answer[i]=count;
        			count = 0;
        			break;
        		}
        	}
        	if(count != 0 ) {
        		answer[i]=-1;
        		count = 0;
        	}
        }
        answer[i-1] = -1;
        for(i = 0 ; i < answer.length ; i++) {
        	System.out.println(answer[i]);
        }
        
        return answer;
    }
}
