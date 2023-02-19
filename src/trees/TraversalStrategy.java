package trees;

public class TraversalStrategy {
    PrintTreeInterface order;

    public TraversalStrategy(PrintTreeInterface order) {
        this.order = order;
    }

    public void print(BNode root){
        order.print(root);
    }
}
