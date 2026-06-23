package algorithms;

public class BinarySearch {
    public static int binarySearch (int[] numberArray, int searchNumber) {

        int left = 0;
        int right = numberArray.length - 1;
        int middle = (left + right) / 2;

        while (left <= right){
            if (numberArray[middle] < searchNumber) {
                left = middle + 1;
            } else if (numberArray[middle] > searchNumber) {
                right = middle - 1;
            } else {
                return middle;
            }
    }

        return -1;
    }

}
