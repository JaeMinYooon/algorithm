package Level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class 완전탐색ex_차이를최대로 {
    // 정답 담기는 변수
    public static int answer = Integer.MIN_VALUE;
	
    public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] inputAry = new int[n];
		
        for(int i = 0; i < n; i++) {
            inputAry[i] = scanner.nextInt();
        }
		
        Arrays.sort(inputAry);
		
        boolean[] check = new boolean[n];
        ArrayList<Integer> picked = new ArrayList<Integer>();
        
        pick(n, picked, check, inputAry);
		
        System.out.println(answer);
    }
	
    public static void pick(int n, ArrayList<Integer> picked, boolean[] check, int[] inputAry) {
        if(picked.size() == n) {
            int sum = calSum(picked);
            if(sum > answer) {
                answer = sum;
            }
            return;
        }
        for(int i = 0; i < n; i++) {
            if(check[i])
                continue;
            check[i] = true;
            picked.add(inputAry[i]);
            pick(n, picked, check, inputAry);
            picked.remove(picked.size()-1);
            check[i] = false;
        }
    }
    public static int calSum(ArrayList<Integer> picked) {
        int sum = 0;
        for(int i = 1; i < picked.size(); i++) {
            sum += Math.abs(picked.get(i-1) - picked.get(i));
        }
        return sum;
    }
}
