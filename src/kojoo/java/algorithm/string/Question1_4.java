package kojoo.java.algorithm.string;

import java.util.Scanner;

public class Question1_4 {

    // String 배열을 활용한 답변
    public static void solution(int index, String[] input) {
        StringBuffer temp = new StringBuffer();

        for(int i=0; i<index; i++) {
            for(int j=input[i].length()-1; j>=0; j--) {
                temp.append(input[i].charAt(j));
            }
            System.out.println(temp);
            temp.delete(0, input[i].length());
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int index = scanner.nextInt();
        String[] input = new String[index];

        for(int i=0; i<index; i++) {
            input[i] = scanner.next();
        }

        solution(index, input);
    }
}
