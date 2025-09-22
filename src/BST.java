public class BST {
    Node root;

    public BST(Node root) {
        this.root = root;
    }

    public Node lookUp(int target) {
        return lookUpRecursive(root, target);
    }

    private Node lookUpRecursive(Node current, int target) {
        if (current == null) {
            return null;
        }

        int currentData = current.getData();

        if (currentData == target) {
            return current;
        } else if (currentData > target) {
            return lookUpRecursive(current.getLeft(), target);
        } else {
            return lookUpRecursive(current.getRight(), target);
        }
    }
}
