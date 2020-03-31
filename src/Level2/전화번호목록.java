package Level2;

public class 전화번호목록 {

	public static void main(String[] args) {
		String[] phone_book = {"12", "123", "1235","567","88"};
		solution(phone_book);
				
	}
	public static boolean solution(String[] phone_book) {
        boolean answer = true;
        String key = "", compare="";
        for(int i = 0 ; i < phone_book.length -1; i++) {
        	for(int j = i+1 ; j<phone_book.length ; j++) {
        		if(phone_book[i].length() > phone_book[j].length()) {
        			key = phone_book[j];
        			compare = phone_book[i];
        		}
        		else {
        			key = phone_book[i];
        			compare = phone_book[j];
        		}
        		compare = compare.substring(0,key.length());
        		System.out.println("key = "+ key + " compare = " + compare);
        		if(key.equals(compare)) {
        			answer = false;
        			System.out.println(answer);
        			return answer;
        		}
        		
        	}
        }
        System.out.println(answer);
        return answer;
        
	}

}
