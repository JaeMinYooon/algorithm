package codingtest;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

public class re3 {

	public static void main(String[] args) {
		int N = 7;
		int[][] relation = { { 1, 2 }, { 2, 5 }, { 2, 6 }, { 1, 3 }, { 1, 4 }, { 3, 7 } };
		int[][] relation2 = { { 1, 2 }, { 2, 3 }, { 3, 4 }, { 4, 5 }, { 1, 6 }, { 6, 7 } };
		int[][] relation3 = { { 1, 2 }, { 1, 3 }, { 1, 4 }, { 1, 5 }, { 2, 6 }, { 5, 7 }, { 5, 8 }, { 8, 9 } };
		String[] dirname = { "root", "abcd", "cs", "hello", "etc", "hello", "solution" };
		String[] dirname2 = { "root", "a", "b", "c", "d", "efghij", "k" };
		String[] dirname3 = { "root", "a", "b", "c", "d", "hhhhhh", "e", "f", "g" };
		System.out.println(solution(N, relation, dirname));
	}

	public static int solution(int N, int[][] relation, String[] dirname) {
		int answer = 0;

        Map<Integer, String> map = new HashMap<>();
        map.put(1, dirname[0]);

        while(map.size() < N) {
            for (int i = 0; i < relation.length; i++) {
                if (map.containsKey(relation[i][0])) {
                    String path = map.get(relation[i][0]) + "/" + dirname[relation[i][1] - 1];
                    map.put(relation[i][1], path);
                    if(map.size() == N) break;
                }
            }
        }

        for(Integer key : map.keySet()) {
            if (map.get(key).length() > answer)
                answer = map.get(key).length();
        }

        return answer;
    }


}
