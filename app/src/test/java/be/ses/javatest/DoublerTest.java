package be.ses.javatest;

import org.junit.Test;
import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.*;

public class DoublerTest {
  @Test
  public void gegevenOperationDivideX2Y1_wanneerDoubleCalculator_danResultIs4() {
    Calculator calculatorMock = mock(Calculator.class);
    when(calculatorMock.divide(2f, 1f)).thenReturn(2.0f);

    Doubler doubler = new Doubler();
    float result = doubler.divide(calculatorMock, 2.0f, 1.0f);

    assertThat(result).isEqualTo(4.0f).withFailMessage("result was " + result + " but expected 4.0.");
    verify(calculatorMock).divide(2f, 1f);
  }
}