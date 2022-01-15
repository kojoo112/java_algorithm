package kojoo.java.algorithm.array;

import java.util.ArrayList;
import java.util.Scanner;

public class Question2_1 {
    public static ArrayList<Integer> solution(int[] input) {
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(input[0]);

        for(int i=1; i<input.length; i++) {
            if(input[i] > input[i-1]) {
                answer.add(input[i]);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();
        int[] arr = new int[index];

        for(int i=0; i<index; i++) {
            arr[i] = scanner.nextInt();
        }

        for(int i : solution(arr)) {
            System.out.print(i + " ");
        }
    }

}
