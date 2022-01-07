package com.sangok;

import java.util.Scanner;

public class Question1_12 {

    public static String solution(int length, String password) {
        String answer = "";
        String temp = "";

        for(int i=0; i<length; i++) {
            temp = password.substring(0, 7).replace('#', '1').replace('*', '0');
            int decimal = Integer.parseInt(temp, 2);
            answer += (char) decimal;

            password = password.substring(7);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        String password = scanner.next();

        System.out.println(solution(length, password));
    }
}
