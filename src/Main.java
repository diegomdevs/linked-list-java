public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        System.out.println(linkedList.addLast(new Node(4)).value);
        System.out.println(linkedList.first.value);
        System.out.println(linkedList.addLast(new Node(5)).value);
        System.out.println(linkedList.first.value);
        System.out.println(linkedList.length);
    }
    public static class Node {
        int value;
        Node prev;
        Node next;
        public Node(int value) {
            this.value = value;
            this.prev = null;
            this.next = null;
        }
    }
    public static class LinkedList {
        private int length;
        private Node first;
        private Node last;
        public LinkedList() {
            this.length = 0;
            this.first = null;
            this.last = null;
        }
        public Node addLast(Node node) {
            if(this.length == 0) {
                this.first = node;
                this.last = node;
                this.first.next = this.last;
                this.last.prev = this.first;
            } else {
                Node bu = this.last;
                this.last = node;
                this.last.prev = bu;
            }
            this.length++;
            return this.last;
        }
    }
}
