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
