package com.company;


import java.util.Collections;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        String str1 = "france";
        String str2 = "french";

        System.out.println(solution(str1, str2));
    }
    public static int solution(String str1, String str2) {
        double answer = 0;
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        Vector<String> st1 = new Vector<String>();
        Vector<String> st2 = new Vector<String>();
        String save = "";
        int cnt = 0;
        for(int i = 0 ; i < str1.length()-1 ; i++){
            save = str1.substring(i, i+2);
            cnt = 0;
            for(int j = 0 ; j < 2 ; j++){
                if(save.charAt(j)>='a' && save.charAt(j) <='z'){
                    cnt++;
                }
                else {
                    break;
                }
                if(cnt == 2) {
                    st1.add(save);
                }
            }
        }
        for(int i = 0 ; i < str2.length()-1 ; i++){
            save = str2.substring(i, i+2);
            cnt = 0;
            for(int j = 0 ; j < 2; j++){
                if(save.charAt(j)>='a' && save.charAt(j) <= 'z'){
                    cnt++;
                }
                else
                    break;
                if(cnt == 2){
                    st2.add(save);
                }
            }
        }
        System.out.println(st1);
        System.out.println(st2);
        Collections.sort(st1);
        Collections.sort(st2);
        int len1 = st1.size();
        int len2 = st2.size();
        Vector<String> ans = new Vector<String>();
        double n = 0;
        if(st1.size() >= st2.size()) {
            ans = st1;
            for (int i = 0; i < st2.size(); i++) {
                if (ans.contains(st2.get(i))) {
                    n++;
                } else {
                    ans.add(st2.get(i));
                }
            }
            if (n == 0)
                answer = 1;
            else
                answer = n / (len1 + len2 - n);
        }
        else{
            ans = st2;
            for (int i = 0; i < st1.size(); i++) {
                if (ans.contains(st1.get(i))) {
                    n++;
                } else {
                    ans.add(st1.get(i));
                }
            }
            if (n == 0)
                answer = 1;
            else
                answer = n / (len1 + len2 - n);
        }


        System.out.println(ans);
        System.out.println(n + " " + (len1 + len2 - n) + " " + answer);
        return (int) (answer * 65536);
    }
}