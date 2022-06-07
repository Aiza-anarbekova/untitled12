package com.compan;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set<Integer> set=new HashSet<Integer>(List.of(0,1,2));
        Set<Integer> sett=new HashSet<Integer>(List.of(1,2,3));

        System.out.println(difference(set, sett));


    }

    public static Set<Integer> difference(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> hashSet=new HashSet<>(set1);
        hashSet.removeAll(set2);
        set2.removeAll(set1);
        hashSet.addAll(set2);

        return hashSet;

    }
}