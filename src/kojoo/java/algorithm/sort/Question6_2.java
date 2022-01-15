package kojoo.java.algorithm.sort;

import java.util.Scanner;

public class Question6_2 {

    public static int[] solution(int size, int[] input) {

        for(int i=0; i<size-1; i++) {
            for(int j=0; j<size-i-1; j++) {
                if(input[j] > input[j+1]) {
                    int temp = input[j];
                    input[j] = input[j+1];
                    input[j+1] = temp;
                }
            }
        }

        return input;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] input = new int[size];

        for(int i=0; i<size; i++) {
            input[i] = scanner.nextInt();
        }

        for(int answer : solution(size, input)) {
            System.out.print(answer + " ");
        }
    }
}
