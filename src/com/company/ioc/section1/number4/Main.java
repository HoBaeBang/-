package com.company.ioc.section1.number4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public ArrayList<String> solution(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();
        for (String x : str) {
            String tmp = new StringBuilder(x).reverse().toString(); //문자열 객체가 만들어 진다.
            answer.add(tmp);
        }
        return answer;
    }

    public ArrayList<String> solutions(int n, String[] str){
        ArrayList<String> answer = new ArrayList<>();
        for (String x : str ) {
            char[] s = x.toCharArray();
            int sp = 0, ep = x.length() - 1;
            while(sp < ep){
                char tmp = s[sp];
                s[sp] = s[ep];
                s[ep] = tmp;
                sp++;
                ep--;
            }
            String tmp = String.valueOf(s);
            answer.add(tmp);
        }
        return answer;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = scanner.next();
        }
        for (String x : main.solution(n,str)) {
            System.out.println(x);
        }
        for (String x : main.solutions(n,str)) {
            System.out.println(x);
        }
    }
}
