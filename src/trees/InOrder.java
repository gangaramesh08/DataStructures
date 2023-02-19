package trees;

public class InOrder implements PrintTreeInterface{
    @Override
    public void print(BNode root) {
        if(root!=null){
            print(root.left);
            System.out.print(root.value+" ");
            print(root.right);
        }
    }
}
