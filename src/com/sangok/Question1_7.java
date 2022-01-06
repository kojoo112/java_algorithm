package com.sangok;

import java.util.Scanner;

public class Question1_7 {

    public static String solution(String str) {
        StringBuilder sb = new StringBuilder();

        if(sb.append(str.toLowerCase()).reverse().toString().equals(str.toLowerCase())) {
            return "YES";
        }

        return "NO";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();

        System.out.println(solution(str));
    }
}
