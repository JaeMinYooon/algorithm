package Level3;

import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;

public class 디스크컨트롤러 {

	public static void main(String[] args) {
		int[][] jobs = {{0, 3}, {1, 9}, {2, 6}};
		
		System.out.println(solution(jobs));
	}
	public static int solution(int[][] jobs) {
        int answer = 0;
        Vector m = new Vector();
        Member m1 = new Member();
        
        for(int i = 0 ; i < jobs.length; i++) {
        	m1.first = jobs[i][0];
        	m1.second = jobs[i][1];
        	m.add(m1);
        }
        Collections.sort(m, new MemberComparator());
        for(int i=0; i< m.size(); i++ ){
        	Member mm = (Member)m.get(i);
        	System.out.println("앞 = "+mm.first+" 뒤 = "+mm.second);
        }

        
        return answer;
    }
	public class Member{
		public int first;
		public int second; 
	}
	public class MemberComparator implements Comparator{
		public int compare(Object arg0, Object arg1) {
			return ((Member)arg0).first > ((Member)arg1).first ?1:0; 
		}
	}


}
