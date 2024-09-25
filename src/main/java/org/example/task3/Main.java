package org.example.task3;

import java.awt.*;
import java.util.ArrayList;

/*Напишите обобщенный класс Pair, который представляет собой пару значений разного типа.
* Класс должен иметь методы getFirst(), getSecond() для получения значений каждого из составляющих пары,
* а также переопределение метода toString(), возвращающее строковое представление пары.
* Работу сдать в виде ссылки на гит репозиторий.
*/
public class Main {
    public static void main(String[] args){
        Pair<Integer, String> pairFirst = new Pair<>(2, "something");
        System.out.println("pairFirst = " + pairFirst);
        System.out.println("pairFirts.getFirst = " + pairFirst.getFirst());
        System.out.println("pairFirst.getSecond = " + pairFirst.getSecond());
    }

}