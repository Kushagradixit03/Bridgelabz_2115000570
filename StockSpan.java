import java.util.Stack;

public class StockSpan {

    public int[] calculateSpan(int[] prices) {
        int n = prices.length;
        int[] span = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && prices[stack.peek()] <= prices[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                span[i] = i + 1;
            } else {
                span[i] = i - stack.peek();
            }

            stack.push(i);
        }
        return span;
    }

    public static void main(String[] args) {
        StockSpan stockSpan = new StockSpan();
        int[] prices = { 100, 80, 60, 70, 60, 75, 85 };
        int[] span = stockSpan.calculateSpan(prices);

        for (int s : span) {
            System.out.print(s + " ");
        }
    }
}
