/*
    - arr.push()
    - arr.pop()
    - arr.peek()
    - arr.isEmpty()
    - arr.search(value)

*/


import java.util.Stack;

public class c_Stack {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        // push() - insert in stack
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);

        // Display
        for(Integer i: s){
            System.out.print(i+" ");    // 10 20 30 40 50 
        }
        System.out.println();

        System.out.println(s);  // [10, 20, 30, 40, 50] 

        // pop() - delete
        s.pop();
        System.out.println(s);  // [10, 20, 30, 40]

        // peek() - stack top value
        int x = s.peek();
        System.out.println(x);  // 40

        // isEmpty() 
        if(!s.isEmpty()){
            System.out.println("stack is not empty!");
        }

        // search(value)    // search value: return index number
        x = s.search(30);
        System.out.println("30 is in stack: "+ x); // 2, index of search value
        
        x = s.search(99);
        System.out.println("99 is in stack: "+ x); // -1, 99 has not in stack

        
        
    }
}
