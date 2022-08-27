public class LinkedList {
    private LinkedNode first;
    private LinkedNode last;
    private short length;

    public LinkedList() {
        this.first = null;
        this.last = null;
        this.length = 0;
    }

    public LinkedNode getFirst() {
        return first;
    }

    public void setFirst(LinkedNode first) {
        this.first = first;

    }

    public LinkedNode getLast() {
        return last;
    }

    public void setLast(LinkedNode last) {
        this.last = last;
    }
    private void setBoth(LinkedNode node) {
        this.setFirst(node);
        this.setLast(node);
    }
    public short getLength() {
        return length;
    }
    public LinkedNode add(int value) {
        LinkedNode node = new LinkedNode(value);
        if (this.getLength() == 0) {
            this.setBoth(node);
        } else {
            this.getLast().setNext(node);
            this.setLast(node);
        }
        this.length++;
        return this.getLast();
    }
}
