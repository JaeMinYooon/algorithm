package Level2;

import java.util.Vector;

public class test {
	public static void main(String[] args) {

		String new_id = ".......!bat#......y.abc";
		solution(new_id);
	}

	public static String solution(String new_id) {
		String answer= "";
		Vector<String> id = new Vector<String>();
		String[] array_id;
		array_id = new_id.split("");
		for(int i = 0 ; i < new_id.length() ; i++) {
			id.add(array_id[i]);
		}
		
		for(int i = 0 ; i < id.size() ; i++) {
			if(id.get(i).equals(".")) {
				if(id.get(i+1).equals(".")) {
					id.remove(i);
					i--;
				}
			}
		}
		for(int i = 0 ; i < id.size();i++) {
			answer += id.get(i);
		}
		System.out.println(id.size());
		System.out.println(answer);
		return answer;
	}
}
