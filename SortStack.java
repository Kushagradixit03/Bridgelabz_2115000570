import java.util.Stack;

public class SortStack {

    public void sort(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }
        
        int temp = stack.pop();
        sort(stack);
        insertSorted(stack, temp);
    }

    private void insertSorted(Stack<Integer> stack, int element) {
        if (stack.isEmpty() || stack.peek() <= element) {
            stack.push(element);
            return;
        }

        int top = stack.pop();
        insertSorted(stack, element);
        stack.push(top);
    }

    public static void main(String[] args) {
        SortStack sorter = new SortStack();
        Stack<Integer> stack = new Stack<>();

        stack.push(34);
        stack.push(3);
        stack.push(31);
        stack.push(98);
        stack.push(92);
        stack.push(23);

        sorter.sort(stack);

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
