package by.epamtc.poliukov.task03.task1.validator;

import by.epamtc.poliukov.task03.task1.wrapper.Array;

public class Validator {

    public static boolean isNull(Array array) {
        return array.getData() == null;
    }

    public static boolean isOutOfBounds(int[] array, int index) {
        return (index >= array.length || index < 0);
    }
}
