package org.example.task2;

import java.util.ArrayList;
import java.util.Objects;

/*Напишите обобщенный метод compareArrays(), который принимает два массива и возвращает true,
* если они одинаковые, и false в противном случае. Массивы могут быть любого типа данных,
* но должны иметь одинаковую длину и содержать элементы одного типа по парно по индексам.
*/
public class Main {
    public static void main(String[] args){
        Calculate calculate = new Calculate();
        ArrayList<Object>arrayFirst = new ArrayList<>();
        arrayFirst.add("white");
        arrayFirst.add(2);
        arrayFirst.add("yellow");

        ArrayList<Object>arraySecond = new ArrayList<>();
        arraySecond.add("one");
        arraySecond.add(4);
        arraySecond.add(15);

        System.out.println(calculate.compareArrays(arrayFirst, arraySecond));
    }

}