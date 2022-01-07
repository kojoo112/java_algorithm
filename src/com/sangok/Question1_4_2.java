package com.sangok;

import java.util.ArrayList;
import java.util.Scanner;

public class Question1_4_2 {

    public static ArrayList<String> solution(String[] str) {
        ArrayList<String> answer = new ArrayList<>();

        for(String x : str) {
            String temp = new StringBuilder(x).reverse().toString();
            answer.add(temp);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        String[] str = new String[n];

        for(int i=0; i<n; i++) {
            str[i] = scanner.next();
        }

        for(String x : solution(str)) {
            System.out.println(x);
        }
    }
}
