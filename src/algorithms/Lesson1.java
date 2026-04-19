package algorithms;

import java.util.Arrays;

public class Lesson1 {
    static void main() {
        int [] numbers = new int[] {5,67,3,89,45,90,3,47,34};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers[numbers.length - 1]);
    }
}
