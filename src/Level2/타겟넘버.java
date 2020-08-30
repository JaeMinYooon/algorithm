package Level2;

public class 타겟넘버 {
// for 안에 for 안에 for for 하면 될듯?
// 첨 포문은 5개 갯수 늘리기 둘째 포문은 순서 앞부터 1 2 3 4 5 번째 - 넣어주기
// start
// plz start
	public static void main(String[] args) {
		int[] numbers = { 1, 1, 1, 1, 1 };
		int target = 3;

		System.out.println(solution(numbers, target));
	}

	public static int solution(int[] numbers, int target) {
	        int answer = 0;
	        int sum=0;
	        int j;
	        for(int i=0; i<numbers.length; i++) {
	            sum=0;
	            for(j=0; j<i; j++) { // - 개수만큼 더하기
	                numbers[i] *= -1;
	            }
	            for( ;;){ // + 개수만큼 더하기
	              
	                
	            }   
	            }
	        
	        return answer;
	    }
}
