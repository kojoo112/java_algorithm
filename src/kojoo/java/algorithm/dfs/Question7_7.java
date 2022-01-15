package kojoo.java.algorithm.dfs;

import java.util.LinkedList;
import java.util.Queue;


public class Question7_7 {
    private static Node root;

    private static void bfs(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        int depth = 0;
        while(!queue.isEmpty()) {
            int length = queue.size();
            System.out.print(depth + " : ");
            for(int i = 0; i < length; i++) {
                Node current = queue.poll();
                System.out.print(current.data + " ");
                if(current.left != null) {
                    queue.offer(current.left);
                }
                if(current.right != null) {
                    queue.offer(current.right);
                }
            }
            depth++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        bfs(root);
    }


}
