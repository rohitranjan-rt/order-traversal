package com.traversal;

public class Tree {
	
	// Root of the Binary Tree 
    Node root; 
  
    public Tree() 
    { 
        root = null; 
    } 
  
    // function to print breadth first  order traversal of tree
    void printLevelOrder() 
    { 
        int h = height(root); 
        int i; 
        for (i=1; i<=h; i++) 
            printGivenLevel(root, i); 
    } 
  
    /* Compute the "height" of a tree  the number of 
    nodes along the longest path from the root node 
    down to the farthest leaf node.*/
    int height(Node root) 
    { 
        if (root == null) 
           return 0; 
        else
        { 
            /* compute  height of each subtree */
            int lheight = height(root.left); 
            int rheight = height(root.right); 
              
            /* use the larger one */
            if (lheight > rheight) 
                return(lheight+1); 
            else return(rheight+1);  
        } 
    } 
  
    /* Print nodes at the given level */
    void printGivenLevel (Node root ,int level) 
    { 
        if (root == null) 
            return; 
        if (level == 1) 
            System.out.print(root.data + " "); 
        else if (level > 1) 
        { 
            printGivenLevel(root.left, level-1); 
            printGivenLevel(root.right, level-1); 
        } 
    } 
      
    public static void main(String args[]) 
    { 
       Tree tree = new Tree(); 
       tree.root= new Node(1); 
       tree.root.right= new Node(2); 
       tree.root.right.right= new Node(5);
       tree.root.right.right.right= new Node(6);
       tree.root.right.right.left= new Node(3);
       tree.root.right.right.right.right= new Node(4);
    
       System.out.println("Breadth first order traversal of binary tree is "); 
       tree.printLevelOrder(); 
    } 
}
