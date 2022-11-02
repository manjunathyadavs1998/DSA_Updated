package LinkedList;

import java.util.Scanner;

public class reverseLinkedList {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Adding Elements at the End of the Linked List");
        linkedlist ll = new linkedlist();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            ll.addElementAtEnd(val);
        }
        System.out.println("To reverse the Linked List without using any auxiliary space");
        ll.reverseLinkedList();

        System.out.println("To Print the Linked List Elements after reversing the list");
        ll.printLinkedList();


    }
}
