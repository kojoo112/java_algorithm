package com.sangok;

import java.util.Scanner;

public class Question1_10 {

    public static void solution(String input, char t) {
        int[] distance = new int[input.length()];
        int point = 1000;

        for(int i=0; i<distance.length; i++) {
            if(t == input.charAt(i)) {
                distance[i] = 0;
                point = 0;
            } else {
                distance[i] = point;
            }
            point++;
        }

        point = 1000;

        for(int i=distance.length-1; i>=0; i--) {
            if(t == input.charAt(i)) {
                distance[i] = 0;
                point = 0;
            } else {
                distance[i] = Math.min(distance[i], point);
            }
            point++;
        }

        for(int i=0; i<distance.length; i++) {
            System.out.print(distance[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        char t = scanner.next().charAt(0);

        solution(input, t);
    }

}
