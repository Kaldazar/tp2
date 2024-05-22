package test.java;

import main.java.Main;
import org.junit.Test;
import java.io.File;
import java.util.*;
import java.io.FileNotFoundException;

public class MaxTestLoadFunction {

    public int[] inputArray(String filepath) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(filepath));
        String string = sc.nextLine();
        String[] sArr = string.split(" ");
        int[] arr = new int[sArr.length];
        for (int i = 0; i < sArr.length; i++) {
            arr[i] = Integer.parseInt(sArr[i]);
        }
        return arr;
    }

    @Test
    public void loadMax10() throws FileNotFoundException {
        int[] arr = inputArray("tests/load10.txt");
        long startTime, endTime;
        startTime = System.nanoTime();
        for (int i = 0; i < 100_000; i++) {
            Main._max(arr);
        }
        endTime = System.nanoTime();
        System.out.println("Поиск максимума из 10 эл-тов занял: " + ((endTime - startTime) / 100_000) + " нс.");
    }

    @Test
    public void loadMax100() throws FileNotFoundException {
        int[] arr = inputArray("tests/load100.txt");
        long startTime, endTime;
        startTime = System.nanoTime();
        for (int i = 0; i < 100_000; i++) {
            Main._max(arr);
        }
        endTime = System.nanoTime();
        System.out.println("Поиск максимума из 100 эл-тов занял: " + ((endTime - startTime) / 100_000) + " нс.");
    }

    @Test
    public void loadMax1000() throws FileNotFoundException {
        int[] arr = inputArray("tests/load1000.txt");
        long startTime, endTime;
        startTime = System.nanoTime();
        for (int i = 0; i < 100_000; i++) {
            Main._max(arr);
        }
        endTime = System.nanoTime();
        System.out.println("Поиск максимума из 1000 эл-тов занял: " + ((endTime - startTime) / 100_000) + " нс.");
    }

    @Test
    public void loadMax10000() throws FileNotFoundException {
        int[] arr = inputArray("tests/load10000.txt");
        long startTime, endTime;
        startTime = System.nanoTime();
        for (int i = 0; i < 100_000; i++) {
            Main._max(arr);
        }
        endTime = System.nanoTime();
        System.out.println("Поиск максимума из 10000 эл-тов занял: " + ((endTime - startTime) / 100_000) + " нс.");
    }

    @Test
    public void loadMax100_000() throws FileNotFoundException {
        int[] arr = inputArray("tests/load100_000.txt");
        long startTime, endTime;
        startTime = System.nanoTime();
        for (int i = 0; i < 100_000; i++) {
            Main._max(arr);
        }
        endTime = System.nanoTime();
        System.out.println("Поиск максимума из 100_000 эл-тов занял: " + ((endTime - startTime) / 100_000) + " нс.");
    }

    @Test
    public void loadMax500_000() throws FileNotFoundException {
        int[] arr = inputArray("tests/load500_000.txt");
        long startTime, endTime;
        startTime = System.nanoTime();
        for (int i = 0; i < 100_000; i++) {
            Main._max(arr);
        }
        endTime = System.nanoTime();
        System.out.println("Поиск максимума из 500_000 эл-тов занял: " + ((endTime - startTime) / 100_000) + " нс.");
    }

    @Test
    public void loadMax1_000_000() throws FileNotFoundException {
        int[] arr = inputArray("tests/load1_000_000.txt");
        long startTime, endTime;
        startTime = System.nanoTime();
        for (int i = 0; i < 100_000; i++) {
            Main._max(arr);
        }
        endTime = System.nanoTime();
        System.out.println("Поиск максимума из 1_000_000 эл-тов занял: " + ((endTime - startTime) / 100_000) + " нс.");
    }
}
