package Level3;

public class �������ϱ� {

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

		int count = 0;

		// 2 00�� 1�ΰͺ��� ����.
		for (int i = 0; i < grape.length; i++) {
			for (int j = 0; j < grape[i].length; j++) {
				// �׷����� ���Ұ��� '1'�� �����͸� �������� ��´�.
				if (grape[i][j] == '1') {
					count++;
					dfs(grape, i, j);
				}
			}

		}
		System.out.println("=========");
		System.out.println("count :" + count);
		return count;

		//return answer;
	}

	public static void dfs(int[][] grape, int i, int j) {
		int m = grape.length;
		int n = grape[0].length;
		if (i < 0 || i >= m || j < 0 || j >= n || grape[i][j] != 1)
			return;
		grape[i][j] = 'X';
		// �������� �������� �������� ������� dfsŽ���� �����Ѵ�.
		dfs(grape, i - 1, j);
		dfs(grape, i + 1, j);
		dfs(grape, i, j - 1);
		dfs(grape, i, j + 1);

	}

	// �׷����� �迭 �����͸� print�Ѵ�.
	public static void print(char[][] grape) {
		for (int i = 0; i < grape.length; i++) {
			for (int j = 0; j < grape[i].length; j++) {
				System.out.print(grape[i][j]);

			}
			System.out.println(" ");

		}

	}
}
