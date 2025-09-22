public class Node {
    private int data;
    private Node left;
    private Node right;

    public Node(int data, Node left, Node right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public int getData() {
        return this.data;
    }

    public Node getLeft() {
        return this.left;
    }

    public Node getRight() {
        return this.right;
    }

    @Override
    public int hashCode() {
        int result = Integer.hashCode(data);
        result = 31 * result + (left == null ? 0 : left.hashCode());
        result = 31 * result + (right == null ? 0 : right.hashCode());
        return result;
    }
}
