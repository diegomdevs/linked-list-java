public class LinkedList {
    private Node first;
    private Node last;
    private short length;

    public LinkedList() {
        this.first = null;
        this.last = null;
        this.length = 0;
    }

    public Node getFirst() {
        return first;
    }

    public void setFirst(Node first) {
        this.first = first;

    }

    public Node getLast() {
        return last;
    }

    public void setLast(Node last) {
        this.last = last;
    }

    public short getLength() {
        return length;
    }
    public Node add(int value) {
        Node node = new Node(value);
        if (this.length == 0) {
            this.first = node;
            this.last = node;
            this.first.setNext(this.getLast());
            this.last.setPrev(this.getFirst());
        } else {
            this.last.setNext(node);
            this.setLast(this.last.getNext());
        }
        this.length++;
        return this.getLast();
    }
}
