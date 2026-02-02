package StringArgs;

import java.util.Arrays;

public class forEachVarArgs {
    public static void main(String[] args) {

        String[] arr1 = new String[]{"Ghbdtn", "ok", "Xnj nj tot"};
        String[] arr2 = new String[]{"Ghbdtn1", "Gjrf1", "ok"};
        String[] arr3 = new String[]{"ok", "Gjrf2", "Xnj nj tot2"};

        String[][] result = abc(arr1, arr2, arr3);
        System.out.println(Arrays.deepToString(result));


        String[] result2 = abcOneArray(arr1, arr2, arr3);
        System.out.println(Arrays.toString(result2));

        for (String s : args) {
            for (int i =0; i < result2.length; i++) {
                if (result2[i].equals(s)) {
                    result2[i] = null;
                }
            }
        }
        System.out.println(Arrays.toString(result2));



    }

    static private String[][] abc(String[]... string) {

        String[][] array = new String[string.length][];
        for (int i = 0; i < string.length; i++) {
            array[i] = new String[]{Arrays.toString(string[i])};
        }
        for (String[] arr1 : array) {
            for (String arr2 : arr1) {
                System.out.println(arr2.concat(" "));
            }
        }
       return array;
    }

    static private String[] abcOneArray(String[]... string1) {
        int index = 0;
        int ind = 0;
        for (String[] len : string1) {
            index += len.length;
        }
        String[] array = new String[index];

        for (int i = 0; i < string1.length; i++) {
            for (int j =0; j < string1[i].length; j++) {
                array[(ind++)] = string1[i][j];
            }

        }
        return array;
    }
}
