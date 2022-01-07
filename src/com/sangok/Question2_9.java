package com.sangok;

import java.util.Scanner;

public class Question2_9 {

    public static int solution(int size, int[][] puzzle) {
        int answer = Integer.MIN_VALUE;

        for(int i=0; i<size; i++) {
            int rowSum = 0;
            int columnSum = 0;
            for(int j=0; j<size; j++) {
                rowSum += puzzle[i][j];
                columnSum += puzzle[j][i];
            }
            answer = Math.max(answer, Math.max(columnSum, rowSum));
        }

        int slashSum = 0;
        int backSlashSum = 0;

        for(int i=0; i<size; i++) {
            backSlashSum += puzzle[i][i];
            slashSum += puzzle[i][size-i-1];
        }

        answer = Math.max(answer, Math.max(slashSum, backSlashSum));

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[][] puzzle = new int[size][size];

        for(int i=0; i<size; i++) {
            for(int j=0; j<size; j++) {
                puzzle[i][j] = scanner.nextInt();
            }
        }

        System.out.println(solution(size, puzzle));
    }
}
