package com.company.ioc.study.resection1.renumber4;

import java.util.ArrayList;
import java.util.Scanner;

//  n개의 단어를 주어지면 단어를 거꾸로 출력하기
public class Main {
    public ArrayList<String> solution(int n ,String[] str) {
        ArrayList<String> answer = new ArrayList<>();

        for (String x : str) {
            char[] c = x.toCharArray();
            int sp = 0;
            int ep = x.length() -1;
            while(sp<ep){
                char temp = c[sp];
                c[sp] = c[ep];
                c[ep] = temp;
                sp++;
                ep--;
            }
            String temp = String.valueOf(c);
            answer.add(temp);
        }
        return answer;
    }

    public ArrayList<String> solutions(int n, String[] str ) {
        ArrayList<String> answer = new ArrayList<>();
        for (String x : str) {
            String temp = new StringBuilder().reverse().toString();
            answer.add(temp);
        }
        return answer;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String[] str = new String[num];
        for (int i = 0; i < num; i++) {
            str[i] = scanner.next();
        }
        for (String x: main.solution(num, str)
             ) {
            System.out.println(x);
        }
        for (String x: main.solutions(num, str)
             ) {
            System.out.println(x);
        }
    }
}
