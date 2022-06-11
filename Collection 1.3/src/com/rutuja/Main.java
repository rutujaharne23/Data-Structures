package com.rutuja;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        // How to Iterate
        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        // for loop
        for(int i = 0; i < list.size(); i++){
            System.out.println("For: " + list.get(i));
        }

        // foreach loop
        for (Integer element: list) {
            System.out.println("Foreach: " + element);
        }

        // Iterator
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()){
            System.out.println("Iterator: " + it.next());
        }
    }
}
