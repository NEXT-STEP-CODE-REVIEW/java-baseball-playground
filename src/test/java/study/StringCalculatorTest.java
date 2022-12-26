package study;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

public class StringCalculatorTest {

    @ParameterizedTest
    @ValueSource(strings = {"+", "-", "*", "/"})
    void test1(String input) {
        StringCalculator sc = new StringCalculator();
        assertThat(sc.isExpresion(input)).isTrue();
    }
}
