package Level1;
public class 문자열내마음대로정렬하기 {

	public static void main(String[] args) {
		String[] strings= {"abce", "abcd", "cdx"};
		int n = 2 ; 
		solution(strings, n);
	}
	public static String[] solution(String[] strings, int n) {
	      String[] answer = {};
	      for(int i = 0 ; i < strings.length-1 ; i++) {
	    	 for(int j = i+1 ; j < strings.length ; j++) {
	    		 if(strings[i].substring(n).charAt(0)> strings[j].substring(n).charAt(0))
	    		 {
	    			 String temp = strings[i];
	    			 strings[i] = strings[j];
	    			 strings[j] = temp;
	    		 }
	    		 else if(strings[i].substring(n).charAt(0) == strings[j].substring(n).charAt(0))
	    		 {
	    			 if(strings[i].compareTo(strings[j])>0 )
		    		 {
		    			 String temp = strings[i];
		    			 strings[i] = strings[j];
		    			 strings[j] = temp;
		    		 }
	    		 }
	    	 }
	    	  
	      }
	      answer = new String[strings.length];
	      for(int i = 0 ; i < strings.length ; i++) {
	    	  answer[i] = strings[i];
	    	  System.out.println(answer[i]);
	      }
	      return answer;
	  }
}
