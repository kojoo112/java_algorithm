package kojoo.java.algorithm.dfs;

public class Node {
    Node left;
    Node right;
    int data;

    public Node(int value) {
        this.data = value;
        left = right = null;
    }
}
