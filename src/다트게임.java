
public class ��Ʈ���� {

	public static void main(String[] args) {
		String dartResult = "1S2D*3T";
		
		solution(dartResult);

	}
	public static int solution(String dartResult) {
	      int answer = 0;
	      String[] sa = dartResult.split(""); //splitArray
	      int num = 0;
	      //�迭 3�� ���� �ؾ��ҵ�...???  �׷��� *�� �ذ� ����
	      for(int i = 0 ; i < sa.length ; i++) {
	    	  switch(sa[i]) {
	    	  case "S":
	    		  break;
	    	  case "D":
	    		  //���� ����
	    		  break;
	    	  case "T":
	    		  //���� ������
	    		  break;
	    	  case "*":
	    		  //�ռ��� *2 ���ݼ��� *2
	    		  break;
	    	  case "#":
	    		  //���� * -1
	    		  break;
	    	  default:
	    		  // ���� ����
	    		  num = Integer.parseInt(sa[i]);
	    		  break;
	    			  
	    	  }
	      }
	      
	      return answer;
	  }
}
