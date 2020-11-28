package codingtest;

import java.util.Vector;

public class danal2 {

	public static void main(String[] args) {
		String[] orders = {"alex pizza pasta", "alex pizza pizza", "alex noodle", "bob pasta", "bob noodle sandwich pasta", "bob steak noodle"};
		
		solution(orders);
	}
	public static String[] solution(String[] orders) {
        String[] answer = {};
        Vector<String> v = new Vector<String>();
        for(int i = 0 ; i < orders.length ; i++) {
        	String[] s = orders[i].split(" ");
        	for(int j = 1 ; j < s.length ; j++) {
        		if(!v.contains(s[j]))
        			v.add(s[j]);
        			
        	}
        	System.out.println(v);
        }
        
        return answer;
    }
}
