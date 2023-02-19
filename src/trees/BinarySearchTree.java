package trees;

/**
 * This class provides an implementation of the Binary Search Tree.
 * A Binary Search Tree is a binary tree in which all the child elements to
 * the left of a node are lesser than it and all the right children are greater
 * than it.
 * This class contains a method insert that traverses through the array and inserts
 * the node at appropriate location following the rules of the Binary Search Tree.
 */
public class BinarySearchTree {
    public BNode root;

    public BinarySearchTree() {
        root = null;
    }

    private BNode insertRec(BNode current, int value){
        if(current==null){
            current = new BNode(value);
            return current;
        }
        else if(value<current.value){
           current.left= insertRec(current.left,value);
        }
        else if(value>current.value){
            current.right=insertRec(current.right,value);

        }
        return current;
    }
    public void insert(int value){
        root = insertRec(root,value);
    }

    /**
     * This method is used for searching element in the binary search tree
     */
    public boolean search(int value){
        return searchRec(root, value);
    }

    private boolean searchRec(BNode root, int value) {
        boolean find = false;
        if(root!=null){
            if(root.value==value){
                return true;
            }
            else if(value<root.value){
                find=searchRec(root.left,value);
            }
            else {
               find =  searchRec(root.right,value);
            }
        }
        return find;
    }
}
