package Level2;

import java.util.HashMap;

public class ÇØ½¬¸Êex_º£½ºÆ®¼¿·¯ {

	public static void main(String[] args) {
		String[] book = {"top", "top", "top", "top", "kk"};
	
		System.out.println(solution(book));
	}
	public static String solution(String[] book) {
		HashMap<String, Integer> books = new HashMap<String, Integer>();
		int max = 0;
		
		for(int i = 0 ; i < book.length ; i++) {
			if(!books.containsKey(book[i]))
				books.put(book[i], 1);
			else
				books.put(book[i], books.get(book[i]) + 1);
		}
		String maxBook ="";
		System.out.println(books.toString());
		
		for(String key : books.keySet()) {
			int value = books.get(key);
			
			if(max == value && maxBook.compareTo(key) > 0) {
				maxBook = key;
				max = value;
			}
			else if(max < value) {
				maxBook = key;
				max = value;
			}
		}
		
		return maxBook;
	}
}
