
public class DataStructures {
    public static void main(String[] args) {
        Node<Integer> first = new Node<>(56);
        Node<Integer> second = new Node<>(30);
        first.next = second;
        Node<Integer> third = new Node<>(70);
        second.next = third;
        System.out.println(first.data);
        System.out.println(first.next.data);
        System.out.println(second.next.data);
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