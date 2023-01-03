package Level1;
public class minDeletionSize {

	public static void main(String[] args) {
		int []arr = {"a","b"};
		solution(arr);
		
	}
	class Solution {
    public int minDeletionSize(String[] strs) {
        int answer = 0;
        String check = "a";
        for(int n = 0 ; n < strs[0].length() ; n++) {
            check = "a";
            int i = 0;
            for(i = 0; i < strs.length ; i++ ){
                if(check.compareTo(strs[i].charAt(n)+"") <= 0){  
                    check = strs[i].charAt(n)+"";
                }else{
                    break;
                }
            }
            if( i != strs.length){
                answer++;
            }
        }
        return answer;
    }
  }
}
