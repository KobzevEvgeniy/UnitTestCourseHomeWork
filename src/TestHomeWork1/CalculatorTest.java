import org.example.homeWork1.Calculator;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CalculatorTest {


        @Test
        void additionExpressionEvaluation() {
            Calculator calculator = new Calculator();
            assertThat(calculator.calculation(2,6,'+')).isEqualTo(8);
        }
        @Test
        void subtractionExpressionEvaluation () {
            Calculator calculator = new Calculator();
            assertThat(calculator.calculation(2,2,'-')).isEqualTo(0);
        }
        @Test
        void multiplicationExpressionEvaluation () {
            Calculator calculator = new Calculator();
            assertThat(calculator.calculation(2,7,'*')).isEqualTo(14);
        }
        @Test
        void divisionExpressionEvaluation () {
            Calculator calculator = new Calculator();
            assertThat(calculator.calculation(100,90,'/')).isEqualTo(2);
        }
        @Test
        void expectedIllegalStateExceptionOnInvalidOperatorSymbol ()
        {
            Calculator calculator = new Calculator();
            assertThatThrownBy(() ->
                    calculator.calculation(8,4,'_'))
                    .isInstanceOf(IllegalStateException.class);
        }
    }

//    public static void main(String[] args) {
//
//        // Проверка базового функционала с целыми числами, с использованием утверждений AssertJ:
//        Assertions.assertThat(Calculator.calculation(2, 6, '+')).isEqualTo(8);
//        assertThat(Calculator.calculation(2, 2, '-')).isEqualTo(0);
//        assertThat(Calculator.calculation(2, 7, '*')).isEqualTo(14);
//        assertThat(Calculator.calculation(100, 50, '/')).isEqualTo(2);
//
//
//        // ДЗ Проверка ожидаемого исключения, с использованием утверждений AssertJ:
//
//        assertThat(Calculator.calculatingDiscount(1000, 5)).isEqualTo(950);
//        assertThat(Calculator.calculatingDiscount(1000,-5)).isEqualTo(1050);
//        assertThat(Calculator.calculatingDiscount(1000,105)).isEqualTo(-50);
//
//    }


