package Level2;

import java.util.Arrays;
import java.util.Vector;

public class ÆùÄÏ¸ó {

	public static void main(String[] args) {
		int[] nums = {3, 1, 2, 3};
		
		System.out.println(solution(nums));
	}
	public static int solution(int[] nums) {
        int answer = 0;
        Vector<Integer> v = new Vector<Integer>();
        
        Arrays.sort(nums);
        
        v.add(0, nums[0]);
        for(int i = 1 ; i < nums.length ; i++) {
        	if(nums[i]!=nums[i-1])
        		v.add(nums[i]);
        }
        System.out.println(v);
        
        if(v.size() > nums.length/2)
        	answer = nums.length/2;
        else
        	answer = v.size();
        return answer;
    }
}
