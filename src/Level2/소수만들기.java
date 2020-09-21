package Level2;

public class 소수만들기 {

	public static void main(String[] args) {
		int[] nums = {1,2,7,6,4};
		
		System.out.println(solution(nums));
		
	}

	public static int solution(int[] nums) {
		int answer = 0;
		
		
		
		return answer;
	}
	static void combination(int[] arr, boolean[] visited, int start, int n, int r) {
	    if(r == 0) {
	        //print(arr, visited, n);
	        return;
	    } 

	    for(int i=start; i<n; i++) {
	        visited[i] = true;
	        combination(arr, visited, i + 1, n, r - 1);
	        visited[i] = false;
	    }
	}
	
	
	private static int checkPrime(int num) {
		//1,0은 소수가 아님
		if(num == 1 || num == 0)return 1;
		for(int i=2; i<num; i++){
			if(num%i == 0){
				//소수가 아님
				return 1;
			}
		}
		//소수임
		return 2;
	}
}
