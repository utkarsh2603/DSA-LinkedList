public class Check_Palindrome
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
    public Node findMid(Node head)
    {
        Node slow=head;
        Node fast=head;
        while (fast!=null&&fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }

    public boolean checkPalindrome()
    {
        if(head==null||head.next==null)
        {
            return true;
        }
        //step 1
        Node midNode=findMid(head);
        //step-2
        Node prev=null;
        Node curr=midNode;
        Node next;
        while(curr!=null) {
            next = curr.next;
            prev = curr;
            curr = next;
        }
        Node right=prev;
        Node left=head;

        while(right!=null)
        {
            if(left.data!=right.data)
            {
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }


    public static void main(String args[])
    {
        Check_Palindrome ll=new Check_Palindrome();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(2);
       // ll.addLast(1);

        System.out.println(ll.checkPalindrome());


    }
}
