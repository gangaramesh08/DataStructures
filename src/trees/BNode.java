package trees;

class BNode {
    int value;
    BNode right;
    BNode left;

    BNode root;

    public BNode() {
    }

    public BNode(int value) {
        this.value = value;
    }

    private BNode addNewNode(BNode current, int value) {
        if (current == null) {
            current = new BNode(value);
            root = current;
        } else if (current.value > value) {
            current.left = addNewNode(current.left, value);

        } else {
            current.right = addNewNode(current.right, value);
        }
        return current;

    }

    public void addNode(int value) {
        root = addNewNode(root, value);
    }

    public boolean search(int value) {
        return searchNode(root, value);
    }

    private boolean searchNode(BNode current, int value) {
        boolean find;
        if (current == null) {
            return false;
        } else if (current.value == value) {
            return true;
        } else if (current.value > value) {
            find = searchNode(current.left, value);
        } else {
            find = searchNode(current.right, value);
        }
        return find;
    }

    public void inorderT() {
        inorder(root);
        System.out.println();

    }

    private void inorder(BNode root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.value + " ");
            inorder(root.right);
        }
    }

    public void preOrderT() {
        preOrder(root);
        System.out.println();

    }

    private void preOrder(BNode root) {
        if (root != null) {
            System.out.print(root.value + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
}
