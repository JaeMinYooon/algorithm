package codingtest;

import java.util.Arrays;

public class nhn5 {

	public static void main(String[] args) {
		int[] votes = {10,10,10,10};
		
		System.out.println(solution(votes));
	}
	public static int solution(int[] votes){
		if(votes.length == 1 || votes.length == 0)
			return 0;
		int answer = 0;
		int[] v = new int[votes.length-1];
		int n = 0;
		for(int i = 1 ; i < votes.length ;i++) {
			v[n]=votes[i];
			n++;
		}
		while(true) {
			Arrays.parallelSort(v);
			if(votes[0] <= v[v.length-1]) {
				votes[0]++;
				answer++;
				v[v.length-1]--;
			}
			else
				return answer;
		}	
	}
}
