package com.sangok;

import java.util.Scanner;

public class Question1_11 {

    public static void solution(String input){
        String answer = "";
        input += " ";
        int count = 1;

        for(int i=0; i<input.length()-1; i++) {
            if(input.charAt(i) == input.charAt(i+1)) {
                count++;
            } else {
                answer += input.charAt(i);
                if(count > 1) {
                    answer += count;
                    count = 1;
                }
            }
        }

        System.out.println(answer);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        solution(input);
    }

}
