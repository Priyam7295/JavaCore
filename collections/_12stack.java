package collections;
import java.util.Stack;


public class _12stack {
    public static void main(String[] args) {
        // Stack is a data structure that follows Last In First Out (LIFO) principle
        // It is part of the Java Collections Framework
        // It is implemented using the Vector class

        Stack<Integer> st = new Stack<>();

        st.push(41);
        st.push(62);     
        st.push(13);
        st.push(34);
        st.push(55);

        // System.out.println(st.size());
        
        System.out.println(st.peek()); 
        st.pop();

        System.out.println(st.size());

        if(st.isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack is not empty");
        }


    }
}
