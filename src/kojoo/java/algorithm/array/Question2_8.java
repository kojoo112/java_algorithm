package kojoo.java.algorithm.array;

import java.util.Scanner;

public class Question2_8 {

    public static int[] solution(int size, int[] score) {
        int[] answer = new int[size];

        for(int i=0; i<size; i++) {
            int rank = 1;
            answer[i] = rank;
            for(int j=0; j<size; j++) {
                if(score[i] < score[j]) {
                    rank++;
                    answer[i] = rank;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] score = new int[size];

        for(int i=0; i<size; i++) {
            score[i] = scanner.nextInt();
        }

        for(int answer: solution(size, score)) {
            System.out.print(answer + " ");
        }
    }
}
