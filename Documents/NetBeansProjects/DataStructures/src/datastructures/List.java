package datastructures;

import static java.lang.System.exit;
public class List {
    private class Nodes{
        int data;
        Nodes link;
    }
    Nodes top;
    List(){
        this.top = null;
    }

    public void push(int x){
        Nodes temp = new Nodes();

        if(temp ==null){
            System.out.print("Overflow");
            return;
        }

        temp.data =x;
        temp.link = top;
        top = temp;
    }

    public boolean isEmpty(){
        return top ==null;
    }

    public int peek(){
        if(!isEmpty()){
            return top.data;
        }
        else{
            System.out.println("Empty Stack");
            return -1;
        }
    }

    public void pop(){
        if(top == null){
            return;
        }
        top =(top).link;
    }
    public void display(){
        if(top == null){
            System.out.println("Underflow");
            exit(1);
        }
        else{
            Nodes temp = top;
            while(temp != null){
                System.out.println(temp.data);
                temp = temp.link;
            }
        }
    }
}
