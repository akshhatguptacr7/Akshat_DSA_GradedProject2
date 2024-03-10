public class SkewedTree {
    // Function to convert BST to skewed tree
    public Node convertToSkewed(Node root, Node prev) {
        if (root == null)
            return null;

        // Convert left subtree
        Node rightNode = convertToSkewed(root.left, prev);

        // Update root's left pointer to null
        root.left = null;

        // Set the previous node's right pointer to the current root
        if (prev != null)
            prev.right = root;

        // Update the previous node to current root
        prev = root;

        // Convert right subtree
        convertToSkewed(root.right, prev);

        return rightNode != null ? rightNode : root;
    }

    // Function to print the skewed tree in ascending order
    public void printInOrder(Node root) {
        if (root == null)
            return;

        while (root != null) {
            System.out.print(root.data + " ");
            root = root.right;
        }
    }
}
