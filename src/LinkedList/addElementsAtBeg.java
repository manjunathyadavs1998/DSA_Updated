package LinkedList;

import java.util.Scanner;

public class addElementsAtBeg {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Adding Elements at the Beginning of the Linked List");
        linkedlist ll = new linkedlist();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            ll.addElementAtBeg(val);
        }
        System.out.print("Printing the Elements of the Linked Lists");
        ll.printLinkedList();
    }
}
