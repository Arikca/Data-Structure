//push operation : when we insert an item into the stack
//pop operation: when we deleyte the item from the stack
public class Stack {


    public static class Stack {
        int top;
        int maxSize;
        long[] stack;

        public Stack(int s){
            maxSize = s;
            stack = new long[maxSize];
            top = -1;
        }

        public void push(long j){

            stack[++top] = j;
        }
        public long pop(){
            return stack[top--];
        }

        public boolean isEmpty(){
            return (top == -1);
        }
        public boolean isFull(){
            return (top== maxSize-1);
        }
    }


    // how to get the min element from the stack in O(1) time and no space


    public static void main(String[] args){
        Stack st= new Stack(4);
        st.push(12);
        st.push(3);
        st.push(1);

        while(!st.isEmpty()){
            long value= st.pop();
            System.out.println(value);
        }
    }

}
