package Level2;

import java.util.Vector;

public class Ä³½Ã {

	public static void main(String[] args) {

		String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"};
		int cacheSize = 3;
				
		System.out.println(solution(cacheSize, cities));
	}

	public static int solution(int cacheSize, String[] cities) {
		int answer = 0;
		Vector<String> v = new Vector<String>();
		
		for(int i = 0 ; i < cities.length ; i++) {
			if(v.contains(cities[i].toUpperCase())) {
				answer++;
				v.remove(cities[i].toUpperCase());
				v.add(cities[i].toUpperCase());
			}
			else {
				answer += 5;
				if(v.size() < cacheSize) {
					v.add(cities[i].toUpperCase());
				}
				else {
					v.add(cities[i].toUpperCase());
					v.remove(0);
				}
			}
			System.out.println(v);
		}
		return answer;
	}
}
