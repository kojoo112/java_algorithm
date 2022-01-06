package com.sangok;

import java.util.Scanner;

public class Question1_8 {

//    public static String solution(String str) {
//        String answer = "YES";
//        char[] temp = new char[str.length()];
//        StringBuilder sb = new StringBuilder();
//        int index = 0;
//
//        for(int i=0; i<str.length(); i++) {
//            if (Character.isAlphabetic(str.charAt(i))) {
//                temp[index] = Character.toLowerCase(str.charAt(i));
//                index++;
//            }
//        }
//        int left = 0;
//        int right = index - 1;
//
//        for(int i=0; i<temp.length/2; i++) {
//            if(temp[left] != temp[right]) {
//                return "NO";
//            }
//            left++;
//            right--;
//        }
//
//        return answer;
//    }

    // 강의의 답
    public static String solution(String str) {
        String answer = "";
        str = str.toLowerCase().replaceAll("[^a-z]", "");
        String temp = new StringBuilder(str).reverse().toString();

        if(temp.equals(str)) {
            return "YES";
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        System.out.println(solution(str));
    }
}
