package kojoo.java.algorithm.dfs;

import java.util.Scanner;

public class Question7_3 {

    // N 팩토리얼
    public static int dfs(int number) {

        if(number == 1) {
            return 1;
        } else {
            return number * dfs(number-1);
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        System.out.println(dfs(number));
    }
}
