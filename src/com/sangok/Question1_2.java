package com.sangok;

import java.util.Scanner;

public class Question1_2 {

    public static String solution(String str) {
        String answer = "";

        // 1 번째 방법
        for(char c : str.toCharArray()) {
            if(Character.isLowerCase(c)) {
                answer += Character.toUpperCase(c);
            } else {
                answer += Character.toLowerCase(c);
            }
        }

        // 2 번째 방법
        // 아스키코드
        // 소문자 97 ~ 122
        // 대문자 65 ~ 90
//        for(char c : str.toCharArray()) {
//            if(c >= 97 && c <= 122) {
//                answer += Character.toString(c - 32);
//            } else {
//                answer += Character.toString(c + 32);
//            }
//        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        System.out.println(solution(input));
    }
}
