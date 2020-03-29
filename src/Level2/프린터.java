package Level2;

import java.util.Vector;

public class 프린터 {

	public static void main(String[] args) {
		int [] priorities = {1,1,9,1,1,1};
		int location = 1;
		solution(priorities, location);

	}
	
	public static int solution(int[] priorities, int location) {
	        int answer = 0;
	        int max = 0, index = 0, newnum = 0;
	        Vector<Integer> v = new Vector<>();
	        for(int i = 0 ; i < priorities.length ; i++) {
	        	v.add(priorities[i]);
	        }
	        
	        for(int i = 0 ; i < priorities.length ; i++) {
	        	max = -1;
	        	for(int j = index ; j < v.size()+index ; j++) {
	        		newnum = j%v.size();
		        	if(max < v.get(newnum)){
		        		max = v.get(newnum);
		        		index = newnum;
		        	}
		        }
	        	
	        	answer++;
	        	System.out.println(v.toString() + " | " +location%v.size()+ " | " + (i+index)%v.size() + " | " + i + index + v.size());
	        	if(location%v.size() == (i+index)%v.size()) { // 나누어 떨어지면 안되는 경우를 넣어야함
	        		break;
	        	}
        		v.remove(index);
	        }
	        System.out.println(answer);
	        return answer;
	    }
}
