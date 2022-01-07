package com.sangok;

import java.util.Scanner;

public class Question2_10 {

    public static int solution(int size, int[][] mountain) {
        int answer = 0;
        int[] upDown = { -1, 0, 1, 0 };
        int[] leftRight = { 0, -1, 0, 1 };

        for(int i=1; i<=size; i++) {
            for(int j=1; j<=size; j++) {
                boolean isTop = true;
                for(int k=0; k<4; k++) {
                    int x = i + upDown[k];
                    int y = j + leftRight[k];
                    if(mountain[i][j] <= mountain[x][y]) {
                        isTop = false;
                        break;
                    }
                }
                if(isTop) {
                    answer++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[][] mountain = new int[size+2][size+2];

        for(int i=1; i<=size; i++) {
            for(int j=1; j<=size; j++) {
                mountain[i][j] = scanner.nextInt();
            }
        }

        System.out.println(solution(size, mountain));
    }

}
