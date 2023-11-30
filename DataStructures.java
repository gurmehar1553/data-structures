
public class DataStructures {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.addSortedLL(56);
        ll.addSortedLL(30);
        ll.addSortedLL(40);
        ll.addSortedLL(70);
        ll.print();
    }
}
class LinkedList<T>{
    Node<T> head, tail;
    LinkedList(){
        head=null;
        tail=null;
    }
    public boolean isEmpty(){
        if(head == null ){
            return true;
        }
        return false;
    }
    public int getFirstElement(){
        return head.data;
    }
    public void append(int data){
        if(head==null && tail == null){
            head = new Node<>(data);
            tail = head;
        }
        else {
            Node<T> newNode = new Node<>(data);
            tail.next = newNode;
            tail = newNode;
        }
    }
    public void add(int data){
        if(head == null){
            head = new Node<>(data);
            tail = head;
        }
        else{
            Node<T> newNode = new Node<>(data);
            newNode.next = head;
            head = newNode;
        }
    }
    public void addSortedLL(int data){   // adding nodes in sorted order
        if(head == null && tail == null){
            head = new Node<>(data);
            tail = head;
        }
        else{
            Node<T> newNode = new Node<>(data);
            Node<T> ptr=head;
            if(head.data > data){
                newNode.next = head;
                head = newNode;
            }
            else {
                while (ptr.next!=null && ptr.next.data < data){
                    ptr = ptr.next;
                }
                if(ptr.next == null){
                    ptr.next = newNode;
                    tail = newNode;
                }
                else {
                    newNode.next = ptr.next;
                    ptr.next = newNode;
                }
            }

        }
    }
    public void insertAfter(int data,int newData){
        Node<T> ptr=head;
        Node<T> newNode = new Node<>(newData);
        while (ptr!=null && ptr.data != data){
            ptr = ptr.next;
        }
        if(ptr != null){
            Node<T> tem = ptr.next;
            ptr.next = newNode;
            newNode.next = tem;
        }
    }
    public void pop(){
        if(head != null){
            head = head.next;
        }
        else {
            System.out.println("Empty Linked List");
        }
    }

    public void popLast(){
        if(tail != null){
            Node<T> ptr = head;
            while (ptr.next!= null && ptr.next.next != null){
                ptr = ptr.next;
            }
            ptr.next = null;
            tail = ptr;
        }
    }
    public void searchNode(int data){
        Node<T> ptr=head;
        while (ptr != null && ptr.data !=data){
            ptr = ptr.next;
        }
        if(ptr != null){
            System.out.println("Data found");
        }
        else{
            System.out.println("Data not found");
        }
    }
    public void deleteNode(int data){
        Node<T> ptr=head;
        while (ptr.next != null && ptr.next.data != data){
            ptr = ptr.next;
        }
        if(ptr.next != null){
            ptr.next = ptr.next.next;
        }
    }
    public int size(){
        Node<T> ptr=head;
        int cnt = 0;
        while (ptr != null){
            cnt++;
            ptr = ptr.next;
        }
        return cnt;
    }
    public void print(){
        Node<T> ptr=head;
        while (ptr != null){
            System.out.print(ptr.data+" -> ");
            ptr = ptr.next;
        }
        System.out.println("null");
    }
}
class Node <T>{
    int data;
    Node<T> next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}