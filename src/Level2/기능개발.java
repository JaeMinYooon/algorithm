package Level2;

import java.util.Vector;

public class 기능개발 {
	아직안됐다... 다시해보자 지금 문제는 연속으로 나오면 짤리지 않음 + 인덱스 값 구하기
	public static void main(String[] args) {
		int []progresses = {93, 30, 100,55, 100, 40};
		int []speeds     = {1,  30,  0,  5,   0, 40};
		solution(progresses, speeds);
	}
	public static int[] solution(int[] progresses, int[] speeds) {
		int[] answer = {};
        int[] pass = new int[progresses.length];
        int cnt = 0;
        Vector<Integer> v = new Vector<Integer>();
        int sum = 1;
        for(int i = 0 ; i < speeds.length ; i++) {
        	for(int j = 1 ; j < 100 ; j++) {
        		if(progresses[i]+speeds[i]*j >= 100) {
        			pass[i] = j;
        			break;
        		}
        	}
        	v.add(pass[i]);
        }
        for(int i = 0 ; i < v.size()-1; i++) {
        	if(v.get(i) >= v.get(i+1)) {
        		v.remove(i+1);
        	}
        }
        System.out.println(v.toString());
        answer = new int[v.size()];
        for(int i = 0 ; i < v.size() ; i++) {
        	answer[i] = v.get(i);
        }
        return answer;
    }
}
