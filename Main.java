public class Main {
    Node node;

    public static void main(String[] args) {
        Main tree = new Main();
        SkewedTree skewedTree = new SkewedTree();

        // Hardcoding the BST
        tree.node = new Node(50);
        tree.node.left = new Node(30);
        tree.node.right = new Node(60);
        tree.node.left.left = new Node(10);
        tree.node.left.left.right = new Node(20);
        tree.node.right.left = new Node(55);

        // Convert the BST to skewed tree
        tree.node = skewedTree.convertToSkewed(tree.node, null);

        // Print the skewed tree in ascending order
        System.out.println("Skewed tree node values in ascending order:");
        skewedTree.printInOrder(tree.node);
    }
}
