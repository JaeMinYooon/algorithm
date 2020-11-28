package codingtest;

import java.util.Arrays;

public class nhn1 {

	public static void main(String[] args) {
		int[] goods = {50,50,50};
		
		System.out.println(solution(goods));

	}
	public static int solution(int[] goods){
		int answer = 0;
		Arrays.sort(goods);
		int sum = 0;
		int count = 0;
		
		for(int i = 0 ; i < goods.length ; i++) {
			if(goods[i] > 99 || goods[i]<1)
				return 0;
			sum += goods[i];
			if(sum>=50) {
				answer += sum - 10;
				sum = 0;
				count++;
			}	
		}
		if(count == 0)
			answer += sum;
		
        return answer;
    }
}
