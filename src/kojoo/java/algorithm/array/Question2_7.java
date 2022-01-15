package kojoo.java.algorithm.array;

import java.util.Scanner;

public class Question2_7 {

    public static int solution(int size, int[] score) {
        int answer = 0;
        int count = 0;

        for(int i=0; i<size; i++) {
            if(score[i] == 1) {
                count++;
                answer += count;
            } else {
                count = 0;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] score = new int[size+1];

        for(int i=0; i<size; i++) {
            score[i] = scanner.nextInt();
        }

        System.out.println(solution(size, score));
    }
}
