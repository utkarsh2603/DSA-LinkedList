public class Remove_nth_from_end
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





        public void removeFromEnd(int nth) {
            int sz = 0;
            Node temp = head;
            while (temp != null) {
                temp = temp.next;
                sz++;
            }

            if(nth==sz)
            {
                head=head.next;
                return;
            }
            int i=1;
            int iToFind=sz-nth;
            Node prev=head;
            while(i<iToFind)
            {
                prev=prev.next;
                i++;
            }
            prev.next=prev.next.next;
            return;

        }

        public static void main(String args[])
        {
            Remove_nth_from_end ll=new Remove_nth_from_end();
            ll.addFirst(2);
            ll.addFirst(1);
            ll.addLast(3);
            ll.addLast(4);
            ll.addLast(5);

            ll.removeFromEnd(2);
            ll.print();

        }
    }

