package Level1;
public class 다트게임 {

	public static void main(String[] args) {
		String dartResult = "1D2S#10S";

		solution(dartResult);

	}

	public static int solution(String dartResult) {
		int answer = 0;
		String[] sa = dartResult.split(""); // splitArray
		int num = 0;
		String longnum = "";
		int[] array = new int[4];
		int cnt = 0;
		for (int i = 0; i < sa.length; i++) {
			switch (sa[i]) {
			case "S":
				break;
			case "D":
				// 숫자 제곱
				array[cnt] = array[cnt] * array[cnt];
				break;
			case "T":
				array[cnt] = array[cnt] * array[cnt] * array[cnt];
				// 숫자 세제곱
				break;
			case "*":
				if (cnt == 1) {
					array[cnt] = array[cnt] * 2;
				} else {
					array[cnt - 1] = array[cnt - 1] * 2;
					array[cnt] = array[cnt] * 2;
				}
				// 앞숫자 *2 지금숫자 *2
				break;
			case "#":
				array[cnt] = array[cnt] * -1;
				// 숫자 * -1
				break;
			default:
				// 숫자 들어옴
				if (sa[i+1].charAt(0) >= 48 && sa[i+1].charAt(0) <= 57) {
					cnt++;
					longnum = sa[i] + sa[i+1];
					num = Integer.parseInt(longnum);
					array[cnt] = num;
					i++;
				} 
				else {
					cnt++;
					num = Integer.parseInt(sa[i]);
					array[cnt] = num;
				}
				break;
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println("array = " + array[i]);
			answer += array[i];
		}
		System.out.println(answer);
		return answer;
	}
}

/*
 * 
 * cnt++; num = Integer.parseInt(sa[i]); array[cnt] = num;
 */