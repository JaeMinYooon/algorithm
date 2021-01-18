package Level2;

public class 쿼드압축후개수세기 {

	public static void main(String[] args) {
		int[][] arr = {{1,1,0,0},{1,0,0,0},{1,0,0,1},{1,1,1,1}};
		
		solution(arr);
	}
	public static int[] solution(int[][] arr) {
        int[] answer = {};
        //int cntOne = 0;
        //int cntZero = 0;
        int n = arr.length;
        
        while(n/2!=0) {
        	System.out.println("2");
        	
        	n=n/2;
        }
        return answer;
    }
}
