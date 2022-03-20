package com.company.ioc.section1.number7;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public String solution(String str) {

        String result = "YES";
        String lower = str.toLowerCase();
        char[] chars = lower.toCharArray();
        int lt = 0, rt = chars.length - 1;
        for (int i = 0; i < (str.length()/2); i++){
            if (chars[lt] != chars[rt]) {
                result = "NO";
            } else {
                lt++;
                rt--;
            }
        }
        return result;
    }

    public String solution2(String str){
        String answer = "YES";
        str = str.toUpperCase();
        int len = str.length();
        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - i - 1)) {
                return "NO";
            }
        }
        return answer;
    }

    public String solution3(String str) {
        String answer = "NO";
        String tmp = new StringBuilder(str).reverse().toString();
        if (str.equalsIgnoreCase(tmp)) {
            answer = "YES";
        }
        return answer;
    }


    public static void main(String[]args) {

        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(T.solution(str));
        System.out.println(T.solution2(str));
        System.out.println(T.solution3(str));
    }
}
