package org.example.task1;
/*Написать класс Калькулятор (необобщенный), который содержит обобщенные статические методы:
        * sum(), multiply(), divide(), subtract().
        * Параметры этих методов – два числа разного типа, над которыми должна быть произведена операция.
* Методы должны возвращать результат своей работы.
*/
public class Calculate {
    public static <T extends Number> double sum(T num1, T num2){
        return num1.doubleValue() + num2.doubleValue();
    }

    public static <T extends Number> double multiply(T num1, T num2){
        return num1.doubleValue() - num2.doubleValue();
    }

    public static <T extends Number> double divide(T num1, T num2){
        return num1.doubleValue() / num2.doubleValue();
    }

    public static <T extends Number> double subsctruct(T num1, T num2){
        return num1.doubleValue() * num2.doubleValue();
    }
}
