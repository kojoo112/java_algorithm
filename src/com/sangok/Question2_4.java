package com.sangok;

import java.util.ArrayList;
import java.util.Scanner;

public class Question2_4 {

    public static int[] solution(int n) {
        int[] answer = new int[n];
        for(int i=0; i<2; i++) {
            answer[i] = 1;
        }

        for(int i=2; i<n; i++) {
            answer[i] = answer[i-1] + answer[i-2];
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for(int answer : solution(n)) {
            System.out.print(answer + " ");
        }
    }
}
