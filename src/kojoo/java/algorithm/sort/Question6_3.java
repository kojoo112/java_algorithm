package kojoo.java.algorithm.sort;

import java.util.Scanner;

public class Question6_3 {

    public static int[] solution(int size, int[] input) {

        for(int i=1; i<size; i++) {
            int temp = input[i], j;
            for(j=i-1; j>=0; j--) {
                if(input[j] > temp) {
                    input[j+1] = input[j];
                } else {
                    break;
                }
            }
            input[j+1] = temp;
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

        for(int answer: solution(size, input)) {
            System.out.print(answer + " ");
        }

    }
}
