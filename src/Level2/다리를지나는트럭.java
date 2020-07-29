package Level2;

import java.util.Vector;

public class 다리를지나는트럭 {

	public static void main(String[] args) {
		int bridge_length = 2;
		int weight = 10;
		int[] truck_weights = {7,4,5,6};
		
		System.out.println(solution(bridge_length, weight, truck_weights));
	}
	public static int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Vector<Integer> v = new Vector<>();
        Vector<Integer> store = new Vector<>();
        Vector<Integer> life = new Vector<>();
        
        int cnt =0;
        
        for(int i = 0 ; i < truck_weights.length ;i++) {
        	v.add(truck_weights[i]);
        	life.add(bridge_length);
        }
        
      
        
        for(int i = 0 ; i < truck_weights.length ; i++) {
        	if(sum(store)+v.get(i)<=weight) {
        		store.add(v.get(i));
        		answer++;
        		
        		if(cnt==bridge_length) {
        			cnt = 0;
        			store.remove(0);
        		}
        	}
        	else {
        		
        	}
        		
        	
        }
        
        
        
        return answer;
    }
	public static int sum(Vector<Integer> store) {
		int sum = 0;
		for(int i = 0 ; i < store.size() ; i++) {
			sum += store.get(i);
		}
		return sum;
	}
}
