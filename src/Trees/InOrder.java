package Trees;

public class InOrder implements PrintTreeInterface{
    @Override
    public void print(Node root) {
        if(root!=null){
            print(root.left);
            System.out.println(root.value);
            print(root.right);
        }
    }
}
