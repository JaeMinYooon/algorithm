package codingtest;

public class re4 {

	public static void main(String[] args) {
		int n = 4;
		
		System.out.println(solution(n));
	}

	public static int solution(int n) {
		int d[] = new int[n+1];
		for(int i = 2 ; i < n+1 ; i++) {
			if(i == 2)
				d[i] = 1;
			else if(i == 3)
				d[i] = 2;
			else
				d[i] = (d[i-1]*d[i-1] -1 )%10007;
		}
		return d[n];
	}
	
}
