
public class ���￡���輭��ã�� {

	public static void main(String[] args) {
		String[] seoul = {"jane", "Kim"};
		solution(seoul);
	}
	 public static String solution(String[] seoul) {
	      String answer = "";
	      for(int i = 0 ; i < seoul.length ; i++) {
	    	  if(seoul[i].equals("Kim")) {
	    		  answer = "�輭���� " + i +"�� �ִ�";
	    		  break;
	    	  }
	    		  
	      }
	      return answer;
	  }
}
