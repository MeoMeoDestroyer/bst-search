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
}
