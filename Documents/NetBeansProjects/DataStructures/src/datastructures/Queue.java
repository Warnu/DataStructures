package datastructures;

public class Queue {
    private int arr[];         // array to store queue elements
    private int front;         // front points to front element in the queue
    private int rear;          // rear points to last element in the queue
    private int capacity;      // maximum capacity of the queue
    boolean lastOperationIsPush = false;
	
    // Constructor to initialize queue
    Queue(int size)
    {
	arr = new int[size];
	capacity = size;
	front = 0;
	rear = -1;
    }
    //Function to pop the element at the front of the queue
    public void selectivepop(int k){
        k=(front+k)% capacity;
        rear--;
    }
    public void pop(){
        if(arr[front]==0&&arr[rear]==0&&!lastOperationIsPush){
            System.out.println("Array is Empty\nProgram Terminated");
            System.exit(1);
        }
        if(front==rear && lastOperationIsPush){
            System.out.println("UnderFlow\nProgram Terminated");
            System.exit(1);
        }
        else{
            System.out.println("Removing "+arr[front]);
            arr[front]=0;
            front = (front + 1) % capacity;
        }
        lastOperationIsPush = false;
    }
    //Function to add elements at the end of the queue
    public void push(int item){
        if(front==rear && !lastOperationIsPush){
            System.out.println("UnderFlow\nProgram Terminated");
            System.exit(1);
        }
        else{
            System.out.println("Pushing " + item);
            rear = (rear + 1) % capacity;
            arr[rear] = item;
        }
        lastOperationIsPush = true;
    }

    // Utility function to return front element in the queue
    public int peek(){
    	if (isEmpty()){
            System.out.println("UnderFlow\nProgram Terminated");
            System.exit(1);
        }
	return arr[front];
    }
    public int getRear(){
    	if (isEmpty()){
            System.out.println("UnderFlow\nProgram Terminated");
            System.exit(1);
        }
	return arr[rear];
    }

    // Utility function to return the size of the queue
    public int size(){
	return arr.length;
    }

    // Utility function to check if the queue is empty or not
    public Boolean isEmpty(){
	return (size() == 0);
    }

    // Utility function to check if the queue is empty or not
    public Boolean isFull(){
	return (size() == capacity);
    }
}
