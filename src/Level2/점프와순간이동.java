package Level2;

public class 점프와순간이동 {

	public static void main(String[] args) {
		int n = 5000;
		
		System.out.println(solution(n));
	}

	 public static int solution(int n) {
	        int ans = 0;

	        String  bin = Integer.toBinaryString(n);
	        for(int i = 0 ; i < bin.length() ; i++) {
	        	if(bin.charAt(i) =='1')
	        		ans++;
	        }
	        
	        
	        return ans;
	 }
}
