package kojoo.java.algorithm.dfs;

import java.util.Scanner;

public class Question7_4 {
    static int[] fibonacci;

    // 피보나치 수열
    public static int dfs(int number) {
        if(fibonacci[number] > 0) {
            return fibonacci[number];
        }
        if(number == 1) {
            return fibonacci[number] = 1;
        } else if(number == 2) {
            return fibonacci[number] = 1;
        } else {
            return fibonacci[number] = dfs(number-2) + dfs(number-1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        fibonacci = new int[number+1];

        dfs(number);
        for(int i=1; i<=number; i++) {
            System.out.print(fibonacci[i] + " ");
        }
    }
}
