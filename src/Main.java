public class Main {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList();

        myLinkedList.add(4);
        System.out.println(myLinkedList.getFirst().getValue() + " " + myLinkedList.getLast().getValue());

        myLinkedList.add(5);
        System.out.println(myLinkedList.getFirst().getValue() + " " + myLinkedList.getLast().getValue());

    }
}
