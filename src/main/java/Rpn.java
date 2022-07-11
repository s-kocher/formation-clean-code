import java.util.ArrayList;
import java.util.List;

public class Rpn {
    private final List<Integer> stack = new ArrayList<>();

    public Rpn(String expression) {
        String[] tokens = expression.split(" ");

        for (String token : tokens) {
            stack.add(parseNumber(token));
        }
    }
    private int parseNumber(String expression) {
        return Integer.parseInt(expression);
    }

    public List<Integer> getStack() {
        return stack;
    }

}
