package datastructures;

public class BinaryTree
{
    private int counter=0;

         //Definition of the node
    protected class BinaryTreeNode
    {
        DataElement info;
        BinaryTreeNode llink;
        BinaryTreeNode rlink;
    } 
    
    protected BinaryTreeNode root;
    
       //default constructor 
       //Postcondition: root = null;
    public BinaryTree()  
    {
         root = null;
    }

       //copy constructor
    public BinaryTree(BinaryTree otherTree) 
    {
         if(otherTree.root == null) //otherTree is empty
            root = null;
         else
            root = copy(otherTree.root);
    }

       //Method to determine whether the binary tree is empty.
       //Postcondition: Returns true if the binary tree is empty;
       //               otherwise, returns false.    
    public boolean isEmpty()
    {
         return (root == null);
    }

       //Method to do an inorder traversal of the binary tree.
       //Postcondition: The nodes of the binary tree are output
       //               in the inorder sequence.
    public void inorderTraversal()
    {
         inorder(root);
    }

       //Method to do a preorder traversal of the binary tree.
       //Postcondition: The nodes of the binary tree are output
       //               in the preorder sequence.
    public void preorderTraversal()
    {
         preorder(root);
    }

       //Method to do a postorder traversal of the binary tree.
       //Postcondition: The nodes of the binary tree are output
       //               in the postorder sequence.       
    public void postorderTraversal()
    {
         postorder(root);
    }
    
    public void SingleParentCounter()
    {
        counter=0;
        singleParent(root);
        System.out.println("Single parent Count: "+counter);
    }
    public void singleParent(BinaryTreeNode p){
        if(p != null)
         {
            singleParent(p.llink);
            singleParent(p.rlink);
            if((p.llink == null && p.rlink != null)||(p.llink != null && p.rlink == null))counter++;
        }
    }
       //Method to determine the height of the binary tree.
       //Postcondition: The height of the binary tree is returned.    
    public int treeHeight()
    {
         return height(root);
    }

       //Method to determine the number of nodes in the 
       //binary tree.
       //Postcondition: The number of nodes in the binary tree
       //               is returned.       
    public int treeNodeCount()
    {
         return nodeCount(root);
    }

       //Method to determine the number of leaves in the 
       //binary tree.
       //Postcondition: The number of leaves in the binary tree
       //               is returned.       
    public int treeLeavesCount()
    {
         return leavesCount(root);
    }

       //Method to destroy the binary tree.
       //Postcondition: root = null     
    public void destroyTree()
    {
        root = null;
    }

        //Method to make a copy of the binary tree 
       //specified by otherTree points. 
       //Postcondition: A copy of otherTree is assigned to
       //               this binary tree.   
    public void copyTree(BinaryTree otherTree)
    { 
         
         if(this != otherTree) //avoid self-copy
         {
            root = null;   
    
            if(otherTree.root != null) //otherTree is nonempty
               root = copy(otherTree.root);
         }
    
    }
    
        //Method to make a copy of the binary tree to 
        //which otherTreeRoot points. 
        //Postcondition: A copy of the binary tree to which
        //               otherTreeRoot is created and the reference of
        //               the root node of the copied binary tree
        //               is returned.
    private BinaryTreeNode copy(BinaryTreeNode otherTreeRoot)
    {
         BinaryTreeNode temp;
         
         if(otherTreeRoot == null)
            temp = null;
         else
         {
            temp = new BinaryTreeNode();
            temp.info = otherTreeRoot.info.getCopy();
            temp.llink = copy(otherTreeRoot.llink);
            temp.rlink = copy(otherTreeRoot.rlink);
         }
         
         return temp;
    }//end copy

       //Method to do an inorder traversal of the binary
       //tree to which p points.  
       //Postcondition: The nodes of the binary tree to which p
       //               points are output in the inorder sequence.    
    private void inorder(BinaryTreeNode p)
    {
         if(p != null)
         {
            inorder(p.llink);
            System.out.print(p.info + " ");
            inorder(p.rlink);
         }
    }

       //Method to do a preorder traversal of the binary
       //tree to which p points.  
       //Postcondition: The nodes of the binary tree to which p
       //               points are output in the preorder sequence.       
    private void preorder(BinaryTreeNode p)
    {
         if(p != null)
         {
            System.out.print(p.info + " ");
            preorder(p.llink);
            preorder(p.rlink);
         }
    }

       //Method to do a postorder traversal of the binary
       //tree to which p points.  
       //Postcondition: The nodes of the binary tree to which p
       //               points are output in the postorder sequence.      
    private void postorder(BinaryTreeNode p)
    {
         if(p != null)
         {
            postorder(p.llink);
            postorder(p.rlink);
            System.out.print(p.info + " ");
         }
    }

       //Method to determine the height of the binary tree
       //to which p points. 
       //Postcondition: The height of the binary tree to which p
       //               points is returned.   
    private int height(BinaryTreeNode p)
    {
         if(p == null)
            return 0;
         else
            return 1 + max(height(p.llink), height(p.rlink));
    }

       //Method to determine the larger of x and y.
       //Postcondition: The larger of x and y is returned.    
    private int max(int x, int y)
    {
         if(x >= y)
            return x;
         else
            return y;
    }

       //Method to determine the number of nodes in the binary 
       //tree to which p points. 
       //Postcondition: The number of nodes in the binary tree
       //               to which p points is returned.    
    private int nodeCount(BinaryTreeNode p)
    {
        if (p == null) 
            return 0; 
        if (p.llink == null && p.rlink == null) 
            return 1; 
        else
            return nodeCount(p.llink) + nodeCount(p.rlink);
    }
       //Method to determine the number of leaves in the binary 
       //tree to which p points.
       //Postcondition: The number of leaves in the binary tree
       //               to which p points is returned.    
    private int leavesCount(BinaryTreeNode p)
    {
        System.out.println("See Programming Exercise 2.");
        return 0;
    }
}