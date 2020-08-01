package Level2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.TreeSet;

public class toss {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String answer="true";
		String[] store = input.split(" ");
		String[] temp = input.split(" ");
		Arrays.parallelSort(temp);
		
		TreeSet<String> treeSet = new TreeSet<>();
        for(String data : store){
            treeSet.add(data);
        }
		
        if(treeSet.size() != temp.length ) {
        	answer = "false";
			System.out.println(answer);
			return;
        }
		if(store.length < 6) {
			answer = "false";
			System.out.println(answer);
			return;
		}
		for(int i = 0 ; i < store.length ; i++) {
			if(!store[i].equals(temp[i])){
				answer = "false";
				System.out.println(answer);
				return;
			}
			if(Integer.parseInt(store[i])>45) {
				answer = "false";
				System.out.println(answer);
				return;
			}
		}
		System.out.println(answer);
		return;
	}
}
