
public class 모의고사 {

	public static void main(String[] args) {
		int[] answers = {1,2,3,4,5};
		solution(answers);
	}
	
	 public static int[] solution(int[] answers) {
	        int[] answer = {};
	        int[] math1 = {1,2,3,4,5};
	        int[] math2 = {2,1,2,3,2,4,2,5};
	        int[] math3 = {3,3,1,1,2,2,4,4,5,5};
	        int score1= 0, score2=0, score3=0;
	        for(int i = 0 ; i < answers.length; i++) {
	        	if(answers[i] == math1[i%5])
	        		score1++;
	        	if(answers[i] == math2[i%8])
	        		score2++;
	        	if(answers[i] == math3[i%10])
	        		score3++;
	        }
	        if(score1 > score2) {
	        	if(score1 > score3)
	        	{
	        		answer = new int [1];
	        		answer[0] = 1;
	        	}
	        	else if(score1 < score3)
	        	{
	        		answer = new int [1];
	        		answer[0] = 3;
	        	}
	        	else
	        	{
	        		answer = new int [2];
	        		answer[0] = 1;
	        		answer[1] = 3;
	        	}
	        }
	        else if (score1 < score2) {
	        	if(score2 > score3)
	        	{
	        		answer = new int [1];
	        		answer[0] = 2;
	        	}
	        	else if(score2 < score3)
	        	{
	        		answer = new int [1];
	        		answer[0] = 3;
	        	}
	        	else
	        	{
	        		answer = new int [2];
	        		answer[0] = 2;
	        		answer[1] = 3;
	        	}
	        }
	        else {
	        	if(score1 > score3)
	        	{
	        		answer = new int [2];
	        		answer[0] = 1;
	        		answer[1] = 2;
	        	}
	        	else if(score1 < score3)
	        	{
	        		answer = new int [1];
	        		answer[0] = 3;
	        	}
	        	else
	        	{
	        		answer = new int [3];
	        		answer[0] = 1;
	        		answer[1] = 2;
	        		answer[2] = 3;
	        	}
	        }
	        return answer;
	    }
}
