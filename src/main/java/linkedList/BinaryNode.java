package linkedList;

public class BinaryNode<K extends Comparable<K>> {
    public int value;
    K key;
    BinaryNode<K> left;
    BinaryNode<K> right;

    public BinaryNode(K key){
        this.key=key;
        this.left=null;
        this.right=null;
    }
}
