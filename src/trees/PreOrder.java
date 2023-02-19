package trees;

public class PreOrder implements PrintTreeInterface {
    @Override
    public void print(BNode root) {
        if(root!=null){
            System.out.print(root.value+" ");
            print(root.left);
            print(root.right);
        }
    }
}
