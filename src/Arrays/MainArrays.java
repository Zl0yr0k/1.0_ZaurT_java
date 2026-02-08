package Arrays;

import java.util.Arrays;

public class MainArrays {
    public static void main(String[] args) {
        int [] array1 = {4,8,10,-2,6,9,3,2,-3,0};
        int [] array2 = {4,8,10,-2,6,9,3,2,-3,0};
        int [] array4 = {4,8,10,-2,6,9,3,2,-3,0};
        SortArrays.toString(array1);
        SortArrays.getInsertionSort(array1);
        SortArrays.toString(array1);
        SortArrays.toString(array2);
        SortArrays.getInsertionSort(array2);
        SortArrays.toString(array2);

        String[] array3 = {"Привет ", "Чтоб ", "жизнь ", "прожить ","знать ","надобно ", "не мало"};
        SortArrays.toString(array3);

        Arrays.sort(array4);
        SortArrays.toString(array4);

        int index1 = Arrays.binarySearch(array4, 12);
        System.out.println(index1);
        System.out.println(array4[8]);



    }
}
