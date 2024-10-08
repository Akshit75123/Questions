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

    //insert using recursion
    public void insertRec(int val, int ind){
        head = insertRec(val,ind, head);
    }
    private Node insertRec(int val, int ind, Node node){
        if (ind == 0) {
            Node temp = new Node(val,node);
            size++;
            return temp;
        }
        node.next = insertRec(val,ind--,node.next);
        return node;
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
    //questions
    //leetcode - 83
    public void deleteDuplicates(){
        Node node = head;
        while(node.next != null){
            if (node.value == node.next.value) {
                node.next = node.next.next;
                size -- ;
            }
            else {
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }
    //leetcode -
    public static LL merge (LL first, LL second) {
        Node f = first.head;
        Node s = second.head;
        LL ans = new LL();
        while (f != null && s != null) {
            if (f.value < s.value) {
                ans.insertLast(f.value);
                f = f.next;
            }
            else {
                ans.insertLast(s.value);
                s = s.next;
            }
        }
        while (f != null) {
            ans.insertLast(f.value);
            f = f.next;
        }
        while (s != null) {
            ans.insertLast(s.value);
            s = s.next;
        }
        return ans;
    }
}



