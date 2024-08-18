package LinkedList;

public class LL {
    public class Node {

        private int value;
        private Node next;

        //writing constructors
        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;

        }
    }

    private Node head;
    private Node tail;

    public int size;

    //constructor
    public void LL() {
        this.size = 0;
    }

    //insertion of new element
    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) { //first element
            tail = head;
        }
        size += 1;
    }

    public void insertLast(int val){
        if(tail==null){
            insertFirst(val);
            return; //don't return the next code
        }
        Node node=new Node(val);
        tail.next=node;
        tail=node;
        size++;
    }

    public void insert(int val, int index) {
        if (index == 0) {
            insertFirst(val);
            return;
        }

        if (index == size) {
            insertLast(val);
            return;
        }

        Node temp = head;

        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(val,temp.next); //structure of linked list changed
        temp.next = node;
        size ++ ;

    }

    public int deleteFirst() {
        int val = head.value;
        head = head.next;

        if(head == tail) {
            tail = null;
        }
        size --;
        return val;
    }

    public int deleteLast () {
        if (size <= 1) return deleteFirst();

        Node secondlast = get(size - 2);
        int val = tail.value;
        tail = secondlast;
        tail.next = null;
        return val;

    }

    public int delete (int n) {
        if (n == 0) deleteFirst();
        if (n == size - 1) deleteLast();
        Node prev = get(n - 1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        return val;
    }

    public Node find(int val) { 
        Node node = head;
        while(node != null) {
            if (node.value == val) return node;
            node = node.next;
        }
        return null;
    }
    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index ; i++) {
            node = node.next;
        }
        return node;
    }

    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+" -> ");
            temp=temp.next;
        }
        System.out.println("END");
    }
}



