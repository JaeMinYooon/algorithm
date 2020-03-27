package Level1;
public class 수박수 {
	public static void main(String[] args) {
		solution(4);
		
	}

	static  public String solution(int n) {
	      String answer = "";
	      for(int i = 0 ; i < n ; i++) {
	    	  if(i%2==0)
	    		  answer += "수";
	    	  else
	    		  answer += "박";
	      }
	      return answer;
	}
}

/*
public class WaterMelon {
public String watermelon(int n){

    return new String(new char [n/2+1]).replace("\0", "수박").substring(0,n);
}

// 실행을 위한 테스트코드입니다.
public static void  main(String[] args){
    WaterMelon wm = new WaterMelon();
    System.out.println("n이 3인 경우: " + wm.watermelon(3));
    System.out.println("n이 4인 경우: " + wm.watermelon(4));
}
}
*/