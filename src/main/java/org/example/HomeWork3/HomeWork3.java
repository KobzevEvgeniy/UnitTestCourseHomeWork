package org.example.HomeWork3;

public class HomeWork3 {

   /* Задание 1.

    Напишите тесты, покрывающие на 100% метод evenOddNumber, который проверяет, является ли
    переданное число четным или нечетным. (код приложен в презентации)*/

    public static boolean evenOddNumber(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
       // return (n % 2 == 0);
    }

    public static boolean numberInInterval(int n) {
        if (n>25 && n<100) {
            return true;
        } else {
            return false;
        }
    }


}
