package com.sangok;

import java.util.Scanner;

public class Question2_2 {
    public static int solution(int[] height) {
        int answer = 0;
        int max = -2147000000;

        for(int i=0; i<height.length; i++) {
            if(height[i] > max) {
                max = height[i];
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] height = new int[size];

        for(int i=0; i<size; i++) {
            height[i] = scanner.nextInt();
        }

        System.out.println(solution(height));
    }
}
