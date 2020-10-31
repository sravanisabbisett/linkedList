package linkedList;

public class MyNode<K> implements INode<K>{

    private INode next;
    private K key;

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public void setKey(K key) {
        this.key=key;
    }

    public INode<K> getNext() {
        return next;
    }

    public void setNext(INode next) {
        this.next = (MyNode<K>)next;
    }

    public MyNode(K key) {
        this.key=key;
        this.next=null;
    }

}