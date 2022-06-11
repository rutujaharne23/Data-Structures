package com.rutuja;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        ArrayList<String> student = new ArrayList<>();

        student.add("Anup");
        student.add("Rutuja");
        student.add("Anurag");
        student.add("Pallavi");
        student.add("Diwakar");

        System.out.println(student);

        student.remove(2);
        System.out.println(student);

        student.add("Rekha");
        student.add("Swati");

        System.out.println(student);

        student.add(3, "Anurag");
        System.out.println(student);

        System.out.println(student.contains("Pallavi"));

        student.set(4, "Ketki");
        System.out.println(student);

        student.clear();
        System.out.println(student);
    }
}
