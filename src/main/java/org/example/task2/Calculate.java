package org.example.task2;

import java.util.ArrayList;

public class Calculate {
    public <T> Boolean compareArrays(ArrayList<T>arrayFirst, ArrayList<T>arraySecond) {
        if (arrayFirst.size() == arraySecond.size()) {
            for (int i = 0; i < arrayFirst.size(); i++) {
                if (arrayFirst.get(i).getClass().getName().equals(arraySecond.get(i).getClass().getName())) {

                } else {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }
}
