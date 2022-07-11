import org.junit.jupiter.api.Test;

import java.util.Arrays;
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
    public void should_1_number_be_pushed_in_the_stack() {
        String expression = "3";
        Rpn rpn = new Rpn(expression);

        List<Object> stack = rpn.getStack();

        List<Object> expected = List.of(3);
        assertThat(stack).isEqualTo(expected);
    }

    @Test
    public void should_2_numbers_be_pushed_in_the_stack() {
        String expression = "3 1";
        Rpn rpn = new Rpn(expression);

        List<Object> stack = rpn.getStack();

        List<Object> expected = List.of(3, 1);
        assertThat(stack).isEqualTo(expected);
    }

}
