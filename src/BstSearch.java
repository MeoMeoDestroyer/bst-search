public class BstSearch {
    /**
     * Returns whether a binary search tree contains a given value.
     * 
     * As a precondition, the input root is assumed to be the root of a binary
     * search tree; this is not validated by the method. Passing in an invalid
     * tree causes undefined behavior.
     * 
     * A null value for the root is considered to represent a valid but empty
     * binary search tree. A null root will cause this method to always return
     * false if a valid target is given.
     * 
     * This method must run in O(log(n)) if the tree is balanced, where n is the # of
     * nodes in the tree. In other words, this method should NOT search every node -
     * it should take advantage of the binary search tree properties to efficiently
     * search.
     * 
     * @param <T> The type of the values held in the nodes
     * @param root the root of the binary search tree (assumed to be valid)
     * @param target the value to search for
     * @return true if the target is contained in the tree, false otherwise
     * @throws NullPointerException if target is null
     */
    public static <T extends Comparable<T>> boolean contains(BinaryTreeNode<T> root, T target) {
        // Implement here, and make sure to implement tests too!
        if (target == null) {
            throw new NullPointerException("Target value cannot be null");
        }
        BinaryTreeNode<T> current = root;
        while (current != null) {
            int result = target.compareTo(current.data);
            if (result == 0) {
                return true;              
            } else if (result < 0) {
                // if target smaller -> only the left subtree can hold it
                current = current.left;
            } else {
                current = current.right;  // target is larger -> only the right subtree can hold it
            }
        }
        return false;       
}

    public static <T extends Comparable<T>> boolean containsRecursive(BinaryTreeNode<T> root, T target) {
        if (target == null) {
            throw new NullPointerException("Target value cannot be null");
        }
        if (root == null) {
            return false;
        }
        int result = target.compareTo(root.data);
        if (result == 0) {
            return true;
        } else if (result < 0) {
            return containsRecursive(root.left, target);
        } else {
            return containsRecursive(root.right, target);
        }
    }
}
