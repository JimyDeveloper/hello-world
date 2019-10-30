package uz.bilet.jd.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WhileLoopMain {

    public static void main(String[] args) {
        //while expression simple
        System.out.println("while loop level 1");
        int a = 5;
        while (a > 0) {
            System.out.println("counting at: " + a);
            a--;
        }

        //while expression with iterator
        System.out.println("\nwhile loop level 2");
        List<String> fruits = new ArrayList<>();
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Cheer");
        fruits.add("Apple");
        fruits.add("Orange");

        Iterator<String> fruitIter = fruits.iterator();
        while (fruitIter.hasNext()) {
            System.out.println(fruitIter.next());
        }

        //while(true) expression
        System.out.println("\nwhile loop level 3");
        while (true) {
            System.out.println("Processing..");
            try {
                Thread.sleep(10 * 1000);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
                System.exit(0);
            }
        }
    }
}