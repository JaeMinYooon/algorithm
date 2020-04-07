package Level2;

public class 멀쩡한사각형 {

	public static void main(String[] args) {
		int w = 8, h = 12;
		System.out.println(solution(w,h));
	}
	public static long solution(int w,int h) {
		long answer = 1;
		answer = (long)w*h-(w+h-gcd(w,h));
		return answer;
	}
	public static long gcd(int w, int h) {
		int tmp;
		while (w != 0) {
			tmp = w;
			w = h % w;
			h = tmp;
		}
		
		return h;
	}
}
