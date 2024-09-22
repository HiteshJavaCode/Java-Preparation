package com.statinstance;

public class Counter {
    public static int count;
    public static void increment(int callNumber)
    {
        count = ++count;
        System.out.println("Count value after callNumber ->" + callNumber + " is " + count);
    }
    public static void main(String[] Args)
    {
        increment(1);
        increment(2);
        increment(3);
        increment(4);
    }
}
