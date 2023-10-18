package com.ensa.projects.oop.B;

public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> first = new MyArrayList<>();
        int acc = 0;

        first.add(2);
        first.add(5);
        first.add(6);
        first.add(-2);

        for(int i = 0; i < first.getSize(); i++){
            acc += first.get(i);
        }

        System.out.println("Accumulated sum : " + acc);

        MyArrayList<String> second = new MyArrayList<>();
        String conc = "";

        second.add("Hello");
        second.add(", ");
        second.add("World");
        second.add("!");

        for(int i = 0; i < second.getSize(); i++){
            conc += second.get(i);
        }
        System.out.println("Sequence : " + conc);
    }
}
