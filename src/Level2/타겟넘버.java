package Level2;

public class Ÿ�ٳѹ� {
// for �ȿ� for �ȿ� for for �ϸ� �ɵ�?
// ÷ ������ 5�� ���� �ø��� ��° ������ ���� �պ��� 1 2 3 4 5 ��° - �־��ֱ�
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
	            for(j=0; j<i; j++) { // - ������ŭ ���ϱ�
	                numbers[i] *= -1;
	            }
	            for( ;;){ // + ������ŭ ���ϱ�
	              
	                
	            }   
	            }
	        
	        return answer;
	    }
}
