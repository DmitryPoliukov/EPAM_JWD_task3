package by.epamtc.poliukov.task03.task2.сomparator;

import java.util.Comparator;

public class BySumComparator implements Comparator<int[]> {
    @Override
    public int compare(int[] o1, int[] o2) {
        int result = 0;
        if(calculateSum(o1) > calculateSum(o2)){
            result = 1;
        }
        else if (calculateSum(o1) < calculateSum(o2)) {
            result = -1;
        }
        return result;
    }

    private int calculateSum(int[] array) {
        int sum = 0;
        for(int element : array){
            sum += element;
        }
        return sum;
    }
}
