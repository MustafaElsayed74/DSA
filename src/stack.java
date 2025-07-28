
public class Stack<T> {
    final int maxSize = 100;
    int top;
    T[] item;

    // Stack Functions:
    // push(val) => add element
    // pop() => remove the last inputted element
    // isEmpty() => check if stack is empty
    // getTop() => return the top element

    public Stack() {
        top = -1;
        item = (T[]) new Object[maxSize];
    }

    public void push(T element) {
        if (top >= maxSize - 1) {
            System.out.println("stack is full on push");
        }
        item[++top] = element;
    }

    public void pop() {

        if (isEmpty())
            System.out.println("stack is empty on pop");
        top--;
    }

    public boolean isEmpty() {
        return top < 0;
    }

    public void pop(T element) {
        if (isEmpty()) {
            System.out.println("stack is empty on pop");
        } else {
            element = item[top];
            top--;
        }
    }

    public void getTop() {

        if (isEmpty()) {
            System.out.println("stack is empty on getTop");
        } else {
            System.out.println(item[top]);
        }
    }

    public void print() {
        System.out.print("[");

        for (int i = top; i >= 0; i--) {
            System.out.print(item[i] + " ");
        }
        System.out.print("]");
    }

}
