
public class DataStructures {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.append(56);
        ll.append(70);
        ll.insertAfter(56,30);
        ll.print();
    }
}
class LinkedList<T>{
    Node<T> head, tail;
    LinkedList(){
        head=null;
        tail=null;
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
    public void add(int data){   // adding nodes to the front of linked list
        if(head == null && tail == null){
            head = new Node<>(data);
            tail = head;
        }
        else{
            Node<T> newNode = new Node<>(data);
            newNode.next = head;
            head = newNode;
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