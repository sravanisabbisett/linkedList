import linkedList.INode;
import linkedList.MyNode;
import linkedList.MyStack;
import org.junit.Assert;
import org.junit.Test;

public class stackTest {

    @Test
    public void givenThreeNumberWhenAddedToStackshouldHaveLastAddedNode() {
        MyStack stack=new MyStack();
        MyNode<Integer> myFirstNode=new MyNode<>(70);
        MyNode<Integer> mySecondNode=new MyNode<>(30);
        MyNode<Integer> myThirdNode=new MyNode<>(56);
        stack.push(myFirstNode);
        stack.push(mySecondNode);
        stack.push(myThirdNode);
        stack.printStack();
        INode peak=stack.peak();
        Assert.assertEquals(peak,myThirdNode);

    }
}
