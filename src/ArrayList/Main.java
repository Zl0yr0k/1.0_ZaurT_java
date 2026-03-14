package ArrayList;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] array = new String[]{"privet", "ok", "poka", "hello", "hello"};
        System.out.println(abc(array));
        abc2(array);


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

    private static  ArrayList <String> abc2 (String ... string) {
       ArrayList <String> result = new ArrayList<>();
        for (String s : string) {
            if (!result.contains(s)){
                result.add(s);
            }
        }
        Collections.sort(result);
        System.out.println(result);
        return result;
    }
}
