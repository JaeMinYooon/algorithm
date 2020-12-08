package Level2;

import java.util.Arrays;

public class ¶¥µû¸Ô±â {
	static int[][] arr;
	static int count = 0;
	
	public static void main(String[] args) {
		int[][] land = { { 1, 2, 3, 5 }, { 5, 6, 7, 8 }, { 4, 3, 2, 1 } };
		// int[][] land = {{9,5,2,3},{9,8,6,7},{8,9,7,1},{100,9,8,1}};
		System.out.println(solution(land));
	}

	public static int solution(int[][] land) {
		for (int i = 1; i < land.length; i++) {
			for (int j = 0; j < land[0].length; j++) {
				int sum = 0;
				for (int k = 0; k < land[0].length; k++) {
					if (k == j)
						continue;
					else
						sum = Math.max(sum, land[i - 1][k]);
				}
				land[i][j] += sum;
			}
		}

		Arrays.sort(land[land.length - 1]);
		return land[land.length - 1][land[0].length - 1];
	}
}
