import java.util.ArrayList;
import java.util.List;

public class Rpn {

    private final List<Integer> stack = new ArrayList<>();

    public Rpn(String expression) {
        String[] tokens = expression.split(" ");

        for (String token : tokens) {
            if (token.equals("+")) {
                int sum = sumStack();
                pushStack(sum);
                continue;
            }
            pushStack(parseNumber(token));
        }
    }

    private int sumStack() {
        int sum = 0;
        while(stack.size() > 0) {
            sum = sum + popStack();
        }

        return sum;
    }

    private void pushStack(int number) {
        stack.add(number);
    }

    private int popStack() {
        int lastStackIndex = stack.size() - 1;
        int topElement = stack.get(lastStackIndex);
        stack.remove(lastStackIndex);
        return topElement;
    }

    private int parseNumber(String expression) {
        return Integer.parseInt(expression);
    }

    public List<Integer> getStack() {
        return stack;
    }

}
