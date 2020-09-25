package Level2;

public class 예상대진표 {

	public static void main(String[] args) {
		int n = 8;
		int a = 4;
		int b = 7;
		
		System.out.println(solution(n,a,b));

	}
	public static int solution(int n, int a, int b)
    {
        int answer = 0;
        a--;
        b--;
        while(true) {
        	a=a/2;
        	b=b/2;
        	if(a == b)
        	{
        		answer++;
        		break;
        	}
        	else
        		answer++;
        }

        return answer;
    }
	
}
