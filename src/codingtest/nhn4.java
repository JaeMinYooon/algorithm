package codingtest;

public class nhn4 {

	public static void main(String[] args) {
		String cardNumber = "21378";
		
		System.out.println(solution(cardNumber));

	}
	public static String solution(String cardNumber){
		int sum = 0;
		if(cardNumber.length() %2 == 0) { // Â¦¼ö¸é
			for(int i = 0 ; i < cardNumber.length() ;i++) {
				if(i%2!=0) {
					sum += (cardNumber.charAt(i)-'0');
				}
				else {
					if((cardNumber.charAt(i)-'0')*2 >= 10) {
						sum += (cardNumber.charAt(i) - '0') * 2 % 10 + 1;
					}
					else
						sum += (cardNumber.charAt(i)-'0')*2;
				}
			}
		}
		else { // È¦¼ö¸é
			for(int i = 0 ; i < cardNumber.length() ;i++) {
				if(i%2==0) {
					sum += (cardNumber.charAt(i)-'0');
				}
				else {
					if((cardNumber.charAt(i)-'0')*2 >= 10) {
						sum += (cardNumber.charAt(i) - '0') * 2 % 10 + 1;
					}
					else {
						sum += (cardNumber.charAt(i)-'0')*2;
					}
				}
			}
		}
		if(sum % 10 == 0)
			return "VALID";
		else
			return "INVALID";
    }
}
