package ro.ulbs.paradigme.lab4.util;

import java.util.*;


class ListOperations {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> x = new ArrayList<>();
        List<Integer> y = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            x.add(random.nextInt(11));
        }
        for (int i = 0; i < 7; i++) {
            y.add(random.nextInt(11));
        }
        Collections.sort(x);
        Collections.sort(y);
        List<Integer> uniunea = new ArrayList<>(x);
        uniunea.addAll(y);
        Collections.sort(uniunea);
        Set<Integer> intersectie = new TreeSet<>(x);
        intersectie.retainAll(y);
        List<Integer> diferenta = new ArrayList<>(x);
        diferenta.removeAll(y);
        int p = 4;
        List<Integer> depasire = new ArrayList<>();
        for (int num : uniunea) {
            if (num <= p) {
                depasire.add(num);
            }
        }
        System.out.println("Lista x: " + x);
        System.out.println("Lista y: " + y);
        System.out.println("Uniunea: " + uniunea);
        System.out.println("Intersecția: " + intersectie);
        System.out.println("Diferența: " + diferenta);
        System.out.println("Elemente ≤ " + p + " (xPlusYLimitedByP): " + depasire);
    }
}
