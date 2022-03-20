package com.company.ioc.section1.number10;

import java.util.Scanner;

public class Main {

    public int[] solution(String inputString, char inputText) {
        int[] answer = new int[inputString.length()];

        for (int i = 0; i < inputString.length(); i++) {
            int st = 1000;
            if (i < inputString.length() - 1) {
                st = 0;
                for (int j = i; j < inputString.length(); j++) {
                    if (inputString.charAt(j) == inputText) {
                        break;
                    }
                    st++;
                }
            }

            int ls = 1000;
            if (i > 0) {
                ls = 0;
                for (int j = i; j >= 0; j--) {
                    if (inputString.charAt(j) == inputText)
                        break;
                    ls++;
                }
            }
            answer[i] = Math.min(st, ls);
        }
        return answer;

    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.next();
        char inputText = scanner.next().charAt(0);
        for (int n : T.solution(inputString, inputText)) {
            System.out.print(n);
        }
        scanner.close();
    }

}
