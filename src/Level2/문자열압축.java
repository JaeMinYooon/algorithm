package Level2;

import java.util.Vector;

public class ���ڿ����� {
	// 2������ �̳��� �޼ҵ� ¥��
	// �޼ҵ� ���� ���ϱ�
	// ��ΰ� �ϴ� ��
	public static void main(String[] args) {
		String s = "abcabcdede";

		System.out.println(solution(s));
	}

	public static int solution(String s) {
		int answer = s.length();
		String longst = "";
		Vector<String> v = new Vector<String>();
		
		for(int i = 1  ; i < s.length(); i++) {
			v = slice(i, s);
			int cnt =1;
			longst = "";
			for(int a = 0 ; a < v.size()-1; a++) {
				if(v.get(a).contentEquals(v.get(a+1)))
					cnt++;
				else if(cnt != 1) {
					longst += cnt + v.get(a);
					cnt=1;
				}
				else {
					longst += v.get(a);
					cnt=1;
				}
			}
			if(v.get(v.size()-2).contentEquals(v.get(v.size()-1))) {
				longst += cnt + v.get(v.size()-1);
				
			}
			else {
				longst += v.get(v.size()-1);
			}
			
			if(answer > longst.length()) {
				answer = longst.length();
			}
		}
		
		return answer;
	}
	
	public static Vector<String> slice(int i, String s) {
		Vector<String> v = new Vector<String>();
		for(int n = 0 ; n < s.length() ; n=n+i) {
			if((n+i)<s.length())
				v.add(s.substring(n,n+i));
			else {
				v.add(s.substring(n, s.length()));
				break;
			}
		}
		return v;
	}
}
