package Level2;

import java.util.Vector;
// 문제 구해서 해보기
// 오픽하구
public class test {
	public static void main(String[] args) {

		String[] records = {"john share", "mary comment", "jay share",
				"check notification", "check notification",
				"sally comment",
				"james share", "check notification", "lee share", "laura share",
				"will share", "check notification", "alice comment",
				"check notification"};
		solution(records);
	}

	public static String[] solution(String[] records) {
		String[] answer= {};
		Vector <String> record = new Vector<String>();
		Vector <String> v = new Vector<String>();
		
		int j = 0;
		int sCnt = 0;
		int cCnt = 0;
		
		for(int i = 0 ; i < records.length ; i++) { 
			String[] check = records[i].split(" ");
			if(check[1].contentEquals("comment")) {
				sCnt = 0;
				cCnt++;
			}
			else if(check[1].contentEquals("share")) {
				cCnt = 0;
				sCnt++;
				
			}
			
			
			if(!records[i].equals("check notification")) {
				record.add(records[i]);
				j++;
			}
			else if(records[i].equals("check notification")) {
				//System.out.println(cCnt + " " + sCnt);
				if(sCnt > 1) {
					v.add(record.get(j-1) + " " + sCnt);
					record.remove(j-1);
					j--;
				}
				else if ( cCnt > 1) {
					v.add(record.get(j-1) + " " + cCnt);
					record.remove(j-1);
					j--;
				}
				else {
					v.add(record.get(j-1));
					record.remove(j-1);
					j--;
				}
				cCnt = 0;
				sCnt = 0;
			}
			
		}
		//String[] a = records[0].split(" ");
		//System.out.println(a[1]);
		System.out.println(v);
	
		answer = new String[v.size()];
		for(int i = 0 ; i < v.size() ; i++) {
			String[] temp = v.get(i).split(" ");
			
			if(temp.length>2)
				answer[i] = v.get(i);
			else if(temp[1].equals("comment"))
				answer[i] = v.get(i) + "ed on your post";
			else if (temp[1].contentEquals("share"))
				answer[i] = v.get(i) + "d your post";
			
		}
		
		//System.out.print("[");
		for(int i = 0 ; i < answer.length ; i++) {
		//	System.out.print(answer[i] + ", ");
		}
		//System.out.print("]");
		
		return answer;
	}
}
