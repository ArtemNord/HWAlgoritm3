//package ru.geekbrains.lesson3;
//
//import org.w3c.dom.Node;
//
//
//public class Revers {
//
//    public  Node head;
//
//    public  Node tail;
//
//    public class Node {
//
//        public Node next;
//
//        public Node prev;
//    }
//
//    public void revers(Object linkedList) {
//        Node node = head;
//
//        Node temp = head;
//        head = tail;
//        tail = temp;
//
//        while (node.next != null) {
//            temp = node.next;
//            node.next = node.prev;
//            node.prev = temp;
//            node = node.prev;
//        }
//    }
//
//}
