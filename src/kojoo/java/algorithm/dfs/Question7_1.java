package kojoo.java.algorithm.dfs;

import java.util.Scanner;

public class Question7_1 {

    // 3 입력시 1 2 3 출력
    public static void dfs(int number) {

        if(number == 0) {
            return;
        } else {
            // System.out.print(number + " "); : 3 2 1 출력
            dfs(number-1);
            System.out.print(number + " ");
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        dfs(number);
    }
}
