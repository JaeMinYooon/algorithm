package Level2;

public class 나는우승자다 {

	public static void main(String[] args) {
		
		int[][] score = {{5,4,4,5},{5,4,4,4},{5,5,4,4},{5,5,5,4},{4,4,4,5}};
		
		System.out.println(solution(score));

	}
	
	public static int solution(int[][] score) {
		int max = 0;
		int index =0;
		int test = 0;
		int i=0;
		for(i = 0 ; i < score.length ; i++) {
			test = 0;
			for(int j = 0 ;  j < score[i].length ; j++) {
				test += score[i][j];
			}
			if(max < test) {
				max = test;
				index = i;
			}
		}
		
		
		
		return index+1;
	}

}
