
public class ³â2016 {

	public static void main(String[] args) {
		int a = 5, b = 24;
		solution(a,b);
	}
	public static String solution(int a, int b) {
	      String answer = "";
	      int sum = 0;
	      int jan=31, feb=29, mar=31, apr=30, may=31, jun=30, jul=31, aug=31, sep=30,oct=31,nov=30,dec=31; 
	      switch(a) {
	      case 1:
	    	  sum += b;
	    	  answer = day(sum%7);
	    	  break;
	      case 2:
	    	  sum = jan + b;
	    	  answer = day(sum%7);
	    	  break;
	      case 3:
	    	  sum = jan + feb + b;
	    	  answer = day(sum%7);
	    	  break;
	      case 4:
	    	  sum = jan + feb + mar + b;
	    	  answer = day(sum%7);
	    	  break;
	      case 5:
	    	  sum = jan + feb + mar + apr + b;
	    	  answer = day(sum%7);
	    	  break;
	      case 6:
	    	  sum = jan + feb + mar + apr + may +b;
	    	  answer = day(sum%7);
	    	  break;
	      case 7:
	    	  sum = jan + feb + mar + apr + may + jun + b;
	    	  answer = day(sum%7);
	    	  break;
	      case 8:
	    	  sum = jan + feb + mar + apr + may + jun +jul + b;
	    	  answer = day(sum%7);
	    	  break;
	      case 9:
	    	  sum = jan + feb + mar + apr + may + jun +jul +aug+ b;
	    	  answer = day(sum%7);
	    	  break;
	      case 10:
	    	  sum = jan + feb + mar + apr + may + jun +jul +aug+sep+ b;
	    	  answer = day(sum%7);
	    	  break;
	      case 11:
	    	  sum = jan + feb + mar + apr + may + jun +jul + aug+sep+oct+b;
	    	  answer = day(sum%7);
	    	  break;
	      case 12:
	    	  sum = jan + feb + mar + apr + may + jun +jul + aug+sep+oct+nov+ b;
	    	  answer = day(sum%7);
	    	  break;
	      }
	      System.out.println(answer);
	      return answer;
	}
	public static String day(int n) {
		switch(n) {
		case 0:
			return "THU";
		case 1:
			return "FRI";
		case 2:
			return "SAT";
		case 3:
			return "SUN";
		case 4:
			return "MON";
		case 5:
			return "TUE";
		case 6:
			return "WED";
		}
		return null;
		
	}
}
