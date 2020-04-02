package Level2;

import java.util.Vector;

public class 기능개발 {
	public static void main(String[] args) {
		int []progresses = {93, 30,40, 55};
		int []speeds     = {1,  30,50,  5};
		solution(progresses, speeds);
	}
	public static int[] solution(int[] progresses, int[] speeds) {
		int[] answer = {};
		Vector<Integer> pass = new Vector<Integer>();
		Vector <Integer> v = new Vector<Integer>();
        for(int i = 0 ; i < progresses.length ; i++) {
        	for ( int j = 0 ; j <= 100 ; j++) {
        		if(progresses[i] + (speeds[i] * j) >= 100) {
        			pass.add(j);
        			break;
        		}
        	}
        	//pass.add(i,0);
        }
        int cnt=0;
        for(int i = 0 ; i < pass.size() ; i++) {
        	cnt = 1;
        	System.out.println(i);
        	for(int j = i + 1 ; j < pass.size() ; j++) {
        		System.out.println(pass.get(i) + " | " + pass.get(j));
        		if(pass.get(i)>=pass.get(j)) {
        			cnt++;
        			pass.remove(j);
        			j--;
        		}
        		else {
        			break;
        		}
        	}
        	System.out.println(pass.toString() + " | cnt = " + cnt);
        	v.add(cnt);
        		
        }
        System.out.println(v.toString());
        answer = new int[v.size()];
        for(int i = 0 ; i < v.size(); i++) {
        	answer[i] = v.get(i);
        }
        return answer;
    }
}

/*
 *  public int[] solution(int[] progresses, int[] speeds) {
        int[] dayOfend = new int[100];
        int day = -1;
        for(int i=0; i<progresses.length; i++) {
            while(progresses[i] + (day*speeds[i]) < 100) {
                day++;
            }
            dayOfend[day]++;
        }
        return Arrays.stream(dayOfend).filter(i -> i!=0).toArray();
    }
}
*/
