package Level2;

public class �Ҽ������ {
	
	static int answer = 0;
	public static void main(String[] args) {
		int[] nums = { 1, 2, 7, 6, 4 };

		System.out.println(solution(nums));

	}

	public static int solution(int[] nums) {
		
		int n = nums.length;
		boolean[] visited = new boolean[n];
		combination(nums, visited, 0, n, 3);
		

		return answer;
	}

	static void combination(int[] arr, boolean[] visited, int start, int n, int r) {
		if (r == 0) {
			print(arr, visited, n);

			return;
		}

		for (int i = start; i < n; i++) {
			visited[i] = true;
			combination(arr, visited, i + 1, n, r - 1);
			visited[i] = false;
		}
	}

	static void print(int[] arr, boolean[] visited, int n) {
		int num = 0;
		for (int i = 0; i < n; i++) {
			if (visited[i]) {
				num += arr[i];
			}
		}
		if(checkPrime(num))
			answer++;
	}

	static boolean checkPrime(int num) {
		// 1,0�� �Ҽ��� �ƴ�
		if (num == 1 || num == 0)
			return false;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				// �Ҽ��� �ƴ�
				return false;
			}
		}
		// �Ҽ���
		return true;
	}
}
