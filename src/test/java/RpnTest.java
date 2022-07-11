import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class RpnTest {

    @Test
    public void should_a_string_number_containing_a_number_get_the_number() {
        String expression = "3";
        Rpn rpn = new Rpn(expression);

        int result = rpn.getResult();

        assertThat(result).isEqualTo(3);
    }

}
