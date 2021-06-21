package by.epamtc.poliukov.task03.task1.service;

import by.epamtc.poliukov.task03.task1.validator.Validator;
import by.epamtc.poliukov.task03.task1.wrapper.Array;
import by.epamtc.poliukov.task03.task1.exception.NonValidArrayException;

import java.util.ArrayList;
import java.util.List;

import static by.epamtc.poliukov.task03.task1.validator.Validator.isNull;

public class ArraySearchService {
    Validator validator = new Validator();

    public int binarySearch(Array array, int elementToSearch) {
        return binarySearch(array.getData(), elementToSearch);
    }


    private int binarySearch(int[] sortArray, int elementToSearch) {
        int firstIndex = 0;
        int lastIndex = sortArray.length - 1;

        while(firstIndex <= lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;
            if (sortArray[middleIndex] == elementToSearch) {
                return middleIndex;
            }

            else if (sortArray[middleIndex] < elementToSearch)
                firstIndex = middleIndex + 1;

            else if (sortArray[middleIndex] > elementToSearch)
                lastIndex = middleIndex - 1;

        }
        return -1;
    }

    public int findMaxElement(Array array) throws NonValidArrayException {
        if (isNull(array)) {
            throw new NonValidArrayException("Array can't be null");
        }
        int[] data = array.getData();
        int max = data[0];
        for(int element: data) {
            if(element > max) {
                max = element;
            }
        }
        return max;
    }


    public int findMinElement(Array array) throws NonValidArrayException {
        if (isNull(array)) {
            throw new NonValidArrayException("Array can't be null");
        }
        int[] data = array.getData();
        int min = data[0];
        for(int element: data) {
            if(element < min) {
                min = element;
            }
        }
        return min;
    }

    public List<Integer> primeNumbersInArray(Array array) throws NonValidArrayException {
        if (isNull(array)) {
            throw new NonValidArrayException("Array can't be null");
        }

        List<Integer> primeNumbersInArray = new ArrayList<>();
        int[] data = array.getData();
        for(int element: data) {
            if(isPrime(element)) {
                primeNumbersInArray.add(element);
            }
        }
        return primeNumbersInArray;
    }

    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= (int) Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public  List<Integer> searchFibonacciNumbers(Array array) throws NonValidArrayException {
        List<Integer> fibonacciNumbers = new ArrayList<>();
        int[] data = array.getData();
        if (isNull(array)) {
            throw new NonValidArrayException("Array can't be null");
        }

        for(int element: data) {
            if(isFibonacciNumber(element)) {
                fibonacciNumbers.add(element);
            }
        }
        return fibonacciNumbers;
    }

    private boolean isFibonacciNumber(int number) {
        if (number < 0) {
            return false;
        }

        if (number == 0 || number == 1) {
            return true;
        }
        int previous = 1;
        int current = 2;

        while (current < number) {
            int temp = current;
            current = current + previous;
            previous = temp;
        }
        return current == number;
    }

    public List<Integer> search3UniqueDigitNumber(Array array) {
        int[] data = array.getData();
        List<Integer> search3UniqueDigitNumber = new ArrayList<>();
        for(int element: data) {
            if(is3UniqueDigit(element)) {
                search3UniqueDigitNumber.add(element);
            }
        }
        return search3UniqueDigitNumber;
    }

    private boolean is3UniqueDigit(int number) {
        if(!(number >= 100 && number <= 999)) {
            return false;
        }

        int firstDigit = number / 100;
        int secondDigit = (number / 10) % 10;
        int thirdDigit = number % 10;
        boolean result = firstDigit != secondDigit && firstDigit != thirdDigit && secondDigit != thirdDigit;
        return result;
    }








}
