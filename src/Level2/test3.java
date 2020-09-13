package Level2;

public class test3 {

	public static void main(String[] args) {

		String[] info = { "java backend junior pizza 150", "python frontend senior chicken 210",
				"python frontend senior chicken 150", "cpp backend senior pizza 260", "java backend junior chicken 80",
				"python backend senior chicken 50" };
		String[] query = { "java and backend and junior and pizza 100",
				"python and frontend and senior and chicken 200", "cpp and - and senior and pizza 250",
				"- and backend and senior and - 150", "- and - and - and chicken 100", "- and - and - and - 150" };

		solution(info, query);
	}

	public static int[] solution(String[] info, String[] query) {
		int[] answer = new int[query.length];
		String[][] info_save = new String[info.length][5];
		String[][] query_save = new String[query.length][5];

		for (int i = 0; i < info.length; i++) {
			String[] Iword = info[i].split(" ");
			String[] Qword = query[i].split(" ");
			int cnt = 0;

			for (int j = 0; j < Iword.length; j++) {
				info_save[i][j] = Iword[j];
			}

			for (int j = 0; j < Qword.length; j++) {
				if (!Qword[j].contentEquals("and")) {
					query_save[i][cnt] = Qword[j];
					cnt++;
				}
			}

		}

		int realcnt = 0;
		for (int n = 0; n < info.length; n++) {
			realcnt = 0;
			for (int i = 0; i < query_save.length; i++) {
				int count = 0;
				for (int j = 0; j < query_save[i].length-1; j++) {
					//System.out.println(i + " " + j + " " + query_save[n][j] + " " +  info[n]);
					if (query_save[n][j].equals("-")) {
						count++;
					}
					else if (info[i].contains(query_save[n][j])) {
						count++;
					} 
					else
						break;
				}
				if (count == 4) {
					int in = Integer.parseInt(info_save[i][4]);
					int q = Integer.parseInt(query_save[n][4]);
					//System.out.println(in + " | " + q);
					if (in >= q)
						realcnt++;
				}

			}
			answer[n] =	realcnt;
			System.out.println(answer[n]);
		}
		// 뭐가 다 되진 않음
		return answer;
	}
}

/*
 * int count = 0; int realcnt = 0; for (int i = 0; i < query_save.length; i++) {
 * realcnt = 0; for (int j = 0; j < info_save.length - 1; j++) { count = 0; for
 * (int n = 0; n < info_save[j].length - 1; n++) { if
 * (query_save[j][n].equals("-")) { count++; continue; } if
 * (query_save[j][n].equals(info_save[j][n])) {
 * //System.out.println(info_save[j][n]); count++; } else break; }
 * System.out.println("count = " + count); if (count == 4) { int q =
 * Integer.parseInt(query_save[j][4]); int in =
 * Integer.parseInt(info_save[j][4]); if (in >= q) realcnt++; } } answer[i] =
 * realcnt; System.out.println(answer[i]); }
 */
