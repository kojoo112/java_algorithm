package com.sangok;

import java.util.Scanner;

public class Question1_9 {

    public static int solution(String str) {
        int answer = 0;

        for(char c : str.toCharArray()) {
            if(Character.isDigit(c)) {
                answer = answer * 10 + (c - 48);
            }
        }

        return answer;
    }

//    public static int solution(String str) {
//        String answer = "";
//
//        for(char c : str.toCharArray()) {
//            if(Character.isDigit(c)) {
//                answer += c;
//            }
//        }
//
//        return Integer.parseInt(answer);
//    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        System.out.println(solution(str));
    }
}
