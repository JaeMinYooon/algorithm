
public class 문자열내림차순으로배치하기 {
	public static void main(String[] args) {
		String s = "Zbcdefg";
		System.out.println( solution(s));
		
	}
	public static String solution(String s) {
	      String answer = "";
	      String []array = {};
	      array = new String[s.length()];
	      array = s.split("");
	      
	      for (int i = 0 ; i < array.length-1; i++) {
	    	  for (int j = i+1 ; j < array.length; j++) {
	    		  if(array[i].charAt(0) < array[j].charAt(0)) {
	    			  String temp = array[i];
	    			  array[i] = array[j];
	    			  array[j] = temp;
	    		  }
	    			  
	    			  
	    	  }
	      }
	      for(int i = 0 ; i < array.length; i++) {
	    	  answer += array[i];
	      }
	      
	      return answer;
	  }
	
}
