package 마이다스;

import java.util.Comparator;
import java.util.Vector;
public class test {

	public static void main(String[] args) {
		int[] cookies = {1,4,2,6,5,3};
		int k = 2;
		solution(cookies , k);
		
	}
    static Vector<int[]> answers = new Vector<>();

    public static int [] solution(int[] cookies, int k) {
        int n = cookies.length;
        int[] output = new int[n];
        boolean[] visited = new boolean[n];
        int index = 0;

        if(cookies.length < 2) {
            return cookies;
        }

        for(int i=0; i<cookies.length; i++) {
            index = 0;
            perm(cookies, output, visited, 0, n, i, index);
        }

        int maxLength = 0;
        Vector<int[]> newAnswers = new Vector<>();

        for (int[] value : answers) {
            int len = value.length;
            if (maxLength < len) {
                maxLength = len;
            }
        }

        for (int[] ints : answers) {
            if (maxLength == ints.length) {
                newAnswers.add(ints);
            }
        }

        if(newAnswers.size() == 1) return newAnswers.get(0);

        int max = 0;
        newAnswers.sort(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                int tmp = 0;
                while (true) {
                    if (o1[tmp] > o2[tmp]) {
                        return 1;
                    } else if (o1[tmp] == o2[tmp]) {
                        tmp++;
                        if (tmp == max) return 1;
                    } else {
                        return -1;
                    }
                }
            }

        });
        
        return newAnswers.get(k-1);
    }

    public static void perm(int[] arr, int[] output, boolean[] visited, int depth, int n, int r, int index) {
        if (depth == r) {
            setAnswers(output, r);
            return;
        }

        for (int i=index; i<n; i++) {
            if (!visited[i]) {
                if((depth == 0) || ((depth > 0) && (output[depth-1] < arr[i]))) {
                    visited[i] = true;
                    output[depth] = arr[i];
                    perm(arr, output, visited, depth + 1, n, r, i);
                    visited[i] = false;
                }
            }
        }
    }

    public static void setAnswers(int[] arr, int r) {
        int[] array = new int[r];

        for (int i = 0; i < r; i++)
            array[i] = arr[i];

        answers.add(array);
    }
}