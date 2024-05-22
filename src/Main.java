import org.junit.Test;
import java.util.*;
import java.io.File;

public class Main {

    public static int _min(int[] arr) {
        try {
            int min = Integer.MAX_VALUE;
            for (int num : arr) {
                if (num < min) min = num;
            }
            return min;
        } catch (Exception e) {
            throw new ArithmeticException("Ошибка при поиске минимального значения: " + e.getMessage());
        }
    }

    public static int _max(int[] arr) {
        try {
            int max = Integer.MIN_VALUE;
            for (int num : arr) {
                if (num > max) max = num;
            }
            return max;
        } catch (Exception e) {
            throw new ArithmeticException("Ошибка при поиске максимального значения: " + e.getMessage());
        }
    }

    public static int _sum(int[] arr) {
        try {
            int sum = 0;
            for (int num : arr) {
                sum = Math.addExact(sum, num);
            }
            return sum;
        } catch (Exception e) {
            throw new ArithmeticException("Переполнение при вычислении суммы: " + e.getMessage());
        }
    }

    public static int _mult(int[] arr) {
        try {
            int mult = 1;
            for (int num : arr) {
                mult = Math.multiplyExact(mult, num);
            }
            return mult;
        } catch (Exception e) {
            throw new ArithmeticException("Переполнение при вычислении произведения: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        org.junit.runner.JUnitCore.main("TestFunction");
    }
}