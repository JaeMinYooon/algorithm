package Level1;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        String new_id1 = "...!@BaT#*..y.abcdefghij1klm.";
        String new_id2 = "=.=";

        System.out.println(solution(new_id2));
    }
    public static String solution(String new_id) {
        String answer = "";
        String save = "";



        new_id = new_id.toLowerCase(Locale.ROOT);

        for(int i = 0 ; i < new_id.length() ; i++){
            if(new_id.charAt(i)>='0' && new_id.charAt(i)<='9')
                save += new_id.charAt(i);
            else if (new_id.charAt(i)>='a' && new_id.charAt(i)<='z')
                save += new_id.charAt(i);
            else if (new_id.charAt(i)=='-' || new_id.charAt(i)=='_' || new_id.charAt(i)=='.')
                save += new_id.charAt(i);
        }
        System.out.println(save);
        answer = save;
        save = answer.charAt(0)+"";
        for(int i = 1 ; i < answer.length() ; i++){
            if(answer.charAt(i)=='.') {
                if (answer.charAt(i - 1) != '.'){
                    save += answer.charAt(i);
                }
            }
            else
                save += answer.charAt(i);
        }
        if(save.charAt(0)== '.')
            save = save.substring(1, save.length());
        if(save.length()!=0)
            if(save.charAt(save.length()-1) == '.')
                save = save.substring(0, save.length()-1);

        if(save.equals(""))
            save = "a";

        if(save.length()>=16) {
            save = save.substring(0, 15);
            if(save.charAt(save.length()-1)=='.')
                save = save.substring(0, save.length()-1);
        }
        while(save.length()<3)
            save += save.charAt(save.length()-1);
        answer = save;

        return answer;
    }
}