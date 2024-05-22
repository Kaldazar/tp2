package test.java;

import main.java.Main;
import org.junit.Test;
import java.io.File;
import java.util.*;
import java.io.FileNotFoundException;

public class TestMultLoadFunction {

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
    public void loadMult10() throws FileNotFoundException {
        int[] arr = inputArray("tests/load10.txt");
        long startTime, endTime;
        startTime = System.nanoTime();
        for (int i = 0; i < 100_000; i++) {
            Main._mult(arr);
        }
        endTime = System.nanoTime();
        System.out.println("Вычисление произведения из 10 эл-тов заняло: " + ((endTime - startTime) / 100_000) + " нс.");
    }

    @Test
    public void loadMult100() throws FileNotFoundException {
        int[] arr = inputArray("tests/load100.txt");
        long startTime, endTime;
        startTime = System.nanoTime();
        for (int i = 0; i < 100_000; i++) {
            Main._mult(arr);
        }
        endTime = System.nanoTime();
        System.out.println("Вычисление произведения из 100 эл-тов заняло: " + ((endTime - startTime) / 100_000) + " нс.");
    }

    @Test
    public void loadMult1000() throws FileNotFoundException {
        int[] arr = inputArray("tests/load1000.txt");
        long startTime, endTime;
        startTime = System.nanoTime();
        for (int i = 0; i < 100_000; i++) {
            Main._mult(arr);
        }
        endTime = System.nanoTime();
        System.out.println("Вычисление произведения из 1000 эл-тов заняло: " + ((endTime - startTime) / 100_000) + " нс.");
    }

    @Test
    public void loadMult10000() throws FileNotFoundException {
        int[] arr = inputArray("tests/load10000.txt");
        long startTime, endTime;
        startTime = System.nanoTime();
        for (int i = 0; i < 100_000; i++) {
            Main._mult(arr);
        }
        endTime = System.nanoTime();
        System.out.println("Вычисление произведения из 10000 эл-тов заняло: " + ((endTime - startTime) / 100_000) + " нс.");
    }

    @Test
    public void loadMult100_000() throws FileNotFoundException {
        int[] arr = inputArray("tests/load100_000.txt");
        long startTime, endTime;
        startTime = System.nanoTime();
        for (int i = 0; i < 100_000; i++) {
            Main._mult(arr);
        }
        endTime = System.nanoTime();
        System.out.println("Вычисление произведения из 100_000 эл-тов заняло: " + ((endTime - startTime) / 100_000) + " нс.");
    }

    @Test
    public void loadMult500_000() throws FileNotFoundException {
        int[] arr = inputArray("tests/load500_000.txt");
        long startTime, endTime;
        startTime = System.nanoTime();
        for (int i = 0; i < 100_000; i++) {
            Main._mult(arr);
        }
        endTime = System.nanoTime();
        System.out.println("Вычисление произведения из 500_000 эл-тов заняло: " + ((endTime - startTime) / 100_000) + " нс.");
    }

    @Test
    public void loadMult1_000_000() throws FileNotFoundException {
        int[] arr = inputArray("tests/load1_000_000.txt");
        long startTime, endTime;
        startTime = System.nanoTime();
        for (int i = 0; i < 100_000; i++) {
            Main._mult(arr);
        }
        endTime = System.nanoTime();
        System.out.println("Вычисление произведения из 1_000_000 эл-тов заняло: " + ((endTime - startTime) / 100_000) + " нс.");
    }
}
