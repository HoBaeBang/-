package com.company.ioc.section1.number8;

import java.util.Scanner;

public class Main {

    public String solution(String input){
        String result = "NO";
        input = input.replaceAll("[^A-Za-z]", "").toLowerCase();
        String reverse = new StringBuilder(input).reverse().toString();
        if (input.equals(reverse)) {
            result="YES";
        }
        return result;
    }
    public static void main(String[] args) {

        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(T.solution(input));
    }
}
