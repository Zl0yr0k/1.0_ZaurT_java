package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        String[] array = new String[]{"privet", "ok", "poka", "hello", "hello"};
        System.out.println(abc(array));


    }

    private static ArrayList <String> abc(String... string) {
        ArrayList<String> result = new ArrayList<>(Arrays.asList(string));
        String element;

        for (int i = 0; i < result.size(); i++) {
            element = result.get(i);
            for (int j = i + 1; j < result.size(); j++) {
                if (element.equals(result.get(j))) {
                    result.remove(j);
                    j--;
                }
            }
        }
        Collections.sort(result);
        System.out.println();

        return result;
    }
}
