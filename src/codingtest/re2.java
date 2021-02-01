package codingtest;

import java.util.Vector;

public class re2 {

	public static void main(String[] args) {
		int n = 3;
		int m = 4;
		int[] x_axis = {2};
		int[] y_axis = {1,2};
		System.out.println(solution(n, m, x_axis, y_axis));
	}

	public static int solution(int n, int m, int[] x_axis, int[] y_axis) {
		int answer = 0;
		Vector<Integer> vx = new Vector<Integer>();
		Vector<Integer> vy = new Vector<Integer>();
		int xPoint = 0;
		int yPoint = 0;
		for(int i = 0 ; i < x_axis.length ; i++) {
			vx.add(x_axis[i]-xPoint);
			xPoint = x_axis[i];
		}
		vx.add(n-xPoint);
		for(int i = 0 ; i < y_axis.length ; i++) {
			vy.add(y_axis[i]-yPoint);
			yPoint = y_axis[i];
		}
		vy.add(m-yPoint);
		
		for(int i = 0 ; i < vx.size(); i++ ) {
			for(int j = 0 ; j < vy.size(); j++) {
				if(vx.get(i)*vy.get(j)>answer)
					answer = vx.get(i)*vy.get(j);
			}
		}
		
		return answer;
	}
}
