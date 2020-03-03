package Q2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        System.out.println(decompressArray(RandomArrayGenerator.createArray(6)));
    }

    public static List<Integer> decompressArray(int[] array) {
        printArray(array);
        List<Integer> list = new ArrayList<>();
        List<Integer> temporaryList = new ArrayList<>();
        int index = 0;

        while ((array.length - index) != 1 && index<array.length) {
            for (int i = 0; i < array[index]; i++) {
                temporaryList.add(array[index + 1]);
            }
            list.addAll(temporaryList);
            index+=2;
        }
        return list;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(" "+array[i]+" ");
        }
        System.out.println();
    }
}


