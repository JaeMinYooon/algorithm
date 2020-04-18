package Level2;

import java.util.Arrays;
import java.util.Vector;

public class ³ó±¸°æ±â {

	public static void main(String[] args) {
		String[] array = { "babic", "keksic", "boric","bukic","sarmic", "balic","kruzic","hrenov","beslic","boksic","krafnic","pecivic","klavirko","kukumaric","sunkic","kolacic","kovacic","pre"};
		
		
		System.out.println(solution(array));
	}
	
	public static String solution(String[] array) {
		String answer = "";
		Arrays.parallelSort(array);
		Vector<String> save = new Vector<String>();
		int count = 0;
		for(int i = 0 ; i < array.length-1 ; i++) {
			//System.out.println(array[i]);
			if(array[i].charAt(0) == array[i+1].charAt(0)) {
				count++;
				if(count == 5)
					save.add(array[i].substring(0,1));
			}
			else {
				count = 0;
			}
		}
		System.out.println(save.toString());
		
		return answer;
	}

}
