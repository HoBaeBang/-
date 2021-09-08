package com.company.ioc.section1.number5;

import java.util.Scanner;

public class Main {
    public String solution(String str) {
        String answer;
        char[] c = str.toCharArray();
        int lt = 0, rt = str.length()-1;
        while (lt < rt) {
            if (!Character.isAlphabetic(c[lt])) lt++;
            else if (!Character.isAlphabetic(c[lt])) rt--;
            else {
                char temp = c[lt];
                c[lt] = c[rt];
                c[rt] = temp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(c);
        return answer;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(main.solution(str));
    }
}
// a#b!GE*T@S