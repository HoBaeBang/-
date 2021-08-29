package com.company.ioc.section1.number2;

import java.util.Scanner;

public class Main {
    public String solution(String str) {
        String answer ="";

        for (char x : str.toCharArray()) {
            if (Character.isLowerCase(x)) answer += Character.toUpperCase(x);
            else answer += Character.toLowerCase(x);
            /*if (x > 97 && x <= 122) answer += (char)(x-32);
            else answer += (char)(x + 32);*/

        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        System.out.println(T.solution(str));
    }
}

/*
    아스키 문자로 하는 법도 있는데
    아스키 코드 숫자로 대문자는 65 ~ 90
    아스키 코드 숫자로 소문자는 97 ~ 122의
    범위를 가지고 있다.
    이를 가지고 소문자에서 32를 빼면 대문자가 된다.
*/
