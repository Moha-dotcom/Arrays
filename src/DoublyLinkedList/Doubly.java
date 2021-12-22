package DoublyLinkedList;

public class Doubly {

    Node head;


    public void addFirst(int val) {

        Node newNode = new Node(val, null, head);
        head = newNode;


    }

    public void printArray() {

        Node temp = head;
        Node last = null;
        System.out.println("Front Traverse");
        while (temp != null) {
            System.out.println(temp.data);

            if(temp.next == null)
                last = temp;
            temp = temp.next;

        }

        System.out.println("Backward Traverse");
        temp = last;
        while (temp != null){
            System.out.println(temp.data);
            temp = temp.prev;
        }
    }


    public void insertEnd(int val){

        Node newNode = new Node(val);




        if(head == null){
            newNode.prev = null;
            newNode.next = null;
            head = newNode;


        }else {

            Node referenceHead = head;

            while (referenceHead.next != null){
                referenceHead = referenceHead.next;
            }

            referenceHead.next = newNode;
            newNode.prev = referenceHead;
            newNode.next = null;
        }
    }


    public void delete(int key){

        if(head == null)
            return;
        Node temp = head;

        while(temp != null && temp.data != key){
            temp = temp.next;

        }

        if(temp == null){
            System.out.println("Element not Found");
        }
        else if(temp == head){
            head = temp.next;
            head.prev = null;
        }else  if(temp.next == null){
            temp.prev.next = null;

        }else {
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;

        }
    }



    public String Search(int key){
        if(head == null){
            return "Empty List";

        }else{

            Node temp = head;

            while(temp != null){
                if(temp.data == key){
                    return  "Found Key";
                }else{

                    temp = temp.next;
                }
            }
        }
        return "Key not Found";
    }

}


    class Main {


        public static void main(String[] args) {

            Doubly doubly = new Doubly();


            doubly.addFirst(12);
            doubly.addFirst(45);
            doubly.addFirst(0);
            doubly.insertEnd(90);
            doubly.insertEnd(60);


            int Elements [] = new int[]{12,45,0,90,60, 829,783};

            for (int i = 0; i < Elements.length; i++){
                System.out.println(Elements[i] + " " + doubly.Search(Elements[i]));;
            }



        }

}
