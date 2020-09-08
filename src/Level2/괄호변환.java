package Level2;

import java.util.Vector;

public class 괄호변환 {

	public static void main(String[] args) {
		String p = ")()()()(";

		System.out.println(solution(p));
	}

	public static String solution(String p) {
		String answer = "";
        return answer;
	}
}






class erase {
	public static void test() {
		// 벡터를 만들고 그 자리마다 채워줄까?
		Vector<String> place = new Vector<String>();
		Vector<String> v = new Vector<String>();
		String p = "";
		for (int i = 0; i < p.length(); i++) {
			place.add("-");
			v.add(i, p.charAt(i) + "");
		}
		/*
		 * for(int i = 0 ; i < p.length()-1; i++) { if(p.charAt(i)=='(') {
		 * if(p.charAt(i+1)==')'){ place.remove(i); place.add(i,"("); place.remove(i+1);
		 * place.add(i+1, ")"); } } if(p.charAt(i)==')') { if(p.charAt(i+1)=='('){
		 * place.remove(i); place.add(i,"("); place.remove(i+1); place.add(i+1, ")"); }
		 * } } System.out.println(place);
		 */

		int i = p.length();
		while (place.contains("-")) {
			i--;
			// if(v.get(i).equals("(")) {
			// if(v.get(i+1).equals(")")) {
			if (p.charAt(i) == '(') {
				if (p.charAt(i - 1) == ')') {
					place.remove(i);
					place.add(i, ")");
					place.remove(i - 1);
					place.add(i - 1, "(");
					// v.set(i-1, "=");
					// v.set(i,"=");
					v.remove(i);
					v.remove(i - 1);
				}
				// if(v.get(i+1).equals("=")) {
				// i++;
				// continue;
				// }
			}
			// if(v.get(i).equals(")")) {
			// if(v.get(i+1).equals("(")) {
			if (p.charAt(i) == ')') {
				if (p.charAt(i - 1) == '(') {
					place.remove(i);
					place.add(i, ")");
					place.remove(i - 1);
					place.add(i - 1, "(");
					// v.set(i, "=");
					// v.set(i-1, "=");
					v.remove(i);
					v.remove(i - 1);
				}
			}
			System.out.println(place);
			System.out.println(v + " +++ " + i);
			if (i == 1)
				break;
		}

		System.out.println(v);
	}
}