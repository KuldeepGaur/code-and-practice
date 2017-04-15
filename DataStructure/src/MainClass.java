/**
 * Created by amit on 14/4/17.
 */
public class MainClass {

    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList(3);
        SinglyLinkedList singlyLinkedList1 = new SinglyLinkedList(3);
        singlyLinkedList1=singlyLinkedList;

        int [] arr = new int[]{2,3,4,6,7,66};
        for(int i=0;i<arr.length;i++){
            System.out.println("value is "+arr[i]);
            singlyLinkedList.addNode(arr[i]);
            singlyLinkedList=singlyLinkedList.getNextNode();
        }

        while(singlyLinkedList1.getNextNode()!=null){
            System.out.println("hi there value is "+singlyLinkedList1.getNodeValue());
            singlyLinkedList1=singlyLinkedList1.getNextNode();
        }
    }
}
