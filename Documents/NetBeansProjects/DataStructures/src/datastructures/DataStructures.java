package datastructures;

public class DataStructures {
    
    public static void main(String[] args) {
        //SparseMatrix Testing
        //Instanciating SparseMatrix
        SparseMatrix s = new SparseMatrix(8);
        //Adding Values
        s.setTerm(0,0,0,15);
        s.setTerm(1,0,3,22);
        s.setTerm(2,0,5,-15);
        s.setTerm(3,1,1,11);
        s.setTerm(4,1,2,3);
        s.setTerm(5,2,3,-6);
        s.setTerm(6,4,0,91);
        s.setTerm(7,5,2,28);
        //Printing Original
        System.out.println("Original Matrix");
        s.print(s);
        System.out.println("\n");
        //Transposing Matrix
        s = s.transpose(s);
        //Printing new transposed Matrix
        System.out.println("Transposed Matrix");
        s.print(s);
        
        ////////////////////////////////////////////////////////////////////////
        //Queue Testing
        //Instanciating Queue with capacity of 5
        Queue q1 = new Queue(5);
        //Pushing values
        q1.push(11);
        q1.push(2);
	q1.push(3);
        //Popping the value at the front
        q1.pop();
        System.out.println("Front element is: " + q1.peek());
        System.out.println("Rear element is: " + q1.getRear());
        //Pushing a value to the rear
        q1.push(10);
        System.out.println("Front element is: " + q1.peek());
        System.out.println("Rear element is: " + q1.getRear());
        //Popping the value at the front
        q1.pop();
        System.out.println("Front element is: " + q1.peek());
        System.out.println("Rear element is: " + q1.getRear());
        //Pushing a value to the rear
        q1.push(15);
        System.out.println("Front element is: " + q1.peek());
        System.out.println("Rear element is: " + q1.getRear());
        //Printing if its empty or the size
	if (q1.isEmpty())
            System.out.println("Queue Is Empty");
        else
            System.out.println("Queue size is " + q1.size());
        
        ////////////////////////////////////////////////////////////////////////
        //Binary Search Tree Testing
        //Instanciating BinarySearchTree
        BinarySearchTree tree = new BinarySearchTree();
        //Inserting Elements
        tree.insert(new IntElement(1));
        tree.insert(new IntElement(3));
        tree.insert(new IntElement(5));
        tree.insert(new IntElement(6));
        tree.insert(new IntElement(7));
        tree.insert(new IntElement(8));
        tree.insert(new IntElement(9));
        tree.insert(new IntElement(2));
        tree.insert(new IntElement(4));
        //Returning count of single parent leafs
        tree.SingleParentCounter();
        
        ////////////////////////////////////////////////////////////////////////
        //LinkedList Testing
        //Instanciating class
        List test = new List();
        //Pushing several values
        test.push(1);
        test.push(2);
        test.push(3);
        test.push(4);
        //Peeking at the list
        System.out.println(test.peek());
        //Popping the highest value in the linked list
        test.pop();
        //Peeking at the list
        System.out.println(test.peek());
        //Printing entire List
        test.display();
    }
    
}
