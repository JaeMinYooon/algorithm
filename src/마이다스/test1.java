/*
 * import java.util.Comparator; import java.util.Map; import java.util.TreeMap;
 * 
 * class Solution { public int solution(int[] openA, int[] closeB) { int answer
 * = 0; Comparator<Integer> comparator = (s1, s2)->s1.compareTo(s2);
 * Map<Integer, String> map = new TreeMap<>(comparator);
 * 
 * for(int i : openA) { map.put(i, "A"); }
 * 
 * for(int i : closeB) { map.put(i, "B"); }
 * 
 * int start = -1;
 * 
 * for(Map.Entry<Integer, String> entry : map.entrySet()) {
 * if(entry.getValue().equals("A")) { if(start == -1) { start = entry.getKey();
 * } }
 * 
 * if(entry.getValue().equals("B")) { if(start != -1) { answer += entry.getKey()
 * - start; start = -1; } } }
 * 
 * return answer; } }
 */