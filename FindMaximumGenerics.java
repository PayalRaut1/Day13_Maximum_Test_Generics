package com.bridgelabz;

public class FindMaximumGenerics<T extends Comparable<T>>
{
    T x;
    T y;
    T z;

    FindMaximumGenerics(T x, T y, T z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public T maximum (){

        if (x.compareTo(y) > 0) {
            return x;
        } else if (y.compareTo(z) > 0) {
            return y;
        }else{
            return z;
        }
    }

    public static void main(String[] args) {
        FindMaximumGenerics Integer = new FindMaximumGenerics(10, 20, 30);
        System.out.println("Maximum number out of three integers is: " + Integer.maximum());

        FindMaximumGenerics Float = new FindMaximumGenerics(3.5f, 6.5f, 9.5f);
        System.out.println("Maximum number out of three float is: "    +  Float.maximum());

        FindMaximumGenerics String = new FindMaximumGenerics("Apple", "Peach", "Banana");
        System.out.println("Maximum number out of three string is: "   +  String.maximum());
    }
}
