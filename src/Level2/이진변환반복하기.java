package Level2;


public class 이진변환반복하기 {

	public static void main(String[] args) {
		String s = "10100000";
		s = s.replace("0", "");
		System.out.println(s);
		solution(s);
	}
	public static int[] solution(String s) {
        int[] answer = new int [2];
        int count = 0;
   
        int zerocount = 0;
        String tmp = "";
        while(true) {
        	tmp = s+1;
        	
        	zerocount +=tmp.split("0").length-1;
        	s = s.replaceAll("0","");
        	s = Integer.toBinaryString(s.length());
        	count ++;
        	System.out.println(s + " | " + count + " | " + zerocount);
        	if(s.equals("1"))
        		break;
        }
        answer[0] = count;
        answer[1] = zerocount;
        return answer;
    }
}
