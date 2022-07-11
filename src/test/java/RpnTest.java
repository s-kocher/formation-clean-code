import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class RpnTest {

    @Test
    public void should_1_number_be_pushed_in_the_stack() {
        String expression = "3";
        Rpn rpn = new Rpn(expression);

        List<Integer> stack = rpn.getStack();

        List<Object> expected = List.of(3);
        assertThat(stack).isEqualTo(expected);
    }

    @Test
    public void should_2_numbers_be_pushed_in_the_stack() {
        String expression = "3 1";
        Rpn rpn = new Rpn(expression);

        List<Integer> stack = rpn.getStack();

        List<Object> expected = List.of(3, 1);
        assertThat(stack).isEqualTo(expected);
    }

    @Test
    public void should_2_numbers_and_a_plus_be_summed() {
        String expression = "3 1 +";
        Rpn rpn = new Rpn(expression);

        List<Integer> stack = rpn.getStack();

        List<Object> expected = List.of(4);
        assertThat(stack).isEqualTo(expected);
    }

    @Test
    public void should_2_numbers_and_a_plus_be_substracted() {
        String expression = "3 1 -";
        Rpn rpn = new Rpn(expression);

        List<Integer> stack = rpn.getStack();

        List<Object> expected = List.of(2);
        assertThat(stack).isEqualTo(expected);
    }

    @Test
    public void should_3_numbers_and_a_plus_be_summed() {
        String expression = "3 1 4 +";
        Rpn rpn = new Rpn(expression);

        List<Integer> stack = rpn.getStack();

        List<Object> expected = List.of(8);
        assertThat(stack).isEqualTo(expected);
    }


    @Test
    public void should_3_numbers_not_in_a_row_and_a_plus_be_summed() {
        String expression = "3 1 + 4 +";
        Rpn rpn = new Rpn(expression);

        List<Integer> stack = rpn.getStack();

        List<Object> expected = List.of(8);
        assertThat(stack).isEqualTo(expected);
    }

}
