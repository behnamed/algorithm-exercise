package top.behnam.algorithms.sortedSquaredArray;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] array = {-6, -4, -3, 1, 2, 5, 5, 9};
        int[] result = new int[array.length];

        int startIndex = 0;
        int endIndex = array.length - 1;
        int resultIndex = array.length - 1;

        while (startIndex <= endIndex) {
            if (Math.abs(array[startIndex]) > Math.abs(array[endIndex])) {
                result[resultIndex] = (int) Math.pow(array[startIndex], 2);
                startIndex++;
            } else {
                result[resultIndex] = (int) Math.pow(array[endIndex], 2);
                endIndex--;
            }
            resultIndex--;
        }

        System.out.println(Arrays.toString(result));

    }

}