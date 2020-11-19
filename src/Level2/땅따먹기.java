package Level2;

import java.util.ArrayList;
import java.util.LinkedList;

public class �����Ա� {

	public static void main(String[] args) {
		int[][] land = {{1,2,3,5},{5,6,7,8},{4,3,2,1}};
		
		System.out.println(solution(land));		
	}
	public static int solution(int[][] land) {
        int answer = 0;
        
        LinkedList<Integer> rePerArr = new LinkedList<Integer>();   
        rePermutation(land[0].length, land.length, rePerArr);

        return answer;
    }
	
	//�ߺ����� (�����ְ� �迭 + �ڽ��ڽŵ� ����)
    private static void rePermutation(int n, int r, LinkedList<Integer> rePerArr) {
        if(rePerArr.size() == r){
            for(int i = 0 ; i < rePerArr.size(); i++){
				if(i != 0 && rePerArr.get(i) == rePerArr.get(i-1))
					continue;
				System.out.print((rePerArr.get(i)+1)+" ");
				
            }
            System.out.println();
            return;
        }
        for(int i=0; i<n; i++){  
            rePerArr.add(i);
            rePermutation(n, r, rePerArr);
            rePerArr.removeLast();
        }
  
    }
 
}
