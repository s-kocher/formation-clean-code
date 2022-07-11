import java.util.ArrayList;
import java.util.List;

public class Rpn {

    private final List<Integer> stack = new ArrayList<>();

    public Rpn(String expression) {
        String[] tokens = expression.split(" ");

        for (String token : tokens) {
            if (token.equals("+")) {
                int secondElement = popStack();
                int firstElement = popStack();
                int sum = firstElement + secondElement;
                pushStack(sum);
                continue;
            }
            pushStack(parseNumber(token));
        }
    }

    private void pushStack(int number) {
        stack.add(number);
    }

    private int popStack() {
        int topElement = stack.get(stack.size() - 1);
        stack.remove(stack.size() - 1);
        return topElement;
    }

    private int parseNumber(String expression) {
        return Integer.parseInt(expression);
    }

    public List<Integer> getStack() {
        return stack;
    }

}
