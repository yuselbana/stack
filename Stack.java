public class Stack {
    int array[] = new int[5];
    int top = 0;

    public void push(int data) {
       if(top == 5) {
        System.out.print("Stack is full");
       }else {
         array[top] =data;
        top++;
       }
    }
    

    public int pop() {
        int popped = 0;
    if(isEmpty()) {
        System.out.print("Stack is empty");
    }else {
        top--;
        popped= array[top];    
        array[top] = 0;
    }
    return popped;
    }
    public int peek() {
        int peek = array[top-1];
        return peek;
    }


    public void show() {
        for(int i=0;i<array.length;i++) {
            System.out.println(array[i]);
        }
    }
    
    public int size() {
        return top;
    }

    public boolean isEmpty() {
        return top<=0 ? true:false;
    }
  
    
}