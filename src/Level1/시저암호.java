package Level1;
public class 시저암호 {

	public static void main(String[] args) {
		String s = "A Z";
		int n = 1;
		solution(s,n);
	}
	 public static String solution(String s, int n) {
	      String answer = "";
	      String[] array = s.split("");
	      for(int i = 0 ; i < s.length() ; i++) {
	    	  if(array[i].equals(" ")) {
	    		  answer = answer + " ";
	    		  continue;
	    	  }
	    	  char ascii = array[i].charAt(0);
	    	  int iascii = (int) ascii;
	    	  char cascii;
	    	  if(iascii <= 90) {
	    		  if(iascii+n>90) {
	    			  cascii = (char)((iascii+n)%91+65);
	    			  }
	    		  else {
	    			  cascii = (char)(iascii+n);
	    		  }
	    	  }
	    	  else {
	    		  if(iascii+n>122)
	    		  {
	    			  cascii = ((char)((iascii+n)%123+97));
	    		  }
	    		  else
	    		  {
	    			  cascii = (char)(iascii+n);
	    		  }
	    	  }
	    	  
	    	  answer=  answer + cascii;
	      }
	      
	      System.out.println(answer);
	      return answer;
	  }

}
