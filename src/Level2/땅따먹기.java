package Level2;

import java.util.LinkedList;
import java.util.Vector;

public class 땅따먹기 {
	static int[][] arr;
	static int count = 0;

	public static void main(String[] args) {
		//int[][] land = { { 1, 2, 3, 5 }, { 5, 6, 7, 8 }, { 4, 3, 2, 1 } };
		int[][] land = {{9,5,2,3},{9,8,6,7},{8,9,7,1},{100,9,8,1}};
		System.out.println(solution(land));
	}

	public static int solution(int[][] land) {
		int answer = 0;
		int length = 1;
		for (int i = 0; i < land.length; i++) {
			if (i == 0)
				length *= land[i].length;
			else
				length *= (land[i].length - 1);
		}
		arr = new int[length][land[0].length];
		LinkedList<Integer> rePerArr = new LinkedList<Integer>();
		rePermutation(land[0].length, land.length, rePerArr);
		int sum = 0;
		int row = 0;
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < land[0].length - 1; j++) {
				

				System.out.print(land[row][arr[i][j]]);
				sum += land[row][arr[i][j]];
				row++;
				if (row == land.length) {
					System.out.println();
					if (answer < sum) {
						answer = sum;
					}
					sum = 0;
					row = 0;
				}
			}
		}
		return answer;
	}

	// 중복순열 (순서있게 배열 + 자시자신도 포함)
	private static void rePermutation(int n, int r, LinkedList<Integer> rePerArr) {
		if (rePerArr.size() == r) {
			Vector<Integer> v = new Vector<Integer>();

			for (int i = 0; i < rePerArr.size(); i++) {
				if (i != 0 && rePerArr.get(i) == rePerArr.get(i - 1))
					continue;
				// System.out.print((rePerArr.get(i)+1)+" ");

				v.add(rePerArr.get(i));

			}

			if (v.size() == r) {
				for (int i = 0; i < v.size(); i++) {
					// System.out.print((rePerArr.get(i)+1)+" ");
					arr[count][i] = v.get(i);
				}
				count++;
			}
			// System.out.println();
			return;
		}
		for (int i = 0; i < n; i++) {
			rePerArr.add(i);
			rePermutation(n, r, rePerArr);
			rePerArr.removeLast();
		}

	}

}
