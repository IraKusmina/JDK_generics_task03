package org.example.task3;

/*Напишите обобщенный класс Pair, который представляет собой пару значений разного типа.
 * Класс должен иметь методы getFirst(), getSecond() для получения значений каждого из составляющих пары,
 * а также переопределение метода toString(), возвращающее строковое представление пары.
 * Работу сдать в виде ссылки на гит репозиторий.
 */
public class Pair <T, U> {
    private T first;
    private U second;

    public Pair(T one, U two){
        this.first = one;
        this.second = two;
    }
    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return first.toString() + " " + second.toString();
    }
}
