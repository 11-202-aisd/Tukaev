public class BinarySearchTree {
    protected Node root;

    public void insert(int x){
        root = doInsert(root,x);
    }
    private Node doInsert(Node node, int x){
        if (node == null){
            return new Node(x);
        }
        if (x < node.key){
            node.left = doInsert(node.left,x);

        }
        if (x > node.key){
            node.right = doInsert(node.right,x);
        }
        return node;
    }
    public boolean searchNode(int x){
        return doSearchNode(root,x);
    }
    private boolean doSearchNode(Node node,int x){
        if (node == null){
            return false;
        }
        if (node.key == x){
            return true;
        }
        return x < node.key ? doSearchNode(node.left, x) : doSearchNode(node.right, x);
    }
    public void delete(int x){
        root = doDeleteNode(root,x);
    }
    private Node doDeleteNode(Node node, int x){
        if (node == null){
            return null;
        }
        if (node.key == x){
            if (node.left == null && node.right == null){
                return null;
            }
            if (node.right == null) {
                return node.left;
            }

            if (node.left == null) {
                return node.right;
            }
            int smallestKey = findSmallestKey(node.right);
            node.key = smallestKey;
            node.right = doDeleteNode(node.right, smallestKey);
            return node;
        }
        if (x > node.key){
            node.right = doDeleteNode(node.right,x);
        }
        node.left = doDeleteNode(node.left,x);
        return node;
    }
    private int findSmallestKey(Node root) {
        return root.left == null ? root.key : findSmallestKey(root.left);
    }
    public void printTree(Node node, int d){
        if (node != null){
            printTree(node.right, d = d + 1);
            for (int i = 1; i < d; i++){
                System.out.print(" ");
            }
            System.out.println(node.key);
            printTree(node.left, d = d + 1);
        }
    }


}
