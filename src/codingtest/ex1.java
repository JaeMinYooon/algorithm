package codingtest;

import java.util.ArrayList;
import java.util.List;

public class ex1 {

	public static void main(String[] args) {
		int[][] v = {{0,1},{-1,2},{0,2}};
		
		solution(v);
		
	}
	public static int[] solution(int[][] v) {
        int[] answer = new int[2];
        int[] temp = new int[2];
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0 ; i < v.length ; i++){
        	if(list.contains(v[i][0])) {
        		temp[0] = v[i][0];
        	}
        	if(list.contains(v[i][1])) {
        		temp[1] = v[i][1];
        	}
        	list.add(v[i][0]);
        	list.add(v[i][1]);
        	
        }
        for(int i = 0 ; i < v.length ; i++) {
        	if(v[i][0] != temp[0])
        		answer[0]=v[i][0];
        	if(v[i][1] != temp[1])
        		answer[1]=v[i][1];
        }
        System.out.println(answer[0] + " " + answer[1]);
        return answer;
    }
}
