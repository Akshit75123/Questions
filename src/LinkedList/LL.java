package LinkedList;

public class LL {
    private class Node {

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

    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+" -> ");
            temp=temp.next;
        }
        System.out.println("END");
    }
}

//    public static void main(String[] args) {
//        LinkedList<Integer> list=new LinkedList<>();
//        list.add(32);
//        list.add(45);
//        System.out.println(list);
//    }

