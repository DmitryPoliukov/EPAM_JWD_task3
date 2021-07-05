package by.epamtc.poliukov.task03.task2.presentation;

import java.util.Arrays;

/**
 * The Class ArrayPresentation prints the array to the console.
 *
 * @author Dmitry Poliukov
 */
public class ArrayPresentation {

    public void printArray(int[][] array){
        for(int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }
}
