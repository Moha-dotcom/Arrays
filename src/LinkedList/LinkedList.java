package LinkedList;

import java.sql.Ref;

public class LinkedList {

    Node head;

    public void addFirst(int val){
        Node newNode = new Node(val, head);
        head = newNode;

    }

    public boolean search(int val){

        Node temp = head;

        while( temp != null){

            if( temp.data == val){
                return true;
            }


            temp = temp.next;



        }

       return false;
    }

    public void addLast(int val){
        Node newNode = new Node(val, null);


        if( head == null){
            head = newNode;
        }else {
            Node ReferenceNode = head;
            while(ReferenceNode.next != null){
                ReferenceNode = ReferenceNode.next;

            }
            ReferenceNode.next = newNode;

        }



    }


    public void deleteNode(int key){
        /* We check if head == Key
           the we assigne head to the next node.
         */

        if( head.data == key){
            head = head.next;
        }else {
            Node temp = head;

            while(temp.next != null){

                if(temp.next.data == key){

                    temp.next = temp.next.next;
                    break;
                }else{
                    temp = temp.next;
                }

            }
        }


    }



    public void print(){

        Node temp = head;

            while(temp != null){

                System.out.println(temp.data);
            temp = temp.next;
        }
    }




}
