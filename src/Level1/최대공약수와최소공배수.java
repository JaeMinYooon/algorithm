package Level1;
public class 최대공약수와최소공배수 {

	public static void main(String[] args) {
		int n = 3, m = 12;
		solution(n,m);
		
	}
	public static int[] solution(int n, int m) {
	    int[] answer = new int[2];
	      //두수의 크기 정렬
	      int big,small;
	      if(n>m){
	          big = n; small = m;
	      }else{
	          big = m; small = n;
	      }
	      answer[0] = gcd(big,small);
	      answer[1] = big*small/answer[0];
	      
	      return answer;
	  }
	  public static int gcd(int a,int b){
	      if(a % b == 0)
	          return b;
	      return gcd(b,a%b);
	  }
}
