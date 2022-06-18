package com.bridgelabz;

public class Generic {
    public static int maximum(Integer x, Integer y, Integer z) {
        Integer max = x;
        if (y.compareTo(max) > 0)
            max =y;
        if (z.compareTo(max) > 0)
            max = z;
        return max;
    }
    public static float floatMaximum(Float x, Float y, Float z) {
        Float max = x;
        if (y.compareTo(max) > 0 )
            max = y;
        if (z.compareTo(max) > 0)
            max = z;
        return max;
    }
    public static String stringMaximum(String x, String y, String z) {
        String max = x;
        if (y.compareTo(max) > 0)
            max = y;
        if (z.compareTo(max) > 0)
            max = z;
        return max;
    }
    public static void main(String[] args) {

        System.out.println(maximum(10,20,30));
        System.out.println(floatMaximum(3.5f, 6.5f, 9.5f));
        System.out.println(stringMaximum("Apple", "Peach", "Banana"));
    }
}
