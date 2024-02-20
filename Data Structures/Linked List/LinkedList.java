package com.company.LinkedList;

public class LinkedList {

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

        public void addFirst(int data) {

            Node newNode = new Node(data);      //step1 => create new node

            if(head == null) {
                head = tail = newNode;
                return;
            }
            newNode.next = head;                //step2 => newNode next = head     ,//link
            head = newNode;                     //step3 => head = newNode
            size++;
        }

        public void addLast(int data) {

            Node newNode = new Node(data);

            if(head == null) {
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
            size++;
        }

        public void print() {                              // O(n)

            Node temp = head;

            while(temp != null) {
                System.out.print(temp.data+"->");
                temp = temp.next;
            }
            System.out.println("null");
        }

        public void add(int idx, int data) {              // O(n)

            if(idx == 0) {
                addFirst(data);
                return;
            }
            Node newNode = new Node(data);

            Node temp = head;

            int i = 0;
            while(i < idx-1) {
                temp = temp.next;
                i++;
            }
            //i = idx-1; temp -> prev
            newNode.next = temp.next;
            temp.next = newNode;
            size++;
        }

        public int getAt(int idx){

            if(idx < 0 || idx > LinkedList.size){
                System.out.println("Wrong Index");
                return -1;
            }
            Node temp = head;

            for(int i = 1; i <= idx; i++){
                temp = temp.next;
            }
            return temp.data;
        }

        public int removeFirst() {

            if(size == 0) {
                System.out.println("LL is empty");
                return Integer.MIN_VALUE;
            }
            else if(size == 1) {
                int val = head.data;
                head = tail = null;
                size = 0;
                return val;
            }
            int val = head.data;
            head = head.next;
            size--;
            return val;
        }

        public int removeLast() {

            if(size == 0) {
                System.out.println("LL is empty");
                return Integer.MIN_VALUE;
            } 
            else if(size == 1) {
                int val = head.data;
                head = tail = null;
                size = 0;
                return val;
            }
                                                          //prev : i = size-2
            Node prev = head;
            for(int i=0; i<size-2; i++) {
                prev = prev.next;
            }

            int val = prev.next.data;                             //tail.data
            prev.next = null;
            tail = prev;
            size--;
            return val;
        }

        public void deleteAt(int idx){
           
           if(idx == 0){
               head = head.next;
               size--;
               return;
           }
           Node temp = head;
           for(int i = 1; i <= idx -1; i++){
               temp = temp.next;
           }
           temp.next = temp.next.next;
           tail = temp;
           size--;
        }

        public static void main(String args[]) {

            LinkedList ll = new LinkedList();

            ll.addLast(1);
            ll.addLast(2);
            ll.addLast(3);
            ll.addLast(4);
            ll.addLast(5);
            ll.addLast(6);

            ll.print();                                  //1->2->3->4->5->6->null
            System.out.println(LinkedList.size);
            System.out.println(ll.getAt(8));
            System.out.println("Abhishek Sharma");
            ll.deleteAt(5);
            ll.print();
            System.out.println(LinkedList.tail.data);


        }
}
