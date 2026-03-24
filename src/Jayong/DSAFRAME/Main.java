package Jayong.DSAFRAME;

public class Main {

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        
        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtEnd(3);
        
        System.out.println(list.printList());
        
        list.insertAfter(1, 4);
        
        System.out.println(list.printList());
    }
}
