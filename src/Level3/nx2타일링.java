package Level3;

public class nx2타일링 {

	public static void main(String[] args) {
		int n = 5;
		
		System.out.println(solution(n));
	}
	public static int solution(int n) {
        int answer = 0;
        if(n==1)
        	return 1;
        else if(n==2)
        	return 2;
        int pre = 1;
        int cur = 2;
        int tmp = 0;
        for(int i = 3 ; i <= n ; i++) {
        	tmp = pre;
        	pre = cur;
        	cur = tmp+cur;
        }
        answer = cur;
        return answer;
    }
}
