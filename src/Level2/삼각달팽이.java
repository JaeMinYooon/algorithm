package Level2;

public class �ﰢ������ {

	public static void main(String[] args) {
		int n = 6;
		solution(n);
	}
	public static int[] solution(int n) {
		int sum = 0;
		for(int i = 0; i <= n ; i++)
			sum+=i;
        int[] answer = new int[sum];
        int[][] array = new int[n][n];

        int x = -1, y = 0;
        int num = 1;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) { 	
                if (i % 3 == 0) {
                    x++;
                } else if (i % 3 == 1) {
                    y++;
                } else if (i % 3 == 2) {
                    x--;
                    y--;
                }
                array[x][y] = num++;
            }
        }
        
        int k = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(array[i][j] == 0) 
                	break;
                answer[k++] = array[i][j];
            }
        }
        
        for(int i = 0 ; i < sum ; i++) {
        	System.out.print(answer[i] + " ");
        }
        return answer;
    }
}
