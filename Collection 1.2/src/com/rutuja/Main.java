package com.rutuja;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        ArrayList<Integer> newList = new ArrayList<>();

        newList.add(32);
        newList.add(24);
        newList.add(41);
        newList.add(11);
        newList.add(5);

        System.out.println(newList);

        newList.add(11);
        newList.add(73);
        newList.add(67);

        System.out.println(newList);

        newList.add(4, 51);
        System.out.println(newList);

        List<Integer> list = new ArrayList<>();

        list.add(120);
        list.add(143);
        list.add(185);

        newList.addAll(list);
        System.out.println(newList);

        System.out.println(list.get(2));

        newList.remove(8);
        System.out.println(newList);

        newList.remove(Integer.valueOf(11));
        System.out.println(newList);

        newList.set(3, 1000);
        System.out.println(newList);

        System.out.println(newList.contains(73));
    }
}
