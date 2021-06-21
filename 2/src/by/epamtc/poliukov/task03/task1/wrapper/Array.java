package by.epamtc.poliukov.task03.task1.wrapper;

import by.epamtc.poliukov.task03.task1.exception.IncorrectIndexException;
import by.epamtc.poliukov.task03.task1.exception.NonValidArrayException;

import java.io.Serializable;
import java.util.Arrays;

public class Array implements Serializable {
    private static final long serialVersionUID = 1L;

    private static final int DEFAULT_ARRAY_LENGTH = 5;
    private static final int MIN_ARRAY_LENGTH = 0;
    private int[] data;
    private int length;
    private int currentLenght = 0;

    public Array() {
        data = new int[DEFAULT_ARRAY_LENGTH];
    }

    public Array(int length) {
        if (length < MIN_ARRAY_LENGTH) {
            length = MIN_ARRAY_LENGTH;
        }
        data = new int[length];
    }

    public Array(int[] data) throws NonValidArrayException {
        if (!isArrayValid(data)) {
            throw new NonValidArrayException("Array can't be null");
        }
        this.data = data;
        this.length = data.length;
    }
    public int[] getData() {
        return data;
    } //sorry for that, it's wrong


    private boolean isArrayValid(int[] data) {
        return data != null;
    }

    public int getLength() {
        return data.length;
    }
    public void add(int number)  {
        if(currentLenght < length) {
            data[currentLenght] = number;
            currentLenght++;
        }
    }

    public void add(int number, int index)  {
        if(index < length-1 && index > 0) {
            data[index] = number;
        }
    }

    public static int getDefaultArrayLength() {
        return DEFAULT_ARRAY_LENGTH;
    }

    public static int getMinArrayLength() {
        return MIN_ARRAY_LENGTH;
    }

    public int getElement(int index) throws IncorrectIndexException {
        if (index >= data.length || index < 0) {
            throw new IncorrectIndexException("Incorrect index of element");
        }
        return data[index];
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Array array = (Array) o;
        return Arrays.equals(data, array.data);
    }

    @Override
    public int hashCode() {
        final int prime = 27;
        int result = 1;
        result = prime * result + Arrays.hashCode(data);
        return result;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " [data=" + Arrays.toString(data) + "]";
    }
}
