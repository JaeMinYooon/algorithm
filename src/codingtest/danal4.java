package codingtest;
import java.util.Arrays;
import java.util.Vector;

public class danal4 {

	public static void main(String[] args) {
		//int[][] customer = {{1, 1}, {2, 1}, {3, 1}, {2, 0}, {2, 1}};
        //int[][] customer2 = {{2, 1}, {1, 1}, {3, 1}, {1, 0}, {1, 1}, {2, 0}, {2, 1}};
        //solution(customer, 2);
        solution();
	}


	public static void solution() {
		Vector<Integer> v = new Vector<Integer>();
		v.add(1);
		v.add(3);
		v.add(2);
		System.out.println(v);
		int[] arr = new int [v.size()];
		for(int i = 0 ; i < v.size(); i++) {
			arr[i] = v.get(i);
		}
		
		Arrays.parallelSort(arr);
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.println(arr[i]);
		}
	}
}
