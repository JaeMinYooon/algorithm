package Level2;

public class JadenCase문자열만들기 {
	public static void main(String[] args) {
		String s = "m  E ";
		solution(s);
	}

	public static String solution(String s) {
		s = s.toLowerCase();
		String[] a = s.split(" ");
		if (s.substring(s.length() - 1, s.length()).equals(" ")) {
			a[a.length - 1] += " ";
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i].length() >= 1) {

				char[] array = a[i].toCharArray();
				array[0] = Character.toUpperCase(array[0]);

				a[i] = new String(array);
			}
		}
		String result = a[0];
		for (int i = 1; i < a.length; i++) {
			result += " " + a[i];
		}
		System.out.println(result.length());
		System.out.println(result.substring(result.length()-1, result.length()));
		return result;
	}
}
