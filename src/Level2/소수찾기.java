package Level2;

import java.util.Arrays;
import java.util.Vector;

public class 소수찾기 {

	public static void main(String[] args) {
		String numbers = "17";
		
		System.out.println(solution(numbers));
	}
	public static int solution(String numbers) {
        int answer = 0;
        int count = 0;
        Vector <Boolean> check = new Vector <Boolean>();
        Vector <String> save = new Vector <String>();
        Vector <String> temp = new Vector <String>();
        String[] num = numbers.split("");
        Arrays.sort(num);
        String sortnumber = "";
        for(int i = 0 ; i < num.length ; i++) {
        	sortnumber =  num[i] + sortnumber;
        	save.add(num[i]);
        	temp.add(num[i]);
        }
        //System.out.println(sortnumber);
        int n = Integer.parseInt(sortnumber);
        int r =0;
        //boolean flag = false;
        for(int i = 2 ; i <= n ; i++) {
	    	  count=0;
	    	  for(int j = 1 ; j <= i/2 ; j++) {
	    		  if(i%j==0) {
	    			  count++;
	    			  if(count == 2)
	    				  break;
	    		  }
	    	  }
	    	  if(count==1) {  // 찾은경우! i값이 소수
	    		  String k = Integer.toString(i);
	    		  String[] array = k.split("");
	    		  //Arrays.parallelSort(array);
	    		  System.out.print(k + " | " + array.length);
	    		  //System.out.println(i);
	    		  check.clear();
	    		  save.clear();
	    		  save.addAll(temp);
	    		  for(int f = 0 ; f < array.length ; f++) {
	    			  //flag = false;
	    			  if(!save.contains(array[f])) {
	    				  check.add(false);
	    				  break;
	    			  }
	    			  for(r = 0 ; r < save.size() ; r++) {
	    				  if(array[f].contentEquals(save.get(r))) {
	    					  check.add(true);
	    					  save.remove(r);
	    					  //flag= true;
	    					  break;
	    				  }
	    			  }
	    			  
	    			  /*if(!flag) {
	    				  check.add(false);
	    				  break;
	    			  }*/
	    			  
	    		  }
	    		  System.out.println(" | " + check.toString());
	    		  if(!check.contains(false)) {
	    			  answer++;
	    		  }
	    		  
	    	  }
	      }
        
        return answer;
    }
}

/* 링크드 리스트로 푼 것 
 * 더 연습이 필요할 듯.. 
 * import java.util.LinkedList;

class Solution {
    static int numberArray[];
    static int ans[] = new int[9999999];
    static int answer = 0;
    public int solution(String numbers) {
       numberArray = new int[numbers.length()];
        for(int i=0; i<numberArray.length; i++){
            numberArray[i] = Integer.parseInt(numbers.charAt(i)+"");
        }

        int n = numberArray.length;
        for(int i=1; i<=numberArray.length; i++){
            LinkedList<Integer> perArr = new LinkedList<Integer>(); 
            int[] perCheck = new int[n];
            permutation(n, i, perArr, perCheck);
        }

        return answer;
    }

    //순열 (순서있게 배열)
	private static void permutation(int n, int r, LinkedList<Integer> perArr, int[] perCheck) {
			if(perArr.size() == r){
				String tmpNum ="";
				for(int i : perArr){
					//System.out.print(numberArray[i]+" ");
					tmpNum += numberArray[i]+"";
				}
				
				if(ans[Integer.parseInt(tmpNum)] == 0){
					//소수 판별 로직 수행
					// 0 미수행, 1소수아님, 2소수임
					if(checkPrime(Integer.parseInt(tmpNum)) == 2){
						answer++;
					}
				}
				//수행
				ans[Integer.parseInt(tmpNum)] = 1;
				
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
	
	//소수인지 아닌지 체크하는 함수
	private static int checkPrime(int num) {
		//1,0은 소수가 아님
		if(num == 1 || num == 0)return 1;
		for(int i=2; i<num; i++){
			if(num%i == 0){
				//소수가 아님
				return 1;
			}
		}
		//소수임
		return 2;
	}
}*/
