package LinkedList;

import java.util.Scanner;

public class findMidOfLinkedList {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Adding Elements at the End of the Linked List");
        linkedlist ll = new linkedlist();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            ll.addElementAtEnd(val);
        }
        System.out.println("Finding Middle Element using Fast and Slow pointer approach");
        System.out.println(ll.findMidElementOfLinkedList());

    }
}
