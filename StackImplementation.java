public class StackImplementation {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(70);
        st.push(30);
        st.push(56);
        while (!st.isEmpty()){
            System.out.println(st.peek());
            st.pop();
        }
    }
}

class Stack <T>{
    LinkedList<T> ll;
    Stack(){
        ll = new LinkedList<>();
    }
    public void push(int data){
        ll.add(data);
    }
    public int peek(){
        return ll.getFirstElement();
    }
    public void pop(){
        ll.pop();
    }
    public boolean isEmpty(){
        return ll.isEmpty();
    }
}
