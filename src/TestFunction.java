import static org.junit.Assert.*;
import org.junit.Test;
import java.io.File;
import java.util.*;
import java.io.FileNotFoundException;

public class TestFunction {

    //reading file function
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

    //first file
    @Test
    public void testMax1() throws FileNotFoundException {
        int[] arr = inputArray("tests/test1.txt");
        assertEquals(5, Main._max(arr));
    }
    @Test
    public void testMin1() throws FileNotFoundException {
        int[] arr = inputArray("tests/test1.txt");
        assertEquals(1, Main._min(arr));
    }
    @Test
    public void testSum1() throws FileNotFoundException {
        int[] arr = inputArray("tests/test1.txt");
        assertEquals(15, Main._sum(arr));
    }
    @Test
    public void testMult1() throws FileNotFoundException {
        int[] arr = inputArray("tests/test1.txt");
        assertEquals(120, Main._mult(arr));
    }

    //second file
    @Test
    public void testMax2() throws FileNotFoundException {
        int[] arr = inputArray("tests/test2.txt");
        assertEquals(9, Main._max(arr));
    }
    @Test
    public void testMin2() throws FileNotFoundException {
        int[] arr = inputArray("tests/test2.txt");
        assertEquals(-9, Main._min(arr));
    }
    @Test
    public void testSum2() throws FileNotFoundException {
        int[] arr = inputArray("tests/test2.txt");
        assertEquals(24, Main._sum(arr));
    }
    @Test
    public void testMult2() throws FileNotFoundException {
        int[] arr = inputArray("tests/test2.txt");
        assertEquals(3919104, Main._mult(arr));
    }

    //third file
    @Test
    public void testMax3() throws FileNotFoundException {
        int[] arr = inputArray("tests/test3.txt");
        assertEquals(35, Main._max(arr));
    }
    @Test
    public void testMin3() throws FileNotFoundException {
        int[] arr = inputArray("tests/test3.txt");
        assertEquals(-10, Main._min(arr));
    }
    @Test
    public void testSum3() throws FileNotFoundException {
        int[] arr = inputArray("tests/test3.txt");
        assertEquals(154, Main._sum(arr));
    }
    @Test
    public void testMult3() throws FileNotFoundException {
        int[] arr = inputArray("tests/test3.txt");
        Exception e = assertThrows(ArithmeticException.class, () -> {Main._mult(arr);});
        assertTrue(e.getMessage().contains("Переполнение при вычислении произведения"));
    }

    //file for int overflowing test
    @Test
    public void testSum4() throws FileNotFoundException {
        int[] arr = inputArray("tests/test4.txt");
        Exception e = assertThrows(ArithmeticException.class, () -> {Main._sum(arr);});
        assertTrue(e.getMessage().contains("Переполнение при вычислении суммы"));
    }
    @Test
    public void testMult4() throws FileNotFoundException {
        int[] arr = inputArray("tests/test4.txt");
        Exception e = assertThrows(ArithmeticException.class, () -> {Main._mult(arr);});
        assertTrue(e.getMessage().contains("Переполнение при вычислении произведения"));
    }

    //fifth file
    @Test
    public void testMax4() throws FileNotFoundException {
        int[] arr = inputArray("tests/test5.txt");
        assertEquals(1488, Main._max(arr));
    }
    @Test
    public void testMin4() throws FileNotFoundException {
        int[] arr = inputArray("tests/test5.txt");
        assertEquals(-7, Main._min(arr));
    }
    @Test
    public void testSum5() throws FileNotFoundException {
        int[] arr = inputArray("tests/test5.txt");
        assertEquals(3653, Main._sum(arr));
    }
    @Test
    public void testMult5() throws FileNotFoundException {
        int[] arr = inputArray("tests/test5.txt");
        assertEquals(0, Main._mult(arr));
    }

    //sixth file
    @Test
    public void testMax5() throws FileNotFoundException {
        int[] arr = inputArray("tests/test6.txt");
        assertEquals(300, Main._max(arr));
    }
    @Test
    public void testMin5() throws FileNotFoundException {
        int[] arr = inputArray("tests/test6.txt");
        assertEquals(-98, Main._min(arr));
    }
    @Test
    public void testSum6() throws FileNotFoundException {
        int[] arr = inputArray("tests/test6.txt");
        assertEquals(1576, Main._sum(arr));
    }
    @Test
    public void testMult6() throws FileNotFoundException {
        int[] arr = inputArray("tests/test6.txt");
        assertEquals(0, Main._mult(arr));
    }
}
