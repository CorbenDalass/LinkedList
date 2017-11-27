
public class LinkedListClasswork<E> {
    private Node<E> firsNode;
    private Node<E> lastNode;
    private boolean isFirstInit = true;

    public void addLast(E object) {
        if (isFirstInit) {
            firstInit(object);
            return;
        }
        Node<E> node=new Node<>();
        node.object=object;
        node.previous=lastNode;
        lastNode.next=node;
        lastNode=node;

    }

    public void addFirst(E object) {
        if (isFirstInit) {
            firstInit(object);
            return;
        }
        Node<E> node=new Node<>();
        node.object=object;
        node.next=firsNode;
        firsNode.previous=node;
        firsNode=node;

    }

    public E removeFirst() {
        if (isFirstInit){
            return null;
        }
        Node<E>noda=firsNode;
        if (firsNode==lastNode){
            lastNode=firsNode=null;
            isFirstInit=true;
        }
        firsNode=firsNode.next;
        firsNode.previous=null;
        return noda.object ;
    }

    public E removeLast() {
        if (isFirstInit){
            return null;
        }
        Node<E> noda=lastNode;
        if (lastNode==firsNode){
            lastNode=firsNode=null;
            isFirstInit=true;
        }
        lastNode=lastNode.previous;
        lastNode.next=null;

        return noda.object;
    }

    public E getFirst(){
        return firsNode.object;
    }
    public E getLast(){
        return lastNode.object;
    }
    private void firstInit(E object) {
        lastNode = firsNode = new Node<>();
        lastNode.object = object;

        isFirstInit = false;

    }

    private class Node<E> {
        public Node next;
        public Node previous;
        public E object;

    }

}
