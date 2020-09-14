package Level2;

public class 다음큰숫자 {

	public static void main(String[] args) {
		int n = 78;
		
		System.out.println(solution(n));
	}
	
	public static int solution(int n) {
		int onecnt = count_one(n);
        
        while(count_one(++n) != onecnt) {
        	n++;
        }
        
        return n;
    }
	public static int count_one(int n) {
		int onecnt = 0;
		
		String binaryString = Integer.toBinaryString(n);
        for(int i = 0 ; i < binaryString.length() ; i++) {
        	if(binaryString.charAt(i)=='1')
        		onecnt++;
        }
        return onecnt;
	}
}
