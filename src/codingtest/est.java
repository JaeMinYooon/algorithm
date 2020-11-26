package codingtest;

public class est {

	public static void main(String[] args) {
		String[] card_numbers = { "", "" };
		System.out.println(solution(card_numbers));

	}

	public static int[] solution(String[] card_numbers) {

		int[] answer = new int[card_numbers.length];
		String[] strings = new String[card_numbers.length];

		int cnt = 0;
		for (int i = 0; i < card_numbers.length; i++) {
			if (card_numbers[i].contains("-")) {
				for (int j = 0; j < card_numbers[i].length(); j++) {
					if (card_numbers[i].charAt(j) == '-') {
						cnt++;
					}
				}
				strings[i] = card_numbers[i].replaceAll("-", "");

				if (cnt == 3 && strings[i].length() == 16) {
					answer[i] = -1; //
				} else {
					answer[i] = 0;
				}
				cnt = 0;

			} else {
				strings[i] = card_numbers[i];
				if (strings[i].length() == 16) {
					answer[i] = -1; //
				} else {
					answer[i] = 0;
				}
			}
		}

		int sum = 0;
		for (int i = 0; i < answer.length; i++) {
			if (answer[i] == -1) {
				for (int j = 0; j < strings[i].length(); j++) {
					if (j != 0) {
						sum += strings[i].charAt(j) - '0';
					} else {
						if ((strings[i].charAt(j) - '0') * 2 >= 10) {
							sum += (strings[i].charAt(j) - '0') * 2 % 10 + 1;
						} else {
							sum += ((strings[i].charAt(j) - '0') * 2);
						}
					}
				}
				if (sum % 10 == 0) {
					answer[i] = 1;
				} else {
					answer[i] = 0;
				}
				sum = 0;
			}
		}

		/*
		 * for(int i=0; i<answer.length; i++) { if(answer[i] == -1) { for(int j=0;
		 * j<strings[i].length(); j++) { if(j % 2 == 0) { num1 +=
		 * numArr[strings[i].charAt(j)]; } else { num2 += strings[i].charAt(j); } }
		 * if((num1 + num2) % 10 == 0) { answer[i] = 1; } else { answer[i] = 0; } } }
		 */

		for (int i = 0; i < strings.length; i++) {
			System.out.print(strings[i] + " " + answer[i]);
			System.out.println();
		}

		return answer;
	}
}
