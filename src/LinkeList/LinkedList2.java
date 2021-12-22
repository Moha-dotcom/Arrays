package LinkeList;

public class LinkedList2 {

    Node head;


    public void searching(int val){
        Node temp = head;

        while (temp != null){
            if (temp.data == val){
                System.out.println("Yes data Exist");

            }

            temp = temp.next;

        }


    }


    public void addFirst(int val){
       Node newNode = new Node(val, head);
       head = newNode;
    }

    public void delete(int val){
if(head.data == val){
        head = head.next;

        }else {


        Node temp = head;

    try {
        while(temp != null) {
            if (temp.next.data == val) {
                temp.next = temp.next.next;
                break;
            } else {
                temp = temp.next;

            }
        }

    }catch (NullPointerException ex ){
        System.out.println("We don't have that number on the List");
    }




        }



    }

    public void addLast(int val){
       Node newNode = new Node(val, null);

       if(head == null){
           newNode = head;
       }else {
           Node temp = head;

           while(temp.next != null){
               temp = temp.next;
           }

           temp.next = newNode;
       }


    }

    public Node getHead() {
        return head;
    }

    public void print(){

        Node temp = head;

            while(temp != null){

                System.out.println(temp.data);
                temp = temp.next;
        }
    }
}


//if(head.data == val){
//        head = head.next;
//
//        }else {
//
//
//        Node temp = head;
//
//        while(temp != null) {
//        if (temp.next.data == val) {
//        temp.next = temp.next.next;
//        break;
//        } else {
//        temp = temp.next;
//
//        }
//        }
//        }