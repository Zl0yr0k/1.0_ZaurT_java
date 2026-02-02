package Arrays;

public class SortArrays {

    static void toString(int[] array) {
        for (int number:array) {
            System.out.print(number);
        }
        System.out.println();
    }
    static void toString(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println();
    }

    static void getInsertionSort(int[] array) {

        long time = System.currentTimeMillis();
        for (int left = 1; left < array.length; left++) {
            int key = array[left];
            int j = left - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
        System.out.println(System.currentTimeMillis()-time);
    }

    static void getSelectionSort(int[] array) {
        long time = System.currentTimeMillis();
        for (int i = 0; i < array.length - 1; i++) {
            int i_smallest = i;
            for (int j = i +1; j < array.length; j++) {
                if (array[j] < array[i_smallest]) {
                    i_smallest = j;
                }
            }
            int tmp = i_smallest;
            array[i_smallest] = array[i];
            array[i] = tmp;
        }
        System.out.println(System.currentTimeMillis()-time);
    }


}

