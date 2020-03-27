package Level1;
public class 자릿수더하기 {

	public static void main(String[] args) {
		int n = 123;
		solution(n);
		
	}
	public static int solution(int n) {
        int answer = 0;
        String change = "";
        change = Integer.toString(n);
        String[] arr = {};
        arr = change.split("");
        for(int i = 0 ; i< arr.length; i++)
        	answer += Integer.parseInt(arr[i]);
        
        return answer;
    }
}
