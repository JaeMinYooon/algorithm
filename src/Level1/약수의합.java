package Level1;
public class ������� {

	public static void main(String[] args) {
		int n = 12;
		solution(n);
		
	}
	public static int solution(int n) {
		int answer = 0;
		for ( int i = 1 ; i <= n ; i++)
		{
			if(n%i == 0)
				answer += i;
		}
		
		return answer;
	}

}
