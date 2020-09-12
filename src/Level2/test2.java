package Level2;

import java.util.*;

public class test2 {

	public static void main(String[] args) {

		String play_time = "99:59:59";
		String adv_time = "25:00:00";
		String[] logs = {"69:59:59-89:59:59", "01:00:00-21:00:00", "79:59:59-99:59:59", "11:00:00-31:00:00"};
		System.out.println(solution(play_time, adv_time, logs));
	}

	public static String solution(String play_time, String adv_time, String[] logs) {
		KKOTime[] times = new KKOTime[logs.length];
		KKOTime advt = getTime(adv_time);
		KKOTime pt = getTime(play_time);

		for (int i = 0; i < logs.length; i++) {
			times[i] = getLogTime(logs[i]);

		}

		Arrays.sort(times);
		// for(KKOTime t : times){
		// System.out.println(t.start + " " + t.end);
		// }
		int maxIndex = -1;
		int max = 0;
		for (int i = 0; i < times.length; i++) {
			int start = times[i].start;
			int end = start + advt.end - advt.start;
			int count = 0;
			for (int j = 0; j < times.length; j++) {
				if (j == i)
					continue;
				if ((times[j].start > start && times[j].start < end)
						|| (times[j].end > start && times[j].start < end)) {
					count++;
				}
			}
			if (count > max) {
				max = count;
				maxIndex = i;
			}
		}

		// System.out.println(convert(times[maxIndex].start));
		int start = times[maxIndex].start;
		int end = times[maxIndex].start + advt.end - advt.start;
		if (end > pt.end) {
			start -= end - pt.end;
			if (start < 0)
				start = 0;
		}

		return convert(start);
	}

	public static KKOTime getTime(String str) {
		int end = 0;
		for (int j = 0; j < 8; j += 3) {
			if (j < 6) {
				end += Integer.parseInt(str.substring(j, j + 2));
				end *= 60;
			} else
				end += Integer.parseInt(str.substring(j, j + 2));
		}
		return new KKOTime(0, end);
	}

	public static KKOTime getLogTime(String str) {
		int start = 0;
		for (int j = 0; j < 8; j += 3) {
			if (j < 6) {
				start += Integer.parseInt(str.substring(j, j + 2));
				start *= 60;
			} else
				start += Integer.parseInt(str.substring(j, j + 2));
		}
		int end = 0;
		for (int j = 9; j < 17; j += 3) {
			if (j < 15) {
				end += Integer.parseInt(str.substring(j, j + 2));
				end *= 60;
			} else
				end += Integer.parseInt(str.substring(j, j + 2));
		}
		return new KKOTime(start, end);
	}

	public static String convert(int ss) {
		int hh = 0;
		int mm = 0;
		if (ss >= 3600) {
			hh = ss / 3600;
			ss = ss - (hh * 3600);
		}
		if (ss >= 60) {
			mm = ss / 60;
			ss = ss - (mm * 60);
		}
		String timeStr;
		if (hh < 10)
			timeStr = "0" + hh + ":";
		else
			timeStr = hh + ":";
		if (mm < 10) {
			timeStr += "0" + mm;
		} else
			timeStr += mm;
		timeStr += ":";
		if (ss < 10)
			timeStr += "0" + ss;
		else
			timeStr += ss;
		return timeStr;
	}

}
class KKOTime implements Comparable<KKOTime> {
	public int start;
	public int end;
	
	public KKOTime(int start, int end) {
		this.start = start;
		this.end = end;
	}
	
	@Override
	public int compareTo(KKOTime o) {
		return start - o.start;
	}
}
