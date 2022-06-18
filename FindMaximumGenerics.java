package com.bridgelabz;

public class FindMaximumGenerics {
    public static <T extends Comparable<T>> T maximum (T x, T y, T z ){
        T max =x;      //assume x is max
        if (y.compareTo(max) > 0)
            max = y;
        if (z.compareTo(max) > 0)
            max = z;
        return max;
    }

    public static void main(String[] args) {

        System.out.println(maximum(10,20,30));
        System.out.println(maximum(3.5f, 6.5f, 9.5f));
        System.out.println(maximum("Apple", "Peach", "Banana"));
    }
}

