public class Reverse_a_LinkedList
{
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    //methods--ADD FIRST IN LINKEDLIST

    public void addFirst(int data) {
        //STEP-1
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        //STEP-2
        newNode.next = head;
        //STEP-3
        head = newNode;
    }

    //Methods-ADD Last in LinkedList
    public void addLast(int data) {
        //STEP-1
        Node newNode = new Node(data);
        size++;


        if (head == null) {
            head = tail = newNode;
            return;
        }

        //STEP-2
        tail.next = newNode;

        //STEP-3
        tail = newNode;
    }

    //Method---Printing Linked list
    public void print() {
        Node temp = head;
        if (head == null) {
            System.out.println("LinkedList is empty");
        }
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    //Method---Adding element in middle
    public void add(int index, int data) {
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i < index - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    //Method---Removing first element

    public int removeFirst() {
        if (size == 0) {
            System.out.println("LL is Empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        } else {
            int val = head.data;
            head = head.next;
            size--;
            return val;
        }
    }

    //Method---Removing last element

    public int removeLast() {
        if (size == 0) {
            System.out.println("LL is Empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        } else {
            Node prev = head;
            for (int i = 0; i < size - 2; i++) {
                prev = prev.next;
            }
            int val = prev.next.data;
            prev.next = null;
            tail = prev;
            size--;
            return val;
        }
    }


    public int search(int key) {
        Node temp = head;
        int i = 0;

        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    public void reverse()
    {
        Node prev=null;
        Node curr=tail=head;
        Node next;

        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }


    public static void main(String args[])
    {
        Reverse_a_LinkedList ll=new Reverse_a_LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);


        ll.reverse();
        ll.print();

    }
}
