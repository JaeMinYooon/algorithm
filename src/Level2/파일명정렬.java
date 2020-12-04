package Level2;

public class 파일명정렬 {

	public static void main(String[] args) {
		//String[] files = {"img12.png", "img10.png", "img02.png", "img1.png", "IMG01.GIF", "img2"};
		String[] file = {"F-5 Freedom Fighter", "B-50 Superfortress", "A-10 Thunderbolt II", "F-14 Tomcat"};
		//String[] test = {"F13.png", "F14", "f013", "F014", "F013.TXT"};
		solution(file);
	}
	public static String[] solution(String[] files) {
        String[] head = new String[files.length];
        String[] number = new String[files.length];
        String[] tail = new String[files.length];
        int j = 0;
        
        for(int i = 0 ; i < files.length ; i++) {
        	head[i] = "";
        	number[i] = "";
        	tail[i] = "";
        	
        	for(j = 0 ; j < files[i].length() ; j++) {
        		if(48 <= files[i].charAt(j) && files[i].charAt(j) <= 57) {
        			break;
        		}
        		head[i] += files[i].charAt(j);
        	}
        	for(; j<files[i].length() ; j++) {
        		if(48 > files[i].charAt(j) || files[i].charAt(j) > 57) {
        			break;
        		}
        		number[i]+= files[i].charAt(j);
        	}
        	for(; j<files[i].length() ; j++) {
        		tail[i]+= files[i].charAt(j);
        	}
        	if(tail[i]=="")
        		tail[i] = "(빈 문자열)";   	
        }
       
        //for(int n = 0 ; n < files.length-1 ; n++) {
        //	for(int m = n+1 ; m < files.length ; m++) {
        for(int n = 0 ; n < files.length ; n++) {
			for(int m = 0 ; m < files.length -n -1 ; m ++) {
		    		if(head[m].toLowerCase().compareTo(head[m+1].toLowerCase()) > 0) { //>
		    			String temp = files[m];
		    			files[m] = files[m+1];
		    			files[m+1] = temp;
		    			temp = head[m];
		    			head[m] = head[m+1];
		    			head[m+1] = temp;
		    			temp = number[m];
		    			number[m] = number[m+1];
		    			number[m+1] = temp;
		    		}
		    			
        	}
        }
        for(int i = 0 ; i < files.length ; i++){
        	//System.out.print(head[i] + " | " + number[i] + " | " + tail[i] + " | ");
        	System.out.println(files[i]);
        }
        
        System.out.println("");
        for(int n = 0 ; n < files.length ; n++) {
			for(int m = 0 ; m < files.length -n -1 ; m ++) {
				if(head[m].toLowerCase().contentEquals(head[m+1].toLowerCase())) {
        			if(Integer.parseInt(number[m])>Integer.parseInt(number[m+1])) {
		    			String temp = files[m];
		    			files[m] = files[m+1];
		    			files[m+1] = temp;
		    			temp = number[m];
		    			number[m] = number[m+1];
		    			number[m+1] = temp;
		    			temp = head[m];
		    			head[m] = head[m+1];
		    			head[m+1] = temp;
		    		}
        		}
		    			
        	}
        }
        
        for(int i = 0 ; i < files.length ; i++){
        	//System.out.print(head[i] + " | " + number[i] + " | " + tail[i] + " | ");
        	System.out.println(files[i]);
        }
        
        
        return files;
    }
}
