package Trees;

import java.util.Scanner;

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

        System.out.println("InOrder Traversal :");
        TraversalStrategy strategy = new TraversalStrategy(inorder);
        strategy.print(binarySearchTree.root);

        System.out.println("\nPreOrder Traversal :");
        strategy = new TraversalStrategy(preOrder);
        strategy.print(binarySearchTree.root);

        System.out.println("\nPostOrder Traversal :");
        strategy = new TraversalStrategy(postOrder);
        strategy.print(binarySearchTree.root);
        System.out.println("\nEnter the element to be searched");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Searching... "+n);
        System.out.println(binarySearchTree.search(n));
    }
}
