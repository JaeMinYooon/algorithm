package Level2;

import java.util.Arrays;

public class ÃÖ´ñ°ª°úÃÖ¼Ú°ª {
	public static void main(String[] args) {
		String s ="-1 -2 -3 -4";
		solution(s);
	}
	
	public static String solution(String s) {
		String answer = "";
		String[] array = s.split(" ");
		int[] integerarray = new int [array.length];
		for(int i = 0 ; i < array.length ;i++) {
			integerarray[i] = Integer.parseInt(array[i]);
		}
		Arrays.sort(integerarray);
		answer = Integer.toString(integerarray[0]) + " " + Integer.toString(integerarray[integerarray.length-1]);
		System.out.println(answer);
		
		return answer;
	}
}
