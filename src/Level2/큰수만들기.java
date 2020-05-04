package Level2;

public class 큰수만들기 {

	public static void main(String[] args) {
		String number = "1231234";
		int k = 3;

		System.out.println(solution(number, k));
	}

	public static String solution(String number, int k) {
		String answer = "";
		int index = 0;
		char max = '0';
		
		if (number.charAt(0) == '0')
			return "0";
		for(int i = 0 ; i < number.length()-k ; i++) {
			max = '0';
			for(int j = index ; j <= k+i; j++) {
				if(max < number.charAt(j)) {
					max = number.charAt(j);
					index = j+1;
				}
			}
			answer += max;
			
		}
		return answer;
	}
}
