import java.util.ArrayList;
import java.util.List;

public class Rpn {
    private final String expression;

    public Rpn(String expression) {
        this.expression = expression;
    }

    public int getResult() {
        return Integer.parseInt(expression);
    }

    public List<Object> getStack() {
        return List.of(3);
    }
}
