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
    
    public void callSearch(int key)
    {
    	search(root,key);
    }
    
    // Search the Node list for the key requested using recursive method
    private Node search(Node root, int key)
    {
    	// if List empty return print a statement to console that list is empty
    	if(root == null)
    	{
    		System.out.println("Error: The list is empty!");
    	}
    	
    	// if Key is equal to the node key print key found and return to exit recursive method
    	if(key == root.key)
    	{
    		System.out.println("Key Found!");
    		return root;
    	}
    	
    	// if key less then node key traverse on left branch
    	if(key < root.key)
    	{
    		// if next node is null then not in list and prompts the user key not in list and return to exit recursive method
    		if(root.left==null)
    		{
    			System.out.println("Key not in List!");
    			return root;
    		}
    		// if not null traverse left branch
    		else
    		{
    			search(root.left, key);
    		}
    	}
    	
    	// if key greater then node key traverse on right branch
    	if(key > root.key)
    	{
    		// if next node is null then not in list and prompts the user key not in list and return to exit recursive method
    		if(root.right==null)
    		{
    			System.out.println("Key not in List!");
    			return root;
    		}
    		// if not null traverse right branch
    		else
    		{
    			search(root.right, key);
    		}
    	}
    	return root;
    }
}