package 구름LEVEL;

public class 숫자카드게임 {

	static int answer = 0;
	
	public static void main(String[] args) {
		int n = 6;
		int k = 6;
		 //조합 (순서관심없고 뽑은 유무만 생각) 구글링
        int[] comArr = new int[k];
        combination(comArr, n, k, 0, 0);
        
        
        System.out.println(answer);
	}
	
	private static void combination(int[] comArr, int n, int r, int index, int target) {
        if(r==0){
        	int sum = 0;
            for(int i : comArr){
                //System.out.print(i+" ");
                sum += i;
            }
            //System.out.println();
            if(sum%n == 0)
        		answer++;
            return;
        }
        if(target == n)return;
         
        comArr[index] = target;
        combination(comArr, n, r-1, index+1, target+1);
        combination(comArr, n, r, index, target+1);
         
    }
}
