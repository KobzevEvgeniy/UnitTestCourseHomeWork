package org.example.homeWork1;

public class Calculator {

    public static int calculation(int firstOperand, int secondOperand, char operator) {
        int result;

        switch (operator) {
            case '+':
                result = firstOperand + secondOperand;
                break;
            case '-':
                result = firstOperand - secondOperand;
                break;
            case '*':
                result = firstOperand * secondOperand;
                break;
            case '/':
                if (secondOperand != 0) {
                    result = firstOperand / secondOperand;
                    break;
                } else {
                    throw new ArithmeticException("Division by zero is not possible");
                }
            default:
                throw new IllegalStateException("Unexpected value operator: " + operator);
        }
        return result;
    }

    // HW1.1: Придумайте и опишите (можно в псевдокоде) функцию извлечения корня и
    // необходимые проверки для него используя граничные случаи
    public static double squareRootExtraction(double num) {
        //  0
        //  Отрицательные числа
        //  Дробные значения корней
        //  Целые
        if(num < 0) {
            throw new IllegalArgumentException("Cannot calculate square root of a negative number");
        }
        return Math.sqrt(num);
    }


    // Домашняя работа №1
    // Нужно написать в калькуляторе метод вычисления суммы покупки со скидкой и проверить его, используя AssertJ
    // Примерная сигнатура и тело метода:
    public static double calculatingDiscount(double purchaseAmount, int discountAmount) {
        // purchaseAmount - сумма покупки
        // discountAmount - размер скидки
        double discountAmountsum;
        if (purchaseAmount<0){
            throw new ArithmeticException("Сумма покупки не может быть меньше 0");
        }
        if (discountAmount>100){
            throw new ArithmeticException("Скидка не может быть больше 100%");
        }
        if (discountAmount<0){
            throw new ArithmeticException("Скидка не может быть назначена отрицательным числом");
        }else {
            discountAmountsum = purchaseAmount - purchaseAmount / 100 * discountAmount;
        }
        return discountAmountsum; // Метод возвращает сумму покупки со скидкой

    }



}
