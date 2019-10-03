package uz.bilet.jd.core;

import java.util.ArrayList;
import java.util.List;

public class ForLoopMain {
    public static void main(String[] args) {
        // for expression
        System.out.println("for loop level 1");
        int[] numbers = {1, -5, 6, 8, -4, 6, -9, 5, 2, -15};
        for (int i = 0; i < numbers.length; i++) {
            boolean positive = true;
            if (numbers[i] < 0) {
                positive = false;
            }
            if (!positive) {
                System.out.println("Negative number found: " + numbers[i]);
            }
        }

        //for each expression
        System.out.println("\nfor loop level 2");
        List<String> names = new ArrayList<>();
        names.add("Kamoliddin");
        names.add("Ilhom");
        names.add("Sharofiddin");
        names.add("Shamshod");

        for (String name : names) {
            System.out.println(name);
        }
    }
}
