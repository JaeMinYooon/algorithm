package Level1;
public class ��Ʈ���� {

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
				// ���� ����
				array[cnt] = array[cnt] * array[cnt];
				break;
			case "T":
				array[cnt] = array[cnt] * array[cnt] * array[cnt];
				// ���� ������
				break;
			case "*":
				if (cnt == 1) {
					array[cnt] = array[cnt] * 2;
				} else {
					array[cnt - 1] = array[cnt - 1] * 2;
					array[cnt] = array[cnt] * 2;
				}
				// �ռ��� *2 ���ݼ��� *2
				break;
			case "#":
				array[cnt] = array[cnt] * -1;
				// ���� * -1
				break;
			default:
				// ���� ����
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