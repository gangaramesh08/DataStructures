package Trees;

public class BinarySearchMain {
    public static void main(String[] args) {

        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(10);
        binarySearchTree.insert(12);
        binarySearchTree.insert(11);
        binarySearchTree.insert(8);
        binarySearchTree.insert(5);
        PrintTreeInterface inorder = new InOrder();
        PrintTreeInterface preOrder = new PreOrder();
        PrintTreeInterface postOrder = new PostOrder();

        TraversalStrategy strategy = new TraversalStrategy(inorder);
        strategy.print(binarySearchTree.root);
        strategy = new TraversalStrategy(preOrder);
        strategy.print(binarySearchTree.root);
        strategy = new TraversalStrategy(postOrder);
        strategy.print(binarySearchTree.root);
    }
}
