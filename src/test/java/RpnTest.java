import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class RpnTest {

    @Test
    public void should_a_string_number_containing_a_number_get_the_number() {
        Rpn rpn = new Rpn("3");

        int result = rpn.getResult();

        assertThat(result).isEqualTo(3);
    }

    @Test
    public void should_2_numbers_be_pushed_in_the_stack() {
        String expression = "3";
        Rpn rpn = new Rpn(expression);

        List<Object> stack = rpn.getStack();

        assertThat(stack.size()).isEqualTo(1);
        assertThat(stack.get(0)).isEqualTo(3);
    }

}
