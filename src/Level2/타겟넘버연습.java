package Level2;

public class 타겟넘버연습 {
	// 연습 ㄱㄱ 
	// 나이스 데이 ㅎals!
	// 내일은 ㄱㄱ
	// 후.. 추석 후에 보려나..
	public static void main(String[] args) {
		int[] numbers = { 1, 1, 1, 1, 1 };
		int target = 3;

		System.out.println(solution(numbers, target));
	}

	public static int solution(int[] numbers, int target) {
		int current = numbers[0];
		int answer = 0;
		
		//answer += dfs(current, 1, numbers, target);
		//answer += dfs(-current, 1, numbers, target);
		
		
		return answer;
	}
	
//	public static int dfs(int prev, int index, int[] numbers, int target) {}

}
