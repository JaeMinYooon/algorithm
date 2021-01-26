package Level3;

import java.util.LinkedList;

public class N_Queen {

	public static void main(String[] args) {
		int n = 4;
		
		System.out.println(solution(n));
	}
	static int answer = 0;
	public static int solution(int n) {
        //순열 (순서있게 배열)
        LinkedList<Integer> perArr = new LinkedList<Integer>(); 
        int[] perCheck = new int[n];
        permutation(n, n, perArr, perCheck);
        return answer;
    }
	
	//순열 (순서있게 배열)
    private static void permutation(int n, int r, LinkedList<Integer> perArr, int[] perCheck) {
        if(perArr.size() == r){
        	int cnt = 0;
            for( int i = 0 ; i < perArr.size() ; i++) {
            	if(i!= 0) {
            		if(Math.abs(perArr.get(i-1)-perArr.get(i))<2)
            			break;
            	}
            	cnt++;
            	System.out.print(perArr.get(i)+ " ");
            }
            System.out.println();
            if(cnt == n)
            	answer++;
            return;
        }
         
        for(int i=0; i<n; i++){
            if(perCheck[i] == 0){
                perArr.add(i);
                perCheck[i] = 1;
                permutation(n, r, perArr, perCheck);
                perCheck[i] = 0;
                perArr.removeLast();
            }
        }
         
    }
}
