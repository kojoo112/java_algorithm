package com.sangok;

import java.util.Scanner;

public class Question1_1 {

    public static int solution(String str, char c) {
        int answer = 0;
        str = str.toLowerCase();
        c = Character.toLowerCase(c);

        // 1 번째 방법
        for(char s : str.toCharArray()) {
            if(s == c) {
                answer++;
            }
        }

        // 2 번째 방법
//        for(int i=0; i<str.length(); i++) {
//            if(str.charAt(i) == c) {
//                answer++;
//            }
//        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.next();
        char input2 = scanner.next().charAt(0);

        System.out.println(solution(input1, input2));

    }
}
