package Level2;

import java.util.Arrays;
import java.util.Vector;

public class 구명보트 {
	public static void main(String[] args) {
		int[] people = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
		int limit = 100;

		System.out.println(solution(people, limit));
	}

	public static int solution(int[] people, int limit) {
		
		int answer = 0;
		Vector<Integer> p = new Vector<Integer>();
		
		Arrays.parallelSort(people);
		
		for(int i = 0 ; i < people.length ; i++) {
			p.add(people[i]);
		}
		
		while(p.size() >= 1) {
			if(p.size() == 1) {
				answer++;
				break;
			}
			if(p.get(0) + p.get(p.size()-1)>limit) {
				answer++;
				p.remove(p.size()-1);
			}
			else {
				answer++;
				p.remove(p.size()-1);
				p.remove(0);
			}
		}
		
		return answer;
	}
}
