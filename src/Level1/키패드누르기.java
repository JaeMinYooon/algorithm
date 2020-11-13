package Level1;

public class 키패드누르기 {

	public static void main(String[] args) {
		int[] numbers = { 7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2 };
		String hand = "left";

		System.out.println(solution(numbers, hand));
	}

	public static String solution(int[] numbers, String hand) {
		String answer = "";
		int r = 10;
		int l = 12;
		int rx = 0, ry=0;
		int lx = 0, ly=0;
		int nx=0, ny=0;
		int[][] array = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
		
		for(int i = 0 ; i < numbers.length ; i++) {
			if(numbers[i]==0) {
				numbers[i] = 11;
			}
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
				if(r==l)
					answer += hand.charAt(0);
				else {
					for(int x = 0 ; x < array.length ; x++) {
						for(int y = 0 ; y < array[x].length ; y++) {
							if(l == array[x][y]) {
								lx = x;
								ly = y;
							}
							if(r == array[x][y]) {
								rx = x;
								ry = y;
							}
							if(numbers[i] == array[x][y]) {
								nx = x;
								ny = y;
							}
						}
					}
					
					if(Math.abs(nx-lx)+Math.abs(ny-ly) < Math.abs(nx-rx)+ Math.abs(ny-ry)) {
						answer += "L";
						l = numbers[i];
					}
					else if(Math.abs(nx-lx) + Math.abs(ny-ly) > Math.abs(nx-rx) + Math.abs(ny-ry)) {
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
