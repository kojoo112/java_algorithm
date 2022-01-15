package kojoo.java.algorithm.dfs;

import java.util.Scanner;

public class Question7_2 {

    // 이진수 출력
    public static void dfs(int number) {

        if(number == 0) {
            return;
        } else {
            dfs(number/2);
            System.out.print(number%2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        dfs(number);
    }
}
