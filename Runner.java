public class Runner {
    public static void main(String []args) {
        Stack stack = new Stack();
        DynamicStack dStack = new DynamicStack();
    dStack.push(1);
    dStack.push(2);
    dStack.push(3);
    dStack.push(4);
        dStack.push(1);

       dStack.show();
    }
}