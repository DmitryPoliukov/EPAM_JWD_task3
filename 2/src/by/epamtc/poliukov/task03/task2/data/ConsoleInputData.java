package by.epamtc.poliukov.task03.task2.data;

import by.epamtc.poliukov.task03.task2.entity.SortMethod;
import by.epamtc.poliukov.task03.task2.input.InputScanner;

public class ConsoleInputData {
    InputScanner inputScanner = new InputScanner();
    public int[][] enterArray() {
        int [][] result;
        int inputLength = enterArrayLength("Enter jagged array length");
        result = new int[inputLength][];
        for(int i = 0; i < result.length;i++) {
            int subarrayLength = enterArrayLength(String.format("Enter subarray №%d length", i+1));
            result[i] = new int[subarrayLength];
            for(int j = 0; j < result[i].length; j++) {
                result[i][j] = inputScanner.intScanner(String.format("Enter subarray №%d element №%d",i+1, j+1));
            }
        }
        return result;
    }

    public int enterArrayLength(String message){
        int arrayLength = inputScanner.intScanner(message);
        while(!(arrayLength>0)) {
            System.out.println("Array length must be positive number");
            arrayLength = inputScanner.intScanner(message);
        }
        return arrayLength;
    }

    public SortMethod method (){
        SortMethod method= null;
        String inputString = inputScanner.stringScanner("Enter the method of sort:\n" +
                "sum -- to sort by the sum of elements in a subarray\n" +
                "min -- to sort by the minimum value of element in a subarray\n" +
                "max -- to sort by the minimum value of element in a subarray");
        switch (inputString){
            case "sum":
                method = SortMethod.BY_SUM;
                break;
            case "min":
                method = SortMethod.BY_MIN_ELEMENT;
                break;
            case "max":
                method = SortMethod.BY_MAX_ELEMENT;
                break;
            default:
                System.out.println("Incorrect input");
                method();
        }
        return method;
    }



}
