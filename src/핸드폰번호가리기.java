
public class 핸드폰번호가리기 {
	public static void main(String[] args) {
		String phone_number = "01033334444";
		solution(phone_number);
	}
	
	public static String solution(String phone_number) {
		String answer = "";
		String []array = {};
		array = new String[phone_number.length()];
		array = phone_number.split("");
		for(int i = 0 ; i < array.length-4 ; i++) {
			array[i]="*";
		}
		for(int i = 0 ; i < array.length;i++) {
			answer += array[i];
		}
		System.out.println(answer);
		return answer;
	}
}
