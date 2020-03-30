package Level2;

import java.util.LinkedList;

public class ������ {

	public static void main(String[] args) {
		int [] priorities = {1,2,3};
		int location = 0;
		solution(priorities, location);

	}
	
	public static int solution(int[] priorities, int location) {
		int answer = 0;
        LinkedList<Integer> q = new LinkedList<Integer>();
        
        for(int i = 0; i < priorities.length; i++) q.add(priorities[i]);
        
        while(!q.isEmpty()){
            boolean isCheck = false;
            int first = q.getFirst();
            for(int i = 1; i < q.size(); i++){
                if(first < q.get(i)){
                    isCheck = true;
                    break;
                }
            }
            
            if(isCheck){ //ù ��° ���Һ��� ū ���� ����Ͽ� �ִ� ���
                q.removeFirst();
                q.add(first);
                
                if(location == 0) location = q.size() - 1;
                else location--;
            }
            else{ //ù ��° ���Ұ� ���� ū ���
                q.removeFirst();
                answer++;
                if(location == 0) break;
                else location--;
            }
        }
        return answer;
    }
}
