package Level1;

public class 키패드누르기 {

	public static void main(String[] args) {
		int[] numbers = { 1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5 };
		String hand = "right";

		System.out.println(solution(numbers, hand));
	}

	public static String solution(int[] numbers, String hand) {
		String answer = "";
		int r = 0;
		int l = 0;
		
		for(int i = 0 ; i < numbers.length ; i++) {
			System.out.println("L = " + l + " R = " + r + " | " + answer);
			if(numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
				answer += "L";
				l = numbers[i];
			}
			else if (numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
				answer += "R";
				r = numbers[i];
			}
			else {
				// 이부분 다시생각 좌표로 가야할듯 ..
				
				if(r==l)
					answer += hand.charAt(0);
				else {
					if(Math.abs(numbers[i] - l + 1) > Math.abs(numbers[i] - r - 1)) {
						answer += "L";
						l = numbers[i];
					}
					else if(Math.abs(numbers[i] - l + 1) < Math.abs(numbers[i] - r - 1)) {
						answer += "R";
						r = numbers[i];
					}
					else {
						answer += hand.charAt(0);
						if(hand.charAt(0) == 'r')
							r = numbers[i];
						else
							l = numbers[i];
					}
				}
			}
		}
		
		return answer.toUpperCase();
	}
}
