package com.ensa.projects.oop.A;

public class Utils {
    public static int add(int i, int j) {
        return i + j;
    }

    public static int compare(int i, int j) {
        return i - j;
    }

    public static int compare(String s1, String s2) {
        if (s2.equals(s1)) return 0;
        return s2.length() - s1.length();
    }

    public static <T extends Additionable<T>> T add(T i, T j) {
        return i.add(j);
    }

    public static <T extends Comparable<T>> int compare(T i, T j) {
        return i.compareTo(j);
    }
    public static <T extends Cloneable> T clone(T object) {
        return null;
    }

    public static <T extends Stockable> T store(T object) {
        return null;
    }

    public static <T extends Envoyable> T send(T object) {
        return null;
    }

    public static <T extends Testable> T test(T object) {
        return null;
    }
}

interface Additionable<T> {
    T add(T other);
}

interface Stockable {
}

interface Envoyable {
}

interface Testable {
}
