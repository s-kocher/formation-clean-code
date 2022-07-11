import java.util.ArrayList;
import java.util.List;

public class Rpn {
    private final String expression;

    public Rpn(String expression) {
        this.expression = expression;
    }

    public int getResult() {
        return parseNumber(expression);
    }

    private int parseNumber(String expression) {
        return Integer.parseInt(expression);
    }

    public List<Object> getStack() {
        String[] tokens = expression.split(" ");
        List<Object> stack = new ArrayList<>();

        for (String token : tokens) {
            stack.add(parseNumber(token));
        }

        return stack;
    }

}
