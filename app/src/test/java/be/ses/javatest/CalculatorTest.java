package be.ses.javatest;

import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

public class CalculatorTest {
    @Test
    public void gegevenTeller2Noemer1_wanneerDivide_danResult2() {
        // 1. Arrange
        Calculator calculator = new Calculator();

        // 2. Act
        Float result = calculator.divide(2.0f, 1.0f);
        System.out.println(result);

        // 3. Assert
        assertThat(result).isEqualTo(2.0f);
    }

    @Test
    public void gegevenTeller2Noemer4_wanneerDivide_danResult0point5() {
        // 1. Arrange
        Calculator calculator = new Calculator();

        // 2. Act
        Float result = calculator.divide(2.0f, 4.0f);
        System.out.println(result);

        // 3. Assert
        assertThat(result).isEqualTo(0.5f);
    }

    @Test
    public void gegevenTellerXNoemer0_wanneerDivide_danDivideByZeroException() {
        // when
        Throwable thrown = catchThrowable(() -> {
            // 1. Arrange
            Calculator calculator = new Calculator();

            // 2. Act
            calculator.divide(2.0f, 0.0f);
        });

        // 3. Assert
        assertThat(thrown)
                .isInstanceOf(ArithmeticException.class)
                .hasMessageContaining("/ by zero");
    }

    @Test
    public void gegevenXGelijkAan25_wanneerSquareRoot_danResult5() {
        // 1. Arrange
        Calculator calculator = new Calculator();

        // 2. Act
        Double result = calculator.squareRoot(25.0f);
        System.out.println(result);

        // 3. Assert
        assertThat(result).isEqualTo(5.0f);
    }

    @Test
    public void gegevenXKleinerDan0_wanneerSqaureRoot_danKleinerDan0Exception() {
        // when
        Throwable thrown = catchThrowable(() -> {
            // 1. Arrange
            Calculator calculator = new Calculator();

            // 2. Act
            calculator.squareRoot(-2.0f);
        });

        // 3. Assert
        assertThat(thrown)
                .isInstanceOf(ArithmeticException.class)
                .hasMessageContaining("Root smaller than zero");
    }

    @Test
    public void gegevenXGelijkAan0_wanneerSqaureRoot_danGelijkAan0Exception() {
        // when
        Throwable thrown = catchThrowable(() -> {
            // 1. Arrange
            Calculator calculator = new Calculator();

            // 2. Act
            calculator.squareRoot(0.0f);
        });

        // 3. Assert
        assertThat(thrown)
                .isInstanceOf(ArithmeticException.class)
                .hasMessageContaining("Root of zero");
    }
}
