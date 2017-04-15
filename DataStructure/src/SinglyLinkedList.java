/**
 * Created by amit on 14/4/17.
 */
public class SinglyLinkedList {
    private int nodeValue=0;
    private SinglyLinkedList node;

    public SinglyLinkedList(int nodeValue) {
        this.nodeValue = nodeValue;
        this.setNextNode(null);
    }

    public int getNodeValue() {
        return nodeValue;
    }

    public void setNodeValue(int nodeValue) {
        this.nodeValue = nodeValue;
    }

    public SinglyLinkedList getNextNode() {
        return node;
    }

    public void setNextNode(SinglyLinkedList node) {
        this.node = node;
    }

    public void addNode(int value){
        SinglyLinkedList node=new SinglyLinkedList(value);
        this.setNextNode(node);
        node.setNextNode(null);
    }
}
