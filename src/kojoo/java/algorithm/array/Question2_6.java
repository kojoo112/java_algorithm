package kojoo.java.algorithm.array;

import java.util.ArrayList;
import java.util.Scanner;

public class Question2_6 {

    public static ArrayList<Integer> solution(int size, int[] input)  {
        ArrayList<Integer> answer = new ArrayList<>();
        int temp = 0;
        int separateNumber = 0;

        for(int i=0; i<size; i++) {
            temp = input[i];
            int reverseNumber = 0;
            while(temp > 0) {
                separateNumber = temp % 10;
                reverseNumber = reverseNumber * 10 + separateNumber;
                temp = temp / 10;
            }
            if(isPrime(reverseNumber)) {
                answer.add(reverseNumber);
            }
        }


        return answer;
    }

    private static boolean isPrime(int reverseNumber) {
        if(reverseNumber == 1) {
            return false;
        }

        for(int i=2; i<reverseNumber; i++) {
            if(reverseNumber % i == 0) {
                return false;
            }
        }

        return true;
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
