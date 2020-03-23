
public class 비밀지도 {

	public static void main(String[] args) {
		int n = 5;
		int[] arr1 = { 9, 20, 28, 18, 11 };
		int[] arr2 = { 30, 1, 21, 17, 28 };
		solution(n, arr1, arr2);

	}

	public static String[] solution(int n, int[] arr1, int[] arr2) {
		String[] answer = {};
		answer = new String[n];
		String arr1B = "";
		String arr2B = "";
		String []new1B = {};
		String []new2B = {};
		String temp = "";
		for(int i = 0 ; i < n ; i++) {
			arr1B = Integer.toBinaryString(arr1[i]);
			arr2B = Integer.toBinaryString(arr2[i]);
			for(int j = 0 ; j < n; j++) {
				if(arr1B.length() < n) 
					arr1B = "0" + arr1B;
				if(arr2B.length() < n)
					arr2B = "0" + arr2B;
				answer[i] = "0" + answer[i];
			}
			new1B = arr1B.split("");
			new2B = arr2B.split("");
			temp = "";
			for(int j = 0 ; j < n ; j++) {
				if(new1B[j].equals("1") || new2B[j].equals("1"))
					temp = temp + "#";
				else
					temp = temp + " ";
			}
			//arr1B = arr1B.replace("1", "#");
			//arr2B = arr2B.replace("1", "#");
			answer[i] = temp;
			System.out.println(arr1B +"  |  "+ arr2B + "  |  " + answer[i]);
			
			
		}
		
		return answer;
	}
	
}



/*
 * public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] result = new String[n];
        for (int i = 0; i < n; i++) {
            result[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
        }

        for (int i = 0; i < n; i++) {
            result[i] = String.format("%" + n + "s", result[i]);
            result[i] = result[i].replaceAll("1", "#");
            result[i] = result[i].replaceAll("0", " ");
        }

        return result;
    }
 */
