package Level2;

import java.util.Vector;

public class ž {

	public static void main(String[] args) {
		int[] heights = {6,9,5,7,4};
		solution(heights);
	}
	public static int[] solution(int[] heights) {
		int[] answer= {};
		Vector<Integer> top = new Vector<Integer>();
		Vector<Integer> sign = new Vector<Integer>();
		Vector<Integer> answers = new Vector<Integer>();
		
		for(int i = 0 ; i < heights.length ; i++) {
			top.add(heights[i]);
			sign.add(heights[i]);
			answers.add(i,0);
		}
		int index= 0;
		int sum = top.size();
		for(int i = 0 ; i < sum; i++) {
			//System.out.println("i = " + i);
			for(int j = 1 ; j < sign.size(); j++) {
				System.out.println(top.get(top.size()-1) + " | " + sign.get(sign.size()-j-1));
				if(top.get(top.size()-1) < sign.get(sign.size()-j-1)) {
					index = sign.size()-j;
					answers.set(top.size()-1, index);
					System.out.println("answers : " +answers.toString());
					break;
				}
			}
			top.remove(top.size()-1);
			sign.remove(sign.size()-1);
			System.out.println("top : " + top.toString());
			System.out.println("sign : " + sign.toString());
		}
		System.out.println(answers.toString());
		answer = new int[answers.size()];
		for(int i = 0 ; i < answers.size(); i++)
			answer[i] = answers.get(i);
		return answer;
	}

}

/*
 * public int[] solution(int[] heights) {
        int[] answer = new int[heights.length];

        for (int i=0; i<heights.length; i++){
            for (int j=i+1; j<heights.length; j++){
                if (heights[i] > heights[j]){
                    answer[j]=i+1;
                }
            }
        }


        return answer;
    }
*/
