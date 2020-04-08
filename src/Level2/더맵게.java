package Level2;

import java.util.Arrays;
import java.util.PriorityQueue;

public class ´õ¸Ê°Ô {

	public static void main(String[] args) {
		int[] scoville = { 7,1,6,3,11,5 };
		int K = 7;
		System.out.println(solution(scoville, K));
	}

	public static int solution(int[] scoville, int K) {
		int answer = 0;
		PriorityQueue<Integer> heap = new PriorityQueue<Integer>();

		for (int a : scoville) {
			heap.add(a);
			System.out.println(heap.toString());
		}
		while (heap.peek() <= K) {
			if (heap.size() == 1) {
				return -1;
			}
			int a = heap.poll();
			int b = heap.poll();

			int result = a + (b * 2);
			heap.add(result);
			answer++;
		}

		return answer;
	}

	public static int solution1(int[] scoville, int K) {
		int answer = 0;
		int cnt = 0;
		Arrays.sort(scoville);
		if (scoville[0] > K)
			return 0;
		for (int i = 0; i < scoville.length - 1; i++) {
			int sum = scoville[i] + scoville[i + 1] * 2;
			scoville[i] = 0;
			scoville[i + 1] = sum;
			answer++;
			if (i + 2 < scoville.length && scoville[i + 2] < scoville[i + 1])
				Arrays.sort(scoville);
			if (scoville[i + 1] > K) {
				break;
			}
			cnt++;
		}
		if (cnt == scoville.length - 1)
			return -1;
		return answer;
	}
}
