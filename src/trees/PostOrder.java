package trees;

public class PostOrder implements PrintTreeInterface {
    @Override
    public void print(BNode root) {
        if(root!=null){
            print(root.left);
            print(root.right);
            System.out.print(root.value+" ");
        }
    }
}
