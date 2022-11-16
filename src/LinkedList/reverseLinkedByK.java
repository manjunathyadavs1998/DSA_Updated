package LinkedList;

import java.util.Scanner;

public class reverseLinkedByK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Reversing the Linkedlist By K");
        linkedlist ll = new linkedlist();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            ll.addElementAtEnd(val);
        }
        int k= sc.nextInt();
        ll.reverselinkedlistbyk(k);

        ll.printLinkedList();
    }
}
