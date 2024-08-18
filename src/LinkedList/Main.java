package LinkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
//        LL list = new LL();
//        LL lis = new LL();
//        LinkedList<Integer> list2 = new LinkedList<>();
//        list.insertFirst(3);
//        list.insertFirst(2);
//        list.insertFirst(8);
//        list.insertFirst(17);
//        list.insertLast(99);
//        list.insert(23,3);
//
//        list.display();
//
//        list.deleteFirst();
//        list.deleteLast();
//        System.out.println(list.delete(2));
//        list.display();
//        System.out.println(list.find(1));

        DLL list = new DLL();
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(6);
        list.insertFirst(5);
        list.insertFirst(8);
        list.insertLast(8);
        list.insertAfter(6,54);
        list.display();

    }
}
