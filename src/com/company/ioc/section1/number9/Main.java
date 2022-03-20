package com.company.ioc.section1.number9;

import java.util.Scanner;

public class Main {

    public int solution(String input) {

        int result = Integer.parseInt(input.replaceAll("[^0-9]", ""));
        return result;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        System.out.println(T.solution(input));
    }
}
