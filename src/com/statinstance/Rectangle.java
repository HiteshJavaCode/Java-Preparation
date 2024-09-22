package com.statinstance;

public class Rectangle {
    public double length;
    public double width;

    public Rectangle(double length, double width)
    {
        this.length=length;
        this.width=width;
    }

    public double area()
    {
        return length*width;
    }

    public static void main(String[] args)
    {
        Rectangle o1 = new Rectangle(10.1,10.1);
        System.out.println("Area of first rectangle is" + o1.area());
        Rectangle o2 = new Rectangle(2,2);
        System.out.println("Area of first rectangle is" + o2.area());
    }

}
