package Level1;
public class ���ڼ� {
	public static void main(String[] args) {
		solution(4);
		
	}

	static  public String solution(int n) {
	      String answer = "";
	      for(int i = 0 ; i < n ; i++) {
	    	  if(i%2==0)
	    		  answer += "��";
	    	  else
	    		  answer += "��";
	      }
	      return answer;
	}
}

/*
public class WaterMelon {
public String watermelon(int n){

    return new String(new char [n/2+1]).replace("\0", "����").substring(0,n);
}

// ������ ���� �׽�Ʈ�ڵ��Դϴ�.
public static void  main(String[] args){
    WaterMelon wm = new WaterMelon();
    System.out.println("n�� 3�� ���: " + wm.watermelon(3));
    System.out.println("n�� 4�� ���: " + wm.watermelon(4));
}
}
*/