package Level1;
import java.util.Scanner;

public class k¹øÂ°¼ö {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int [] array = {1,5,2,6,3,7,4};
		int [] answer;
		int start, end, number;
		start = scanner.nextInt();
		end = scanner.nextInt();
		number = scanner.nextInt();
		answer = new int[end-start+1];
		for(int i = 0 ; i <= end - start ; i++) {
			answer[i] = array[start-1+i];
		}
		for(int i = 0 ; i < answer.length-1; i++) {
			for(int j = i+1 ; j <answer.length; j++ ) {
				if(answer[i]>answer[j]) {
					int temp;
					temp = answer[i];
					answer[i] = answer[j];
					answer[j] = temp;
				}	
			}
		}
		
		System.out.println(answer[number-1]);
		
		
		scanner.close();
	}
}

/*
import java.util.Arrays;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i=0; i<commands.length; i++){
            int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(temp);
            answer[i] = temp[commands[i][2]-1];
        }

        return answer;
    }
}
*/
