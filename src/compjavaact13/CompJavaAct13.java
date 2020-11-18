/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compjavaact13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import static java.util.Comparator.comparing;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author hgarz
 * 
 */

public class CompJavaAct13 {

    
    public static void main(String... comparator) {
        List<String> list1 = new ArrayList<String>();
        list1.add("Mango");   
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Grapes");
        list1.add("Lemon");   
        list1.add("Figs");
        list1.add("Cherimoya");
        list1.add("Blueberries");
        list1.add("Avocado");   
        list1.add("Kiwi");
        
        List<Fruit> list2 = new ArrayList<Fruit>();
        list2.add(new Fruit(1, "Mango"));
        list2.add(new Fruit(2, "Apple"));
        list2.add(new Fruit(3, "Banana"));
        list2.add(new Fruit(4, "Grapes"));
        list2.add(new Fruit(5, "Lemon"));
        list2.add(new Fruit(6, "Figs"));
        list2.add(new Fruit(7, "Cherimoya"));
        list2.add(new Fruit(8, "Blueberries"));
        list2.add(new Fruit(9, "Avocado"));
        list2.add(new Fruit(10, "Kiwi"));
        
        
        //Anon
        Collections.sort(list1, new Comparator<String>() {
            @Override
            public int compare(String fruit1, String fruit2) {
                return fruit1.compareTo(fruit2);
            }
        });
        Collections.sort(list1, (m1, m2) -> m1.compareTo(m2));
        Collections.sort(list1, Comparator.naturalOrder());
        System.out.println("Anon Alphabetical Sort:");
        list1.forEach((d) -> System.out.println(d));
        
        Collections.sort(list1, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        System.out.println("\n");
        System.out.println("Anon Sort by Length:");
        list1.forEach((d) -> System.out.println(d));

        //lambda
        System.out.println("\n");
        System.out.println("Lambda Sort by Length:");
        list1.sort((String o1, String o2) -> o1.length() - o2.length());
        list1.forEach((d) -> System.out.println(d));
        System.out.println("\n");
        System.out.println("Lambda Alphabetical Sort:");
        list1.sort((p1, p2) -> p1.compareTo(p2));
        list1.forEach((d) -> System.out.println(d));
        
        //ref
        System.out.println("\n");
        System.out.println("Method Reference Alphabetical Sort:");
        list2.sort(comparing(Fruit::getName));
        list1.forEach((d) -> System.out.println(d));
        
        System.out.println("\n");
        System.out.println("Method Sort by Length:");
        //???
    }
    
    
}
