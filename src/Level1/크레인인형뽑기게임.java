package Level1;

import java.util.Vector;

public class 크레인인형뽑기게임 {

	public static void main(String[] args) {
		int[][] board = { { 0, 0, 0, 0, 0 }, { 0, 0, 1, 0, 3 }, { 0, 2, 5, 0, 1 }, { 4, 2, 4, 4, 2 },
				{ 3, 5, 1, 3, 1 } };
		int[] moves = { 1, 5, 3, 5, 1, 2, 1, 4 };

		System.out.println(solution(board, moves));
	}

	public static int solution(int[][] board, int[] moves) {
		int answer = 0;
		Vector<Integer> save = new Vector<Integer>();

		for (int i = 0; i < moves.length; i++) {
			for (int j = 0; j < board.length; j++) {
				if (board[j][moves[i] - 1] != 0) {
					save.add(board[j][moves[i] - 1]);
					board[j][moves[i] - 1] = 0;
					for (int n = 1; n < save.size(); n++) {
						if (save.get(n) == save.get(n - 1)) {
							save.remove(save.get(n));
							save.remove(save.get(n-1));
							answer += 2;
						}
					}
					System.out.println(save.toString());
					break;
				}
			}
		}

		return answer;
	}
}

/*
 * for(int i = 0 ; i < save.size()-1; i++) { if(save.get(i) == save.get(i+1)) {
 * System.out.println(save.get(i) + " " + save.get(i+1));
 * save.remove(save.get(i+1)); save.remove(save.get(i)); i=i-2; answer+=2;
 * System.out.println(save.toString()); } }
 */


