package com.test;

/* Type promotion example for method overriding */

class Ov
{
    void sum(int a,float b)
    {
        System.out.println(a+b);
    }
}

class c extends Ov
{
    @Override
    void sum(int a,float b)
    {
        System.out.println(a-b);
    }
}

class mainclass
{
    public static void main(String args[])
    {
        Ov obj=new Ov();
        obj.sum(20,20);
        Ov obj1 =new c();
        obj1.sum(20,40);

    }
}