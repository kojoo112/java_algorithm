package kojoo.java.algorithm.array;

import java.util.Scanner;

public class Question2_5 {
    public static int solution(int n) {
        int answer = 0;
        int[] check = new int[n+1];

        for(int i=2; i<check.length; i++) {
            if (check[i] == 0) {
                answer++;
            }
            for(int j=i; j<check.length; j=j+i) {
                check[j] = 1;
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(solution(n));
    }
}
