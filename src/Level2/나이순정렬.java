package Level2;

import java.util.PriorityQueue;

public class 나이순정렬 {

	public static void main(String[] args) {
		int [] age = {2,1, 21, 20,5,12};
		solution(age);
	}
	public static void solution(int[] age) {
		PriorityQueue<Integer> heap = new PriorityQueue<Integer>();
		
		for(int a : age)
			heap.add(a);
		
		
		while(!heap.isEmpty()) {
			System.out.print(heap.toString());
			int a = heap.poll();
			System.out.println(" | " + a);
			
		}
		
	}

}
