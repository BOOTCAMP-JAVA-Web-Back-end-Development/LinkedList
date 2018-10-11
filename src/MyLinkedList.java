public class MyLinkedList {
    private Node head;
    private int numNodes;
    private Node tail;

    public MyLinkedList(Object data) {
        this.head = new Node(data);
        this.numNodes = 1;
        this.tail = head;
    }


    public void add(int index, Object data) {
        Node temp = head;
        Node holder;
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numNodes++;
    }

    public void addFirst(Object data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
    }
    public Object getFirst() {
        Node temp = head;
        return temp.data;
    }

    public void addLast(Object data) {
        Node temp = tail;
        tail = new Node(data);
        temp.next = tail;
        numNodes++;
    }

    public Object getLast() {
        Node temp = head;
        for( int i = 0; i < numNodes -1; i ++){
            temp = temp.next;
        }
        return temp.data;
    }

    public void remove(int index) {
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        numNodes--;
    }

    public boolean remove(Object data) {
        Node temp = head;
        Node previous = head;
        do {
            if (temp.data.equals(data)) {
                if (temp.equals(head)) head = head.next;
                previous.next = temp.next;
                return true;
            }
            previous = temp;
            temp = temp.next;
        } while (temp != null);
        return false;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public int size() {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            temp = temp.next;
            i++;
        }
        return i;
    }

    public MyLinkedList clonelist() {
        MyLinkedList list = new MyLinkedList(head.getData());
        Node temp = head.next;
        while (temp != null) {
            list.addLast(temp.data);
            temp = temp.next;
        }
        return list;
    }

    public int indexOf(Object data) {
        Node temp = head;
        Node previous = head;
        int i = 0;
        do {
            i++;
            if (temp.data.equals(data)) {
                if (temp.equals(head)) head = head.next;
                previous.next = temp.next;
                return i;
            }
            previous = temp;
            temp = temp.next;
        } while (temp != null);
        return 0;
    }

    public boolean contains(Object data) {
        if (indexOf(data) != 0) {
            return true;
        } else {
            return false;
        }
    }

    public Object get(int index){
        Node temp = head;
        int i = 0;
        while( temp.next != null){
            i ++;
            temp = temp.next;
            if( i == index){
                break;
            }
         }
        return temp.data;
    }

    public void clear() {
        Node temp = head;
        for( int i = 0; i < numNodes; i ++){
            temp.data = null;
            temp = temp.next;
        }
    }

    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }


}
