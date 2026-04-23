package algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lesson1 {
    static void main() {
        int[] numbers = new int[]{5, 67, 3, 89, 45, 90, 3, 47, 34};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers[numbers.length - 1]);

        int maxAge = 0;
        for (int i = 0; i < numbers.length; i++) {
            int valueAge = numbers[i];
            maxAge = Math.max(maxAge, valueAge);
        }
        System.out.println(maxAge);

        System.out.println(Arrays.toString(getMaxSign(numbers, 8)));

        writePhoneNumber();
    }

    private static int[] getMaxSign(int[] ages, int topMaxSign) {
        int[] arrayTopMaxSign = new int[topMaxSign];
        Integer previousMax = Integer.MAX_VALUE;
        for (int i = 0; i < topMaxSign; i++) {
            arrayTopMaxSign[i] = getMax(ages, previousMax);
            previousMax = arrayTopMaxSign[i];
        }
        return arrayTopMaxSign;
    }

    private static int getMax(int[] ages, int maxAge) {
        Integer currentMax = Integer.MIN_VALUE;

        for (int i = 0; i < ages.length; i++) {
            if (ages[i] < maxAge) {
                currentMax = Math.max(ages[i], currentMax);
            }
        }
        return currentMax;
    }

    private static void writePhoneNumber () {
        long [] phoneNumbers = new long[] {89182349078L,81992346745L,78982345687L,78982345687L};
        List<Long> notePhoneNumbers = new ArrayList<>();
        boolean alreadyExists = false;
        for (long phone : phoneNumbers) {
            for (long noteNumber : notePhoneNumbers) {
                if (phone == noteNumber) {
                    alreadyExists = true;                }
            }
            if (alreadyExists == false) {

                notePhoneNumbers.add(phone);
            }
        }
        System.out.println(notePhoneNumbers);
    }
}
