package Level2;

public class 가장큰정사각형찾기 {

	public static void main(String[] args) {
		int[][] board = {{0,0,1,1},{1,1,1,1}};
		
		System.out.println(solution(board));

	}
	
	public static int solution(int [][]board)
    {
        int answer = 0;
        int up = 0, left = 0, upLeft = 0;
        for(int y = 1 ; y < board.length ; y++) {
        	for(int x = 1 ; x < board[y].length ; x++) {
        		if(board[y][x] == 1) {
        			up = board[y-1][x];
        			left = board[y][x-1];
        			upLeft = board[y-1][x-1];
        			
        			int min = Math.min(up, left);
        			min = Math.min(min, upLeft);
        			board[y][x] = min+1;
        		}
        	}
        }

        for(int y = 1 ; y < board.length ; y++) {
        	for(int x = 1 ; x < board[y].length ; x++) {
        		if(board[y][x] > 0)
        			answer = Math.max(answer, board[y][x]);
        	}
        }
        
        return answer*answer;
    }

}
