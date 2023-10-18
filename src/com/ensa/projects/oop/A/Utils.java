package com.ensa.projects.oop.A;

public class Utils {
    static int add(int i, int j) {
        return i + j;
    }

    static int compare(int i, int j) {
        return i - j;
    }

    static int compare(String s1, String s2) {
        if (s2.equals(s1)) return 0;
        return s2.length() - s1.length();
    }
}