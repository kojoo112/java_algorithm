package com.sangok;

import java.util.Scanner;

public class Question1_3 {

    public static String solution(String str) {
        String answer = "";
        String[] temp = str.split(" ");
        int count = 0;
        int index = 0;

        for(int i=0; i<temp.length; i++) {
            if(temp[i].length() > count) {
                count = temp[i].length();
                index = i;
                answer = temp[index];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        System.out.println(solution(input));
    }
}
