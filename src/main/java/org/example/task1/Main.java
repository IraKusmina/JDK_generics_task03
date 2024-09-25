package org.example.task1;

/*Напишите обобщенный метод compareArrays(), который принимает два массива и возвращает true,
* если они одинаковые, и false в противном случае. Массивы могут быть любого типа данных,
* но должны иметь одинаковую длину и содержать элементы одного типа по парно по индексам.
Напишите обобщенный класс Pair, который представляет собой пару значений разного типа.
* Класс должен иметь методы getFirst(), getSecond() для получения значений каждого из составляющих пары,
* а также переопределение метода toString(), возвращающее строковое представление пары.
* Работу сдать в виде ссылки на гит репозиторий.
*/
public class Main {
    public static void main(String[] args){
        Calculate calculate = new Calculate();
        System.out.println("Результат операции sum: " + calculate.sum(2, 1.5));
        System.out.println("Результат операции multiply: " + calculate.multiply(2, 1.5));
        System.out.println("Результат операции divide: " + calculate.divide(2, 1.5));
        System.out.println("Результат операции subsctruct: " + calculate.subsctruct(2, 1.5));
    }

}