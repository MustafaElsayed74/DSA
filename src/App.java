public class App {
    public static void main(String[] args) throws Exception {
        Stack<String> stack = new Stack<String>();
        stack.push("Mustafa");
        stack.push("Elsayed");
        // stack.push("Mustafa");
        stack.push("Ahmed");
        stack.getTop();
        stack.pop();
        stack.getTop();
        stack.print();
    }
}
