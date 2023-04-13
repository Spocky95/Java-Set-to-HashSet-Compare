package org.example;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        HashSet<Integer> hashSet = new HashSet<>();

        // Dodawanie elementów do Set i HashSet
        long startTime = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            set.add(i);
        }
        long endTime = System.nanoTime();
        long setTime = endTime - startTime;

        startTime = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            hashSet.add(i);
        }
        endTime = System.nanoTime();
        long hashSetTime = endTime - startTime;

        // Usuwanie elementów z Set i HashSet
        startTime = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            set.remove(i);
        }
        endTime = System.nanoTime();
        long removeSetTime = endTime - startTime;

        startTime = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            hashSet.remove(i);
        }
        endTime = System.nanoTime();
        long removeHashSetTime = endTime - startTime;

        // Wyszukiwanie elementów w Set i HashSet
        startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            set.contains(i);
        }
        endTime = System.nanoTime();
        long containsSetTime = endTime - startTime;

        startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            hashSet.contains(i);
        }
        endTime = System.nanoTime();
        long containsHashSetTime = endTime - startTime;

        System.out.println(String.format("Czas dodawania do Set: %,d", setTime));
        System.out.println(String.format("Czas dodawania do HashSet: %,d", hashSetTime));
        System.out.println(String.format("Czas usuwania z Set: %,d", removeSetTime));
        System.out.println(String.format("Czas usuwania z HashSet: %,d", removeHashSetTime));
        System.out.println(String.format("Czas wyszukiwania w Set: %,d", containsSetTime));
        System.out.println(String.format("Czas wyszukiwania w HashSet: %,d", containsHashSetTime));
    }
}
