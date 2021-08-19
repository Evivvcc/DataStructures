package test;

import static org.junit.Assert.*;

public class SortTest {
    /**
     * Test the Sort.sort method
     */
    public static void sortTest() {
        String[] input = {"i", "have", "an", "egg"};
        String[] expected = {"an", "egg", "have", "i"};

        Sort.sort(input);

        assertArrayEquals(expected, input);

        for (int i = 0; i < input.length; i++) {
            System.out.println(input[i]);
        }
    }

    /**
     * Test the Sort.findSmallest method
     */
    public static void findSmallestTest() {
        String[] input = {"i", "have", "an", "egg"};
        int expected = 2;

//        int actual =  Sort.findSmallest(input);

//        assertEquals(expected,actual);
    }

    /**
     * Test the swap method
     */
    public static void swapTest() {
        String[] input = {"i", "have", "an", "egg"};
        Sort.swap(input, 0, 3);
        for (int i = 0; i < input.length; i++) {
            System.out.println(input[i]);
        }
    }

    public static void main(String[] args) {
////        sortTest();
//        findSmallestTest();
//        swapTest();
        SortTest.sortTest();
    }
}
