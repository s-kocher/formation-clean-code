public class Rpn {
    private final String expression;

    public Rpn(String expression) {
        this.expression = expression;
    }

    public int getResult() {
        return Integer.parseInt(expression);
    }

}
