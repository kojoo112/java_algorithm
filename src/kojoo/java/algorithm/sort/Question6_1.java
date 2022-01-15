package kojoo.java.algorithm.sort;

import java.util.Scanner;

public class Question6_1 {

    public static int[] solution(int size, int[] input) {
        int[] answer = new int[size];

        for(int i=0; i<size; i++) {
            int minIndex = i;
            for(int j=i+1; j<size; j++) {
                if(input[minIndex] > input[j]) {
                    minIndex = j;
                }
            }

            int temp = input[i];
            input[i] = input[minIndex];
            input[minIndex] = temp;
            answer[i] = input[i];
        }


        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] input = new int[size];

        for(int i=0; i<input.length; i++) {
            input[i] = scanner.nextInt();
        }

        for(int answer : solution(size, input)) {
            System.out.print(answer + " ");
        }
    }
}
