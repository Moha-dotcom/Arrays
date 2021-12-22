package LinkeList;

public class Main2 {

    public static void main(String[] args) {


        LinkedList2 list  = new LinkedList2();
        list.addFirst(14);
        list.addFirst(6);

        list.addLast(40);
        list.addLast(90);
       list.delete(40);
        list.delete(90);


       list.searching(90);
        list.searching(234);
        list.searching(6);


       list.print();

    }
}
