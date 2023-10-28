package org.example.homeWork1;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTest {

    public static void main(String[] args) {

        // Проверка базового функционала с целыми числами, с использованием утверждений AssertJ:
        assertThat(Calculator.calculation(2, 6, '+')).isEqualTo(8);
        assertThat(Calculator.calculation(2, 2, '-')).isEqualTo(0);
        assertThat(Calculator.calculation(2, 7, '*')).isEqualTo(14);
        assertThat(Calculator.calculation(100, 50, '/')).isEqualTo(2);


        // ДЗ Проверка ожидаемого исключения, с использованием утверждений AssertJ:

        assertThat(Calculator.calculatingDiscount(1000, 5)).isEqualTo(950);
        assertThat(Calculator.calculatingDiscount(1000,-5)).isEqualTo(1050);
        assertThat(Calculator.calculatingDiscount(1000,105)).isEqualTo(-50);

    }

}
