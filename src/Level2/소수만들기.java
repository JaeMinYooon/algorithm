package Level2;

public class 소수만들기 {
	// 콤비네이션
	// 2주는 하자잉..dlT
	// 1일차 
	// 2일차.. 좀 더 하자 ㅠ
	// 3일차.. 심각
	// 4일차.. 무난
	// 5일차.. 이제 제대로 간다
	// 6일차.. 애매.. 내일은 쉬고 월욜부터 달리자
	// 하루 쉼hk wlsWK
	// 쏘쏘 하지만 집공부 가자
	// 후.. 이젠 달리자.
	// 더더더더더
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
		// 1,0은 소수가 아님
		if (num == 1 || num == 0)
			return false;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				// 소수가 아님
				return false;
			}
		}
		// 소수임
		return true;
	}
}
