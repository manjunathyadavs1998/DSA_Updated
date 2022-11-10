package LinkedList;

import java.util.Scanner;

public class partionList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Partion the linked list");
        linkedlist ll = new linkedlist();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            ll.addElementAtEnd(val);
        }
        int x= sc.nextInt();
        ll.partionlist(x);

        ll.printLinkedList();
    }
}
