package codingtest;
/*
 * import java.util.TreeSet;
 * 
 * class Solution { private int[][] board; private TreeSet<Integer> answers =
 * new TreeSet<>();
 * 
 * public int solution(int[][] board) { this.board = board;
 * 
 * int n = board.length; int[] arr = new int[n]; int[] output = new int[n];
 * boolean[] visited = new boolean[n];
 * 
 * for(int i=0; i<n; i++) arr[i] = i;
 * 
 * perm(arr, output, visited, 0, n);
 * 
 * //for (int j : answers) System.out.print(j + " ");
 * //System.out.println(answers.last());
 * 
 * return answers.last(); }
 * 
 * public void perm(int[] arr, int[] output, boolean[] visited, int depth, int
 * n) { if (depth == n) { getMax(output); return; }
 * 
 * for (int i=0; i<n; i++) { if (!visited[i]) { visited[i] = true; output[depth]
 * = arr[i]; perm(arr, output, visited, depth + 1, n); visited[i] = false;; } }
 * }
 * 
 * public void getMax(int[] arr) { int max = 0;
 * 
 * for(int i=0; i<arr.length; i++) { max += board[i][arr[i]]; }
 * 
 * answers.add(max); } }
 */