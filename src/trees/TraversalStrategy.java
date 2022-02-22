package trees;

public class TraversalStrategy {
    PrintTreeInterface order;

    public TraversalStrategy(PrintTreeInterface order) {
        this.order = order;
    }

    public void print(Node root){
        order.print(root);
    }
}
