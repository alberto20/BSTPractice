class BST {
	 
    //Node Class
    class Node
    {
    	//Data
        int key;
        // Left and right pointers
        Node left, right;
 
        // Node Constructor
        public Node(int data)
        {
            key = data;
            left = null;
            right = null;
        }
    }
 
    Node root;
 
    // Constructor
    public BST()
    {
         root = null;
    }
 
    // This method mainly calls insertRec()
    public void insert(int key)
    {
         root = insertRec(root, key);
    }
 
    // goes through the BST using recursive to insert a new Node
    private Node insertRec(Node root, int key)
    {
 
        // If statement to check if Node list in empty
        if (root == null)
        {
        	// If empty sets the new Node into the root
            root = new Node(key);
            return root;
        }

        // if key is less the the node key go left
        if (key < root.key)
        	// recursive call into insertRect using left pointer
            root.left = insertRec(root.left, key);
        // if key is greater then node key go right
        else if (key > root.key)
        	// recursive call into insertRect using right pointer
            root.right = insertRec(root.right, key);
 
        //returns root and exits the recursive call
        return root;
    }
 
    // Public Method used to call inorderRec
    public void inorder()
    {
         inorderRec(root);
    }
 
    //inorder traversal of BST and prints the values From Least to Greatest
    private void inorderRec(Node root)
    {
        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.key);
            inorderRec(root.right);
        }
    }
}