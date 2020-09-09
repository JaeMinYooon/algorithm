package Level2;

import java.util.Vector;

public class °ýÈ£º¯È¯ {

	public static void main(String[] args) {
		String p = "))()))((((";

		System.out.println(solution(p));
	}

	public static String solution(String p) {
		String answer = "";
		int score = 0;
		int cnt = 0;
		String temp = "";
		Vector<String> u_save = new Vector<String>();
		Vector<String> v_save = new Vector<String>();
		
		for(int i = 0 ; i < p.length(); i++) {
			if(p.charAt(i) == '(')
				score++;
			else
				score--;
			if(score==0) {
				String u = "";
				if(cnt == 0)
					u = p.substring(cnt, i+1);
				else
					u = p.substring(cnt+1, i+1);
				String v = p.substring(i+1, p.length());
				//System.out.println(u + " " + v);
				u_save.add(u);
				v_save.add(v);
				cnt = i;
			}
				
		}
		
		for(int i = u_save.size()-1 ; i > -1 ; i--) {
			if(u_save.get(i).charAt(0)=='(') {
				if(i==u_save.size())
					continue;
				temp = v_save.get(i);
				temp = u_save.get(i) + temp;
				v_save.set(i, temp);
			}
			else if (u_save.get(i).charAt(0)==')') {
				String v_temp= "";
				String u_temp = "";
				
				v_temp = v_save.get(i);
				u_temp = u_save.get(i);
				v_temp = v_temp + ")";
				v_temp = "(" + v_temp;
				u_temp = u_temp.substring(1, u_temp.length()-1);
				
				u_temp = u_temp.replace('(', '-');
				u_temp = u_temp.replace(')', '(');
				u_temp = u_temp.replace('-', ')');
				
				v_temp = v_temp + u_temp;
				if(i == 0)
					v_save.set(i, v_temp);
				else
					v_save.set(i-1, v_temp);
			}
				
		}
		//System.out.println(u_save);
		//System.out.println(v_save);
		
		answer = v_save.get(0);
        return answer;
	}
}


