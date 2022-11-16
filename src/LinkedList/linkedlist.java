package LinkedList;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Stack;

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

    public static  void addElementAtBeg(int data)
    {
        Node newNode=new Node(data);
        if (head == null) {
            head = newNode;
        }
        else {
           newNode.next=head;
           head=newNode;

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

    public static  int findMidElementOfLinkedList()
    {
        //Logic to find the Middle Element of the Linked List
        if(head.next==null)
            return head.data;

        Node slow=head;
        Node fast=head;

        while(fast!=null&&fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow.data;
    }



    public static  void removeDuplicatesInSortedLinkedList() {
        if(head==null)
            return;
        Node curr = head;
        HashSet<Integer> hs = new HashSet<>();
        while (curr != null && curr.next != null) {
            if (curr.data == curr.next.data) {
                hs.add(curr.data);
                curr.next = curr.next.next;
            } else
                curr = curr.next;
        }
        if(hs.size()>0)
        {
            Node curr1=head;
            while (curr1 != null && curr1.next != null) {
                if (hs.contains(curr1.next.data)) {
                    //hs.add(curr.data);
                    curr1.next = curr1.next.next;
                } else
                    curr1 = curr1.next;
            }

        }
        if(hs.contains(head.data))
            head=head.next;



    }

    public static void partionlist(int x)
    {
        Node curr=head;
        List<Integer> a=new ArrayList<Integer>();
        List<Integer>b=new ArrayList<Integer>();
        while(curr!=null)
        {
            if(curr.data<x)
            {
                a.add(curr.data);
                curr=curr.next;
            }
            else
            {
                b.add(curr.data);
                curr=curr.next;
            }
        }

        Node curr2=head;
        int i=0, j=0;
        while(i<a.size())
        {
            curr2.data=a.get(i);
            curr2=curr2.next;
            i++;
        }
        while(j<b.size())
        {
            curr2.data=b.get(j);
            curr2=curr2.next;
            j++;
        }
//        System.out.println(a);
//        System.out.println(b);
    }
    public static int countnodes()
    {   if(head==null)
            return 0;
        Node temp=head;
        int count=0;
        while(temp!=null)
        {
            count++;
            temp=temp.next;
        }
        return count;

    }

    public static  void swapnodebyK(int left, int right)
    {
        int n=countnodes();
        Node leftprevnode=head;
        Node rightnode=head;
        while(--left>1)
        {
            leftprevnode=leftprevnode.next;
        }
        int right1=n-right+1;
        while(--right1>0)
            rightnode=rightnode.next;
        Node leftnode=leftprevnode.next;
        Node rightprevnode=rightnode.next;

        System.out.println(leftprevnode.data+" "+leftnode.data);
        System.out.println(rightprevnode.data+" "+rightnode.data);



        //System.out.println(n);
    }

    public static void reverselinkedlistbyk(int k)
    {
        Node temp=head;
        int len=0;
        while(temp!=null) {
            len++;
            temp = temp.next;
        }
        int limit=(len/k)*k;
        Node dummy1=head;
        Node dummy2=head;
        while(limit>0)
        {
            int m=0;
            Stack<Integer>st=new Stack<Integer>();
            while(m<k)
            {
                st.push(dummy1.data);
                dummy1=dummy1.next;
                m=m+1;
                limit=limit-1;
            }
            while(m>0)
            {
                dummy2.data=st.pop();
                dummy2=dummy2.next;
                m=m-1;
            }

        }

       // System.out.println(len+" "+limit);
    }




}
