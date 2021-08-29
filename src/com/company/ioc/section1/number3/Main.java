package com.company.ioc.section1.number3;

import java.util.Scanner;

public class Main {
    public String solution(String str) {
        String answer = "";
        int max = Integer.MIN_VALUE;
        String[] s = str.split(" ");        //String[] 이라는 배열로 리턴한다. split이
        for (String x : s) {
            int len = x.length();
            if (max < len) {
                max = len;
                answer = x;
            }
        }
        return answer;
    }

    public String solutions(String str) {
        String answer = "";
        int max = Integer.MIN_VALUE, pos;
        while((pos = str.indexOf(' '))!=-1){
            String tmp = str.substring(0, pos);
            int len = tmp.length();
            if (len > max) {
                max = len;
                answer = tmp;
            }
            str = str.substring(pos + 1);
        }
        if(str.length()>max) answer = str;
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(T.solution(str));
        System.out.println(T.solutions(str));
    }
}
