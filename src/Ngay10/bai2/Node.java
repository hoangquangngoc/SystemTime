package Ngay10.bai2;

public class Node {
    Node next ;
    Object data;

    public Node( Object data) {
        this.data = data;
    }

    public  Node(Node next) {
        this.next = next;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
