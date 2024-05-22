package test.java;

import main.java.Main;
import static org.junit.Assert.*;
import org.junit.Test;
import java.io.File;
import java.util.*;
import java.io.FileNotFoundException;

public class SumTestLoadFunction {

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
    public void loadSum10() throws FileNotFoundException {
        int[] arr = inputArray("tests/load10.txt");
        long startTime, endTime;
        startTime = System.nanoTime();
        for (int i = 0; i < 100_000; i++) {
            Main._sum(arr);
        }
        endTime = System.nanoTime();
        System.out.println("Вычисление суммы из 10 эл-тов заняло: " + ((endTime - startTime) / 100_000) + " нс.");
    }

    @Test
    public void loadSum100() throws FileNotFoundException {
        int[] arr = inputArray("tests/load100.txt");
        long startTime, endTime;
        startTime = System.nanoTime();
        for (int i = 0; i < 100_000; i++) {
            Main._sum(arr);
        }
        endTime = System.nanoTime();
        System.out.println("Вычисление суммы из 100 эл-тов заняло: " + ((endTime - startTime) / 100_000) + " нс.");
    }

    @Test
    public void loadSum1000() throws FileNotFoundException {
        int[] arr = inputArray("tests/load1000.txt");
        long startTime, endTime;
        startTime = System.nanoTime();
        for (int i = 0; i < 100_000; i++) {
            Main._sum(arr);
        }
        endTime = System.nanoTime();
        System.out.println("Вычисление суммы из 1000 эл-тов заняло: " + ((endTime - startTime) / 100_000) + " нс.");
    }

    @Test
    public void loadSum10000() throws FileNotFoundException {
        int[] arr = inputArray("tests/load10000.txt");
        long startTime, endTime;
        startTime = System.nanoTime();
        for (int i = 0; i < 100_000; i++) {
            Main._sum(arr);
        }
        endTime = System.nanoTime();
        System.out.println("Вычисление суммы из 10000 эл-тов заняло: " + ((endTime - startTime) / 100_000) + " нс.");
    }

    @Test
    public void loadSum100_000() throws FileNotFoundException {
        int[] arr = inputArray("tests/load100_000.txt");
        long startTime, endTime;
        startTime = System.nanoTime();
        for (int i = 0; i < 100_000; i++) {
            Main._sum(arr);
        }
        endTime = System.nanoTime();
        System.out.println("Вычисление суммы из 100_000 эл-тов заняло: " + ((endTime - startTime) / 100_000) + " нс.");
    }

    @Test
    public void loadSum500_000() throws FileNotFoundException {
        int[] arr = inputArray("tests/load500_000.txt");
        long startTime, endTime;
        startTime = System.nanoTime();
        for (int i = 0; i < 100_000; i++) {
            Main._sum(arr);
        }
        endTime = System.nanoTime();
        System.out.println("Вычисление суммы из 500_000 эл-тов заняло: " + ((endTime - startTime) / 100_000) + " нс.");
    }

    @Test
    public void loadSum1_000_000() throws FileNotFoundException {
        int[] arr = inputArray("tests/load1_000_000.txt");
        long startTime, endTime;
        startTime = System.nanoTime();
        for (int i = 0; i < 100_000; i++) {
            Main._sum(arr);
        }
        endTime = System.nanoTime();
        System.out.println("Вычисление суммы из 1_000_000 эл-тов заняло: " + ((endTime - startTime) / 100_000) + " нс.");
    }
}
