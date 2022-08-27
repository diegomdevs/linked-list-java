public class LinkedNode {
    private LinkedNode prev;
    private int value;
    private LinkedNode next;
    public LinkedNode(int value) {
        this.prev = null;
        this.value = value;
        this.next = null;
    }

    public LinkedNode getPrev() {
        return prev;
    }

    public void setPrev(LinkedNode node) {
        node.prev = this.prev;
        node.next = this;
        this.prev = node;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public LinkedNode getNext() {
        return next;
    }

    public void setNext(LinkedNode node) {
        node.prev = this;
        node.next = this.next;
        this.next = node;
    }
}
