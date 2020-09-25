package Level2;

import java.util.Vector;

public class Æ©ÇÃ { 
	public static void main(String[] args) {
		String s = "{{1,2,3},{2,1},{1,2,4,3},{2}}";
		
		System.out.println(solution(s));
	}

	public static int[] solution(String s) {
		Vector<Integer> answer = new Vector<Integer>();
		int cnt = 0;
		s = s.substring(1, s.length() - 1);
		String[] sp = s.split("},");

		Vector<String> v = new Vector<String>();
		for (int i = 0; i < sp.length; i++) {
			v.add("");
		}
		for (int i = 0; i < sp.length; i++) {
			cnt = 0;
			sp[i] = sp[i].substring(1, sp[i].length());
			if (i == sp.length - 1)
				sp[i] = sp[i].substring(0, sp[i].length() - 1);
			for (int j = 0; j < sp[i].length(); j++) {
				if (sp[i].charAt(j) == ',') {
					cnt++;
				}
			}
			v.set(cnt, sp[i]);
		}

		answer.add(Integer.parseInt(v.get(0)));

		for (int i = 1; i < v.size(); i++) {
			String[] pre = v.get(i).split(",");
			for (int n = 0; n < pre.length; n++) {
				if(!answer.contains(Integer.parseInt(pre[n])))
					answer.add(Integer.parseInt(pre[n]));
			}
		}
		int[] a = new int[answer.size()];
		
		for(int i = 0 ; i < answer.size(); i++) {
			a[i] = answer.get(i);
		}
		return a;
	}
}
