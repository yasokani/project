package program.jav.collection;

import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<String>();
        
        System.out.println("Enter the input Strings to be added in TreeSet");
        
        Scanner input = new Scanner(System.in); // comnnad line to take user input
        String s1 = input.nextLine();
        String s2 = input.nextLine();
        String s3 = input.nextLine();
        String s4 = input.nextLine();
        
        
        treeSet.add(s1);
        treeSet.add(s2);
        treeSet.add(s3);
        treeSet.add(s4);
        
        System.out.println("TreeSet is : " + treeSet);
        System.out.println("Check if TreeSet is empty : " + treeSet.isEmpty());
        
        System.out.println(treeSet.contains("Innddd"));
        
        treeSet.remove(s2);
        System.out.println("After removing element : " + s2 + " TreeSet is : " + treeSet);
    }
}