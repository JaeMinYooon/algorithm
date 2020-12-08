package Level2;

public class º∂ø¨∞·«œ±‚ {

	public static void main(String[] args) {
		int n = 4;
		int[][] costs = { { 0, 1, 1 }, { 0, 2, 2 }, { 1, 2, 5 }, { 1, 3, 1 }, { 2, 3, 8 } };

		System.out.println(solution(n, costs));
	}

	public static int solution(int n, int[][] costs) {
		int answer = 0;
		int[][] grape = new int[n][n];
		for (int i = 0; i < costs.length; i++) {
			int x = costs[i][0];
			int y = costs[i][1];
			int cost = costs[i][2];
			grape[x][y] = grape[y][x] = cost;
		}

		for (int i = 0; i < n; i++) { 
			for (int j = 0; j < n; j++) {
				System.out.print(grape[i][j]);
			}
			System.out.println("");
		}

		for (int i = 0; i < grape.length; i++) {
			for (int j = 0; j < grape.length; j++) {
				for (int k = 0; k < grape.length; k++) {
					if (grape[j][k] > grape[j][i] + grape[i][k])
						grape[j][k] = grape[j][i] + grape[i][k];
				}
			}
		}

		for (int i = 0; i < grape.length; i++) {
			for (int j = 0; j < grape.length; j++) {
				System.out.print(grape[i][j] + " ");
			}
			System.out.println();
		}

		return answer;
	}

}
