public class App {
    public static void main(String[] args) throws Exception {
        Stack stack = new Stack();
        stack.push(12);
        stack.push(13);
        stack.push(34);
        stack.push(45);
        stack.getTop();
        stack.pop();
        stack.getTop();
        stack.print();
    }
}
