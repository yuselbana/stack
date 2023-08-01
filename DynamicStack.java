public class DynamicStack {
    int capacity = 2;
    int stack[] = new int[capacity];
    int top = 0;

    public void push(int data) {
       if(size() == capacity) {
        expand();
       }
        stack[top] =data;
        top++;
       
    }

    public void expand() {
        int length = size();
        capacity = capacity*2;
        int newStack[] = new int[capacity];
        for(int i =0;i<length;i++) {
            newStack[i] = stack[i];
        }
        stack = newStack;
        
    }
    
    public void shrink() {
        int length = size();
        if(length<= capacity/4) {
            capacity = capacity/2;
        }
        int newStack[] = new int[capacity];
        for( int i =0;i<length;i++) {
            newStack[i] = stack[i];
        }
        stack = newStack;
    }
    public int pop() {
        int popped = 0;
    if(isEmpty()) {
        System.out.print("Stack is empty");
    }else {
        top--;
        popped= stack[top];    
        stack[top] = 0;
        shrink();
    }
    return popped;
    }
    public int peek() {
        int peek = stack[top-1];
        return peek;
    }


    public void show() {
        for(int i=0;i<stack.length;i++) {
            System.out.println(stack[i]);
        }
    }
    
    public int size() {
        return top;
    }

    public boolean isEmpty() {
        return top<=0 ? true:false;
    }
  
    
}