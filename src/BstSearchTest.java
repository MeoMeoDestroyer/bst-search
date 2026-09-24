import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BstSearchTest {
    private BinaryTreeNode<Integer> buildTree() {
        BinaryTreeNode<Integer> left = new BinaryTreeNode<>(5,
                new BinaryTreeNode<>(2), new BinaryTreeNode<>(7));
        BinaryTreeNode<Integer> right = new BinaryTreeNode<>(13,
                new BinaryTreeNode<>(11), new BinaryTreeNode<>(15));
        return new BinaryTreeNode<>(10, left, right);
    }

    // Empty tree always returns false
    @Test
    void testEmptyTreeReturnsFalse() {
        assertFalse(BstSearch.contains(null, 5));
        assertFalse(BstSearch.containsRecursive(null, 5));

    }

    @Test
    void testFindsLeaf() {
        // leaf node at the bottom of the tree is found
        assertTrue(BstSearch.contains(buildTree(), 7));
        assertTrue(BstSearch.containsRecursive(buildTree(), 7));
    }

    @Test
    void testValuesOutsideRangeReturnFalse() {
        // value smaller than min or larger than max -> return false
        BinaryTreeNode<Integer> root = buildTree();
        assertFalse(BstSearch.contains(root, 1));
        assertFalse(BstSearch.contains(root, 100));
        assertFalse(BstSearch.containsRecursive(root, 1));
        assertFalse(BstSearch.containsRecursive(root, 100));
    }


}
