package linkedList;

public class MyStack {
    private final MyLinkedList myLinkedList;

    public MyStack() {
        this.myLinkedList=new MyLinkedList();
    }

    public void push(INode myNode) {
        myLinkedList.add(myNode);
    }

    public void printStack() {
        myLinkedList.PrintMyNodes();
    }

    public INode peak() {
        return myLinkedList.head;
    }

    public INode pop() {
        return myLinkedList.pop();
    }

    public int size() {
        return myLinkedList.size();
    }

    public void emptyingTheStack(){
        while (size()!=0){
            pop();
        }
    }

    public boolean IsEmpty(){
        if(size()==0){
            return true;
        }
        else{
            return false;
        }
    }
}
