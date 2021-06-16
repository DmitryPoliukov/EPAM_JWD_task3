package by.epamtc.poliukov.task03.task2.logic;

import by.epamtc.poliukov.task03.task2.entity.SortMethod;

public class Logic {
    private int calculateSum(int[] array) {
        int sum = 0;
        for(int element : array){
            sum += element;
        }
        return sum;
    }

    private int findMin(int[] array) {
        int min = array[0];
        for(int i = 1; i < array.length; i++){
            if(array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    private int findMax(int[] array) {
        int max = array[0];
        for(int i = 1; i < array.length; i++) {
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }

    private int[] keyArrayBySum(int [][]array){
       int[] arrayOfSumElement = new int[array.length];
       for(int i=0; i<array.length;i++){
          arrayOfSumElement[i] = calculateSum(array[i]);
       }

        return arrayOfSumElement;
    }

    private int[] keyArrayByMinElement(int [][]array){
        int[] arrayOfMinElement = new int[array.length];
        for(int i=0;i<array.length; i++){
            arrayOfMinElement[i]=findMin(array[i]);
        }
        return arrayOfMinElement;
    }
    private int[] keyArrayByMaxElement(int [][]array){
        int[] arrayOfMaxElement = new int[array.length];
        for(int i=0;i<array.length; i++){
            arrayOfMaxElement[i]=findMax(array[i]);
        }
        return arrayOfMaxElement;
    }

    private int[][] sortByKey(int[][] array, int[] keyArray){
        for (int i=0; i<array.length-1; i++){
            for (int j = array.length - 1; j > i; j--){
                if (keyArray[j-1]>keyArray[j]){
                    toSwap(keyArray, j-1,j);
                    toSwap(array, j-1, j);
                }
            }
        }
        return array;
    }
    public int[][] sortByMethod(int[][] array, SortMethod method){
        int[][]result;
        switch (method) {
            case BY_SUM :
                result = sortByKey(array, keyArrayBySum(array));
                break;
            case BY_MIN_ELEMENT:
                result = sortByKey(array, keyArrayByMinElement(array));
                break;
            default:
                result = sortByKey(array, keyArrayByMaxElement(array));
                break;
        }
        return result;
    }

    private void toSwap(int []array, int firstElement, int secondElement) {
        int temp = array[firstElement];
        array[firstElement]=array[secondElement];
        array[secondElement]=temp;
    }

    private void toSwap(int [][]array, int firstElement, int secondElement) {
        int temp[] = array[firstElement];
        array[firstElement]=array[secondElement];
        array[secondElement]=temp;
    }

    public int[][] reverseArray(int[][] array) {
        int[][] result = new int[array.length][];
        for(int i = 0; i < array.length; i++){
            result[i] = array[array.length-i-1];
        }
        return result;
    }




}
