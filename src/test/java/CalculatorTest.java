import com.res.app.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorTest {

  Calculator calculator;

  @BeforeEach
  public void setup(){
    calculator = new Calculator();
  }

  @Test
  public void testMultiply(){
      assertEquals(20,calculator.multiply(4,5));
  }
}
