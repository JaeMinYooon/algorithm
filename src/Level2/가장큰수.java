package Level2;

import java.util.Arrays;
import java.util.Comparator;

public class 가장큰수 {

	public static void main(String[] args) {
		int[] numbers = { 3,30,34,5,9 };
		solution(numbers);
	}

	public static String solution(int[] numbers) {
        Integer[] array = new Integer[numbers.length];
        for (int i=0; i<numbers.length; i++) 
            array[i] = numbers[i];

        Arrays.sort(array, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                String tmp1 = o1.toString();
                String tmp2 = o2.toString();
                return ((tmp2+tmp1)).compareTo(tmp1+tmp2);
            }
        });

        String answer = "";
        for(int i=0; i<array.length; i++){
            answer += String.valueOf(array[i]); 
        }

        if("0".equals(answer.substring(0, 1)))
            return "0";

        return answer;
	}
}



/*
 * String answer = "";

        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < numbers.length; i++) {
            list.add(numbers[i]);
        }
        Collections.sort(list, (a, b) -> {
            String as = String.valueOf(a), bs = String.valueOf(b);
            return -Integer.compare(Integer.parseInt(as + bs), Integer.parseInt(bs + as));
        });
        StringBuilder sb = new StringBuilder();
        for(Integer i : list) {
            sb.append(i);
        }
        answer = sb.toString();
        if(answer.charAt(0) == '0') {
            return "0";
        }else {
            return answer;
        }
 */