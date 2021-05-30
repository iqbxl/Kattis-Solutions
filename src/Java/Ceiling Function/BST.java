class BST {                       // GOOD PRACTICE ON RECURSION
    private Node root;

    private static class Node {   // Node has a recursive definition -> Node left and Node right 
        private int value;        // Nested STATIC class DOES NOT need reference of outer class, can create 
        private Node left;        // instance of Node class without creating instance of Outer class (BST)
        private Node right;       // Also, cannot access non-static members (e.g. methods & fields) in nested 
                                  // static class directly "non-static member cannot be used in static context"                                      
        private Node(int value) { // But inner class can access both static & non-static member of outer class  
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    public BST() {
        this.root = null;                         // initialise node to null for constructor of BST
    }

    public void insert(int x) {                   // insert function for new integers to be added to bst
        this.root = insertHelper(this.root, x);
    }

    private Node insertHelper(Node node, int x) { // recursive helper function for insert
        if (node == null) {
            return new Node(x);                   // if current node is a null, return new node 
        } else {
            if (x < node.value) {
                node.left = insertHelper(node.left, x);
            } else {
                node.right = insertHelper(node.right, x);
            }
            return node;
        }
    }

    @Override
    public String toString() {                    // override to give a unique string for a different tree shape
        StringBuilder str = new StringBuilder();
        toStringHelper(this.root, str);
        return str.toString();
    }

    private void toStringHelper(Node node, StringBuilder str) { // In-order traversal recursive implementation
        if (node.left != null) {                 
            str.append('l');                      // use 'l' and 'r' to identify trees of same/diff shape
            toStringHelper(node.left, str);       // recursive call to the left subtree
        }
        str.append('x');
        if (node.right != null) {
            str.append('r');
            toStringHelper(node.right, str);      // recursive call to the right subtree
        }
    }
}