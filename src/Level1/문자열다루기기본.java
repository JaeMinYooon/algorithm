package Level1;
public class 문자열다루기기본 {
	public static void main(String[] args) {
		String s = "1a234";
		boolean b = solution(s);
		if(b)
			System.out.println("gg");
		else
			System.out.println("false");
	}
	public static boolean solution(String s) {
	      boolean answer = true;
	      String array[] = {};
	      array = new String[s.length()];
	      array = s.split("");
	      for(int i = 0 ; i < s.length();i++) {
	    	  if(array[i].equals("0")|| array[i].equals("1") || array[i].equals("2")|| array[i].equals("3")|| array[i].equals("4")|| array[i].equals("5")|| array[i].equals("6")|| array[i].equals("7")|| array[i].equals("8")|| array[i].equals("9")) {
	    		  continue;
	    	  }
	    	  else {
	    		  answer = false;
	    		  return answer;
	    	  }
	    		  
	      }
	      
	      return answer;
	  }
}
