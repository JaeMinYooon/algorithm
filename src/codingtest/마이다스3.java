package codingtest;

import java.util.*;
class Solution {
    Vector<int[]> answers = new Vector<>();

    public int [] solution(int[] cookies, int k) {
       // int[] answer = new int[1];
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
        Vector<int[]> newAns = new Vector<>();

        for(int i=0; i<answers.size(); i++) {
            int len = answers.get(i).length;
            if(maxLength < len) {
                maxLength = len;
            }
        }

        int cnt = 0;
        for(int i=0; i<answers.size(); i++) {
            if(maxLength == answers.get(i).length) {
                newAns.add(answers.get(i));
                cnt++;
            }
        }

        int[][] newAnswers = new int[cnt][newAns.get(0).length];
        for(int i=0; i<newAns.size(); i++) {
            for(int j=0; j<newAns.get(i).length; j++) {
                newAnswers[i][j] = newAns.get(i)[j];
            }
        }

        if(newAnswers.length == 1) return newAnswers[0];

        int max = 0;

        Arrays.sort(newAnswers, new Comparator<int[]>() {
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

        for(int i=0; i<newAnswers.length; i++) {
            for(int j=0; j<newAnswers[i].length; j++) {
                System.out.print(newAnswers[i][j] + " ");
            }
            System.out.println();
        }

        return newAnswers[k-1];
    }

    public void perm(int[] arr, int[] output, boolean[] visited, int depth, int n, int r, int index) {
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

    public void setAnswers(int[] arr, int r) {
        int[] array = new int[r];

        for (int i = 0; i < r; i++)
            array[i] = arr[i];

        answers.add(array);
    }

}