package program.jav.collection;

import java.util.*;

public class IteratorExample {

    public static void main(String[] args) {
        List<String> locationsList = new ArrayList<String>();

        locationsList.add("Chennai");
        locationsList.add("Mumbai");
        locationsList.add("Hyderabad");
        locationsList.add("Lucknow");
        locationsList.add("Bangaluru");

        System.out.println("List is : " + locationsList);

        System.out.println("Printing list items using Iterator");

        ListIterator<String> li = locationsList.listIterator();

        while (li.hasNext()) {
            System.out.println(li.next());
        }
    }
}