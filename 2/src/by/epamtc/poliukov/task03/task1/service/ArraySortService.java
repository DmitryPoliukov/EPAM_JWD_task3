package by.epamtc.poliukov.task03.task1.service;

import by.epamtc.poliukov.task03.task1.wrapper.Array;

/**
 * The Class ArraySortService contains methods for sorting Array array by selection sort, merge sort, quick sort.
 *
 * @author Dmitry Poliukov
 */
public class ArraySortService {

    public void selectionSortArray(Array array){
    selectionSortArray(array.getData());
    }

    private void selectionSortArray(int[] data) {
        for(int i = 0; i < data.length; i++) {
            int min = data[i];
            for (int j = i; j < data.length; j++) {
                if(data[j] < min) {
                    min = data[j];
                    int indexMin = j;
                    toSwap(data, i, indexMin);
                }
            }
        }
    }


    public void mergeSortArray (Array array) {
        mergeSortArray(array.getData(), 0, array.getLength()-1);
    }

    private void mergeSortArray (int[] data, int left, int right) {
        int delimiter = left + ((right - left) / 2) + 1;
        if (delimiter > 0 && right > (left + 1)) {
            mergeSortArray(data, left, delimiter - 1);
            mergeSortArray(data, delimiter, right);
        }
        int[] buffer = new int[right - left + 1];

        int cursor = left;
        for (int i = 0; i < buffer.length; i++) {

            if (delimiter > right || data[cursor] < data[delimiter]) {
                buffer[i] = data[cursor];
                cursor++;
            } else {
                buffer[i] = data[delimiter];
                delimiter++;
            }
        }
        System.arraycopy(buffer, 0, data, left, buffer.length);
    }


    public void quickSort(Array array) {
        quickSort(array.getData(), 0, array.getLength()-1);
    }

    private void quickSort(int[] data, int leftBorder, int rightBorder) {
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        int pivot = data[(leftMarker + rightMarker) / 2];
        do {
            while (data[leftMarker] < pivot) {
                leftMarker++;
            }
            while (data[rightMarker] > pivot) {
                rightMarker--;
            }
            if (leftMarker <= rightMarker) {
                if (leftMarker < rightMarker) {
                    int tmp = data[leftMarker];
                    data[leftMarker] = data[rightMarker];
                    data[rightMarker] = tmp;
                }
                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);

        if (leftMarker < rightBorder) {
            quickSort(data, leftMarker, rightBorder);
        }
        if (leftBorder < rightMarker) {
            quickSort(data, leftBorder, rightMarker);
        }
    }


    private void toSwap(int []array, int firstElement, int secondElement ) {
        int temp = array[firstElement];
        array[firstElement]=array[secondElement];
        array[secondElement]=temp;
    }

}
