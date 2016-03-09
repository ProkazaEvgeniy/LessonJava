package _1_hw_List;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 14.02.2016.
 */
public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("two");
        list.add("one");
        System.out.println("is empty? " + "'" + list.isEmpty() + "'");
        System.out.println("hash code is " + "'" + list.hashCode() + "'");
        System.out.println("size array list is " + "'" + list.size() + "'");
        System.out.println("index array for number 3 is " + "'" + list.get(2) + "'");

        List<String> arr = new ArrayList<>();
        arr.add("one");
        arr.add("four");
        arr.add("three");
        arr.add("two");
        System.out.println("\n");
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println("\n");
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr + " ");
        }
        for (String e : list) {
            System.out.println(e);
        }
        for (String e : arr) {
            System.out.println(e);
        }
        System.out.println("\n");
        String[] arr1 = new String[]{"one", "two", "three", "four"};
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]);
        }
    }
}
