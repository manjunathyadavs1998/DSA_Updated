package LinkedList;



public class linkedlist {
    static Node head=null;

    public static void addElementAtEnd(int data) {   //Logic to add Element at end of the Linked list;

        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;

        }
    }

    public static  void reverseLinkedList()
    {
        if(head==null||head.next==null)
                return;

        Node prev=null;
        Node curr=head;
        while(curr!=null)
        {
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }

    public static  void printLinkedList()
    {   //Logic to Print the Elements of the LinkedLists
        Node temp=head;
        System.out.println();
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }



}
